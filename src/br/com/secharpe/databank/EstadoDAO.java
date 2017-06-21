/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.secharpe.databank;

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
public class EstadoDAO {

    Log log = new Log();

    public void delete(Estados estado) {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "delete from estados where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, estado.getCodigo());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            log.put("ControleEstadoBanco", "delete", exceptionAsString);

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                    sw = new StringWriter();
                    e.printStackTrace(new PrintWriter(sw));
                    exceptionAsString = sw.toString();
                    log.put("ControleEstadoBanco", "delete", exceptionAsString);
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

    public void insert(Estados estado) {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "INSERT INTO estados (nome, sigla) VALUES (?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, estado.getNome());
            ps.setString(2, estado.getSigla());

            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            log.put("ControleEstadoBanco", "insert", exceptionAsString);

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                    ex.printStackTrace(new PrintWriter(sw));
                    exceptionAsString = sw.toString();
                    log.put("ControleEstadoBanco", "insert", exceptionAsString);
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

    public List<Estados> getAll() {
        List<Estados> lista = new ArrayList<Estados>();
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "select id, nome, sigla from estados";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer codigo = rs.getInt(1);
                String nome = rs.getString(2);
                String sigla = rs.getString(3);
                
                

                Estados est = new Estados();

               
                est.setNome(nome);
                est.setSigla(sigla);
                est.setCodigo(codigo);
                

                
                lista.add(est);
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            log.put("ControleEstadoBanco", "getAll", exceptionAsString);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                    StringWriter sw = new StringWriter();
                    ex.printStackTrace(new PrintWriter(sw));
                    String exceptionAsString = sw.toString();
                    log.put("ControleEstadoBanco", "getAll", exceptionAsString);
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
                    log.put("ControleEstadoBanco", "getAll", exceptionAsString);
                }
            }
        }
        return lista;
    }
}
