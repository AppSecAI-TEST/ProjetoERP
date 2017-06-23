package br.com.secharpe.principal;

import br.com.secharpe.dao.CidadeDAO;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        new br.com.secharpe.util.Log().put("Principal", "main", "Iniciando programa");
        br.com.secharpe.view.Login login = new br.com.secharpe.view.Login();
        login.setVisible(true);
        CidadeDAO cidade = new CidadeDAO();
        System.out.println(cidade.getAll());
        cidade.getEstadoID("SC");
   }
    
}
