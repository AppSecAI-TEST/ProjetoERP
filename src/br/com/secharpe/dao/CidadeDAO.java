/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.secharpe.dao;

import br.com.secharpe.exception.SistemaException;
import br.com.secharpe.model.Cidades;
import br.com.secharpe.model.Estados;
import br.com.secharpe.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LuizAlexandre17 <luizalexandre17@unesc.net>
 */
public class CidadeDAO {

    Log log = new Log();

    public void delete(String nome) {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "delete from cidades where nome= ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, nome);
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            log.put("ControleCidadeBanco", "delete", exceptionAsString);

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                    sw = new StringWriter();
                    e.printStackTrace(new PrintWriter(sw));
                    exceptionAsString = sw.toString();
                    log.put("ControleCidadeBanco", "delete", exceptionAsString);
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void insert(Cidades cidade) throws SistemaException {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        int estadoID = getEstadoID(cidade.getEstado().getSigla());

        try {
            conn = Connection.getConnection();

            String sql = "insert into cidades (nome, id_estado) values(?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cidade.getNome());
            ps.setInt(2, estadoID);
            ps.execute();
            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO1: " + e.getMessage());
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            log.put("ControleCidadeBanco", "insert", exceptionAsString);

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO2: " + ex.getMessage());
                    ex.printStackTrace(new PrintWriter(sw));
                    exceptionAsString = sw.toString();
                    log.put("ControleCidadeBanco", "insert", exceptionAsString);
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO3: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO4: " + ex.getMessage());
                }
            }
        }
    }

    public int getEstadoID(String sigla) {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        System.out.println(sigla);
        int id = 0;
        try {
            conn = Connection.getConnection();
            String sql = "select id from estados where sigla = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, sigla);

            ResultSet rs = ps.executeQuery();
            System.out.println(rs.next());

            id = rs.getInt("id");
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            log.put("ControleCidadeBanco", "getAll", exceptionAsString);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                    StringWriter sw = new StringWriter();
                    ex.printStackTrace(new PrintWriter(sw));
                    String exceptionAsString = sw.toString();
                    log.put("ControleCidadeBanco", "getAll", exceptionAsString);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                    StringWriter sw = new StringWriter();
                    ex.printStackTrace(new PrintWriter(sw));
                    String exceptionAsString = sw.toString();
                    log.put("ControleCidadeBanco", "getAll", exceptionAsString);
                }
            }
        }
        return id;
    }

    public List<Cidades> getAll() {
        List<Cidades> lista = new ArrayList<Cidades>();
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "SELECT c.id, c.nome, e.id, e.nome, e.sigla FROM cidades as c INNER JOIN estados as e ON (c.id_estado= e.id)";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            do {
                Cidades c = new Cidades();
                c.setCodigo(rs.getInt(1));
                c.setNome(rs.getString(2));
                Estados e = new Estados();
                e.setCodigo(rs.getInt(3));
                e.setNome(rs.getString(4));
                e.setSigla(rs.getString(5));
                c.setEstado(e);

                lista.add(c);
            } while (rs.next());
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            log.put("ControleCidadeBanco", "getAll", exceptionAsString);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                    StringWriter sw = new StringWriter();
                    ex.printStackTrace(new PrintWriter(sw));
                    String exceptionAsString = sw.toString();
                    log.put("ControleCidadeBanco", "getAll", exceptionAsString);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                    StringWriter sw = new StringWriter();
                    ex.printStackTrace(new PrintWriter(sw));
                    String exceptionAsString = sw.toString();
                    log.put("ControleCidadeBanco", "getAll", exceptionAsString);
                }
            }
        }
        System.out.println(lista);
        return lista;
    }
}
