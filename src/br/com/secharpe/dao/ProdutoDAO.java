package br.com.secharpe.dao;

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
public class ProdutoDAO {

    private Log log = new Log();

    public void delete(int id) {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "delete from produtos where id = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
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
            String sql = "insert into produtos (id,nome,descricao,estoqueatual,estoquemin,precocusto,precofinal,tipo,fabricante,unidade,lucro) values(?,?,?,?,?,?,?,?,?,?,?)";
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
            ps.setString(10, produto.getUnidade());
            ps.setInt(11, produto.getLucro());

            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            log.put("ControleProdutoBanco", "insert", exceptionAsString);

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                    ex.printStackTrace(new PrintWriter(sw));
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
            String sql = "select codigo,nome,descricao,estoqueatual,estoquemin,precocusto,precofinal,tipo,fabricante,unidade,lucro from produtos";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Integer codigo = rs.getInt(1);
                String nome = rs.getString(2);
                String descricao = rs.getString(3);
                Integer estoqueat = rs.getInt(4);
                Integer estoquemin = rs.getInt(5);
                Float precocusto = rs.getFloat(6);
                Float precofinal = rs.getFloat(7);
                String tipo = rs.getString(8);
                String fabr = rs.getString(9);
                String un = rs.getString(10);
                Integer lucro = rs.getInt(11);

                Produtos p = new Produtos();

                p.setCodigo(codigo);
                p.setNome(nome);
                p.setDescrição(descricao);
                p.setEstoqueAtual(estoqueat);
                p.setEstoqueMin(estoquemin);
                p.setPreçoCusto(precocusto);
                p.setPreçoFinal(precofinal); //Futuramente aplicar lucro + preço Custo
                p.setFabricante(fabr);
                p.setUnidade(un);
                p.setTipo(tipo);
                p.setLucro(lucro);

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
            String sql = "select from produtos codigo,nome,descricao,estoqueatual,estoquemin,precocusto,precofinal,tipo,fabricante,unidade,lucro where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                String nome = rs.getString(2);
                String descricao = rs.getString(3);
                Integer estoqueat = rs.getInt(4);
                Integer estoquemin = rs.getInt(5);
                Float precocusto = rs.getFloat(6);
                Float precofinal = rs.getFloat(7);
                String tipo = rs.getString(8);
                String fabr = rs.getString(9);
                String un = rs.getString(10);
                Integer lucro = rs.getInt(11);

                Produtos p = new Produtos();

                p.setCodigo(codigo);
                p.setNome(nome);
                p.setDescrição(descricao);
                p.setEstoqueAtual(estoqueat);
                p.setEstoqueMin(estoquemin);
                p.setPreçoCusto(precocusto);
                p.setPreçoFinal(precofinal); //Futuramente aplicar lucro + preço Custo
                p.setFabricante(fabr);
                p.setUnidade(un);
                p.setTipo(tipo);
                p.setLucro(lucro);

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
