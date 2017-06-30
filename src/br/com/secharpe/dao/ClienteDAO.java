package br.com.secharpe.dao;

import br.com.secharpe.model.Clientes;
import br.com.secharpe.util.Log;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LuizAlexandre17 <luizalexandreluz@unesc.net>
 */
public class ClienteDAO {

    private Log log = new Log();

    public void delete(Clientes cliente) {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "delete from clientes where codigo = ?";
            ps = conn.prepareStatement(sql);

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

    public void insert(Clientes cliente) {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "insert into clientes (nome,email,cpf,rg,telefone,celular,estado,cidade,bairro,endereço,numero,complemento) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);

            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEmail());
            ps.setInt(3, cliente.getCpf());
            ps.setInt(4, cliente.getRg());
            ps.setInt(5, cliente.getTelefone());
            ps.setInt(6, cliente.getCelular());
            ps.setString(7, cliente.getEstado().toString());
            ps.setString(8, cliente.getCidade().toString());
            ps.setString(9, cliente.getBairro());
            ps.setString(10, cliente.getEndereco());
            ps.setInt(11, cliente.getNumero());
            ps.setString(12, cliente.getComplemento());

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

    public void update(Clientes cliente) {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "update clientes set nome = ?,email = ?,cpf = ?,rg = ?,telefone = ?,celular = ?,estado = ?,cidade = ?,bairro = ?,endereço = ?,numero = ?,complemento = ? where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEmail());
            ps.setInt(3, cliente.getCpf());
            ps.setInt(4, cliente.getRg());
            ps.setInt(5, cliente.getTelefone());
            ps.setInt(6, cliente.getCelular());
            ps.setString(7, cliente.getEstado().toString());
            ps.setString(8, cliente.getCidade().toString());
            ps.setString(9, cliente.getBairro());
            ps.setString(10, cliente.getEndereco());
            ps.setInt(11, cliente.getNumero());
            ps.setString(12, cliente.getComplemento());
            ps.setInt(13, cliente.getCodigo());
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

    public List<Clientes> getAll() {
        List<Clientes> lista = new ArrayList<Clientes>();
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "select codigo,nome,email,cpf,rg,telefone,celular,estado,cidade,bairro,endereço,numero,complemento from produtos";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Clientes c = new Clientes();
                Integer codigo = rs.getInt(1);
                String nome = rs.getString(2);
                String email = rs.getString(3);
                Integer cpf = rs.getInt(4);
                Integer rg = rs.getInt(5);
                Integer telefone = rs.getInt(6);
                Integer celular = rs.getInt(7);
                //Estado estado = 
                String cidade = rs.getString(9);
                String bairro = rs.getString(10);
                String endereço = rs.getString(11);
                Integer numero = rs.getInt(12);
                String Complemento = rs.getString(13);

                c.setCodigo(codigo);
                c.setNome(nome);
                c.setEmail(email);
                c.setRg(rg);
                c.setCpf(cpf);
                c.setTelefone(telefone);
                c.setCelular(celular);
                //c.setEstado()
                //c.setCidade()
                c.setBairro(bairro);
                c.setEndereco(endereço);
                c.setNumero(numero);
                c.setEndereco(endereço);

                lista.add(c);
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
        return lista;
    }

    public Clientes getCliente(Integer codigo) {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "select codigo,nome,email,cpf,rg,telefone,celular,estado,cidade,bairro,endereço,numero,complemento from produtos where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Clientes c = new Clientes();
                String nome = rs.getString(2);
                String email = rs.getString(3);
                Integer cpf = rs.getInt(4);
                Integer rg = rs.getInt(5);
                Integer telefone = rs.getInt(6);
                Integer celular = rs.getInt(7);
                //Estado estado = 
                String cidade = rs.getString(9);
                String bairro = rs.getString(10);
                String endereço = rs.getString(11);
                Integer numero = rs.getInt(12);
                String Complemento = rs.getString(13);

                c.setCodigo(codigo);
                c.setNome(nome);
                c.setEmail(email);
                c.setRg(rg);
                c.setCpf(cpf);
                c.setTelefone(telefone);
                c.setCelular(celular);
                //c.setEstado()
                //c.setCidade()
                c.setBairro(bairro);
                c.setEndereco(endereço);
                c.setNumero(numero);
                c.setEndereco(endereço);

                return c;
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
