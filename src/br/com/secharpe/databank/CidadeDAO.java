/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.secharpe.databank;

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

    public void delete(Cidades cidade) {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "delete from cidades where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cidade.getCodigo());
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

    public void insert(Cidades cidade) {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "insert into cidades (codigo,nome,estado) values(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cidade.getCodigo());
            ps.setString(2, cidade.getNome());
            ps.setString(3, cidade.getEstado().getSigla().toString());

            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            log.put("ControleCidadeBanco", "insert", exceptionAsString);

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
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

    public List<Cidades> getAll() {
        List<Cidades> lista = new ArrayList<Cidades>();
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "select codigo,nome,estado from cidades";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer codigo = rs.getInt(1);
                String nome = rs.getString(2);
                String estado = rs.getString(3);
                
                Cidades cid = new Cidades();
               cid.setCodigo(codigo);
               cid.setNome(nome);
               //cid.setEstado(estado);
         
                lista.add(cid);
            }
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
        return lista;
    }
}
