package br.com.secharpe.model;

/**
 *
 * @author comp8
 */
public class LoginModel {

    private String usuario;
    private String senha;

    public LoginModel(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean Login() {
        return (senha.equals("senha"));
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
