package br.com.secharpe.model;

/**
 *
 * @author comp8
 */
public class LoginModel {
    private String USUARIO = "admin";
    private String SENHA = "e8d95a51f3af4a3b134bf6bb680a213a";
    private String usuario;
    private String senha;
    
    public void newUser(String user, String password){
        this.USUARIO = user;
        this.SENHA = password;
    }

    public LoginModel(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public boolean Login() {
        return (usuario.equals(USUARIO) && senha.equals(SENHA));
    }
    
    
}
