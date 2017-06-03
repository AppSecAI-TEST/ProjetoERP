/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.secharpe.databank;

import br.com.secharpe.model.Produtos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.secharpe.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 *
 * @author LuizAlexandre17 <luizalexandreluz@unesc.net>
 */
public class ControleProdutoBanco {

    Log log = new Log();

    public void delete(Produtos produto) {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "delete from produtos where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, produto.getCodigo());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            log.put("ControleProdutoBanco", "delete", exceptionAsString);

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                    sw = new StringWriter();
                    e.printStackTrace(new PrintWriter(sw));
                    exceptionAsString = sw.toString();
                    log.put("ControleProdutoBanco", "delete", exceptionAsString);
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

    public void insert(Produtos produto) {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "insert into produtos (codigo,nome,descricao,estoqueatual,estoquemin,precocusto,precofinal,tipo,fabricante,unidade) values(?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, produto.getCodigo());
            ps.setString(2, produto.getNome());
            ps.setString(3, produto.getDescrição());
            ps.setInt(4, produto.getEstoqueAtual());
            ps.setInt(5, produto.getEstoqueMin());
            ps.setFloat(6, produto.getPreçoCusto());
            ps.setFloat(7, produto.getPreçoFinal());
            ps.setString(8, produto.getTipo());
            ps.setString(9, produto.getFabricante());
            ps.setString(9, produto.getUnidade());

            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
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

    public void update(Produtos produto) {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "update produtos set descricao = ? where codigo = ?";
            ps = conn.prepareStatement(sql);

            ps.setInt(2, produto.getCodigo());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            log.put("ControleProdutoBanco", "update", exceptionAsString);

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                    sw = new StringWriter();
                    e.printStackTrace(new PrintWriter(sw));
                    exceptionAsString = sw.toString();
                    log.put("ControleProdutoBanco", "update", exceptionAsString);
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                    StringWriter sw = new StringWriter();
                    ex.printStackTrace(new PrintWriter(sw));
                    String exceptionAsString = sw.toString();
                    log.put("ControleProdutoBanco", "update", exceptionAsString);
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
                    log.put("ControleProdutoBanco", "update", exceptionAsString);
                }
            }
        }
    }

    public List<Produtos> getAll() {
        List<Produtos> lista = new ArrayList<Produtos>();
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "select codigo, descricao from produtos";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer codigo = rs.getInt(1);
                String descricao = rs.getString(2);
                Produtos p = new Produtos();
                p.setCodigo(codigo);
                lista.add(p);
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            log.put("ControleProdutoBanco", "getAll", exceptionAsString);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                    StringWriter sw = new StringWriter();
                    ex.printStackTrace(new PrintWriter(sw));
                    String exceptionAsString = sw.toString();
                    log.put("ControleProdutoBanco", "getAll", exceptionAsString);
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
                    log.put("ControleProdutoBanco", "getAll", exceptionAsString);
                }
            }
        }
        return lista;
    }

    public Produtos getProduto(Integer codigo) {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "select codigo, descricao from produtos where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Integer cod = rs.getInt(1);
                String descricao = rs.getString(2);
                Produtos p = new Produtos();
                p.setCodigo(cod);
                return p;
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
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
        return null;
    }

}
