package br.com.secharpe.model;

import java.io.File;

/**
 *
 * @author comp8
 */
public class LoginModel {

    br.com.secharpe.log.Log log = new br.com.secharpe.log.Log();

    private String USUARIO = "admin";
    private String SENHA = "e8d95a51f3af4a3b134bf6bb680a213a";
    private String usuario;
    private String senha;

    File User = new File("log.log");

    public void SetConfig() {
        if (User.exists()) {
            String user = log.lerArquivo("log.log");
            this.USUARIO = user;
            this.SENHA = "senha";

        } else {
        }
    }

    public void newUser(String user, String password) {
        this.USUARIO = user;
        this.SENHA = password;
    }

    public LoginModel(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
        if (User.exists()) {
            String user = log.lerArquivo("log.log");
            this.USUARIO = user;
            this.SENHA = "senha";

        } else {
        }
    }

    public boolean Login() {
        return (usuario.equals(USUARIO) && senha.equals(SENHA));
    }

}
