package br.com.secharpe.dao;

import br.com.secharpe.exception.SistemaException;
import br.com.secharpe.model.Cidades;
import br.com.secharpe.model.Clientes;
import br.com.secharpe.model.Empresa;
import br.com.secharpe.model.Estados;
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
public class EmpresaDAO {

    Log log = new Log();

    public void delete(Empresa empresa) throws SistemaException {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            String sql = "delete from empresa where codigo = ?";
            ps = conn.prepareStatement(sql);

            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    log.put("EmpresaDAO", "delete", 0, ex.getMessage());
                    throw new SistemaException(ex.getMessage());
                }
            } else {
                log.put("EmpresaDAO", "delete", 1, e.getMessage());
                throw new SistemaException(e.getMessage());
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

    public void update(Empresa empresa) throws SistemaException {
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            ps = conn.prepareStatement("UPDATE PUBLIC.EMPRESA SET NOME_EMPRESARIAL = ?, NOME_FANTASIA = ?, CNPJ = ?, LOGRADOURO = ?, BAIRRO = ?, CIDADE = ?, NUMERO = ?, COMPLEMENTO = ?, SITE = ?, EMAIL = ?, TELEFONE = ?, DATA_UPDATE = NOW() WHERE ID = ?");

            ps.setString(1, empresa.getNomeEmpresarial());
            ps.setString(2, empresa.getNomeFantasia());
            ps.setLong(3, (empresa.getCNPJ()));
            ps.setString(4, empresa.getLogradouro());
            ps.setString(5, empresa.getBairro());
            ps.setInt(6, empresa.getCidade().getCodigo());
            ps.setInt(7, empresa.getNumero());
            ps.setString(8, empresa.getComplemento());
            ps.setString(9, empresa.getSite());
            ps.setString(10, empresa.getEmail());
            ps.setLong(11, empresa.getTelefone());

            
            ps.execute();
            conn.commit();
        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    log.put("EmpresaDAO", "delete", 0, ex.getMessage());
                    throw new SistemaException(ex.getMessage());
                }
            } else {
                log.put("EmpresaDAO", "delete", 1, e.getMessage());
                throw new SistemaException(e.getMessage());
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

    public Empresa getAll() throws SistemaException {
        Empresa empresa = new Empresa();
        Cidades c = new Cidades();
        Estados es = new Estados();
        java.sql.Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Connection.getConnection();
            ps = conn.prepareStatement("SELECT ID, NOME_EMPRESARIAL, NOME_FANTASIA, CNPJ, LOGRADOURO, BAIRRO, CIDADE, NUMERO, COMPLEMENTO, SITE, EMAIL, TELEFONE FROM PUBLIC.EMPRESA");

            ResultSet rs = ps.executeQuery();
            empresa.setCodigo(rs.getInt("ID"));
            empresa.setNomeEmpresarial(rs.getString("NOME_EMPRESARIAL"));
            empresa.setNomeFantasia(rs.getString("NOME_FANTASIA"));
            empresa.setCNPJ(rs.getInt("CNPJ"));
            empresa.setLogradouro(rs.getString("LOGRADOURO"));
            empresa.setBairro(rs.getString("BAIRRO"));
           
            ps = conn.prepareStatement("SELECT NOME, ID_ESTADO FROM PUBLIC.CIDADES WHERE ID = ?");
            ps.setInt(1, rs.getInt("CIDADE"));
            ResultSet rs2 = ps.executeQuery();
            c.setCodigo(rs.getInt("CIDADE"));
            c.setNome(rs2.getString("NOME"));

            ps = conn.prepareStatement("SELECT NOME, SIGLA FROM PUBLIC.ESTADOS WHERE ID = ?");
            ps.setInt(1, rs2.getInt("ID_ESTADO"));
            ResultSet rs3 = ps.executeQuery();
            es.setCodigo(rs2.getInt("ID_ESTADO"));
            es.setNome(rs3.getString("NOME"));
            es.setSigla(rs3.getString("SIGLA"));

            c.setEstado(es);
            empresa.setCidade(c);

            empresa.setNumero(rs.getInt("NUMERO"));
            empresa.setComplemento(rs.getString("COMPLEMENTO"));
            empresa.setSite(rs.getString("SITE"));
            empresa.setEmail(rs.getString("EMAIL"));
            empresa.setTelefone(rs.getInt("TELEFONE"));
            return empresa;
        } catch (SQLException e) {
            log.put("EmpresaDAO", "getEmpresa", 0, e.getMessage());
            throw new SistemaException(e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    log.put("EmpresaDAO", "getEmpresa", 1, ex.getMessage());
                    throw new SistemaException(ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    log.put("EmpresaDAO", "getEmpresa", 2, ex.getMessage());
                    throw new SistemaException(ex.getMessage());
                }
            }
        }
    }
}
