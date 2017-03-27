package br.com.secharpe.model;

/**
 *
 * @author comp8
 */
public class Login {
    private static final String USUARIO = "admin";
    private static final String SENHA = "e8d95a51f3af4a3b134bf6bb680a213a";
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public boolean Login() {
        return (usuario.equals(USUARIO) && senha.equals(SENHA));
    }
    
    
}
