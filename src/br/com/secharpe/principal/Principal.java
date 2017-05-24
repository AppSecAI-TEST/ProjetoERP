package br.com.secharpe.principal;

public class Principal {

    public static void main(String[] args) {
        new br.com.secharpe.util.Log().put("Principal", "main", "Iniciando programa");
        br.com.secharpe.view.Login login = new br.com.secharpe.view.Login();
        login.setVisible(true);
    }
    
}
