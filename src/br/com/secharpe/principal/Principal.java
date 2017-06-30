package br.com.secharpe.principal;

//import br.com.secharpe.dao.AnotacoesDAO;
//import br.com.secharpe.dao.EmpresaDAO;
//import br.com.secharpe.exception.SistemaException;
//import br.com.secharpe.model.Cidades;
//import br.com.secharpe.model.Anotacoes;
//import java.util.ArrayList;
//import java.util.List;

public class Principal {

    public static void main(String[] args) {
        new br.com.secharpe.util.Log().put("Principal", "main", "Iniciando programa");
        br.com.secharpe.view.Login login = new br.com.secharpe.view.Login();
        login.setVisible(true);
//        AnotacoesDAO a = new AnotacoesDAO();
//        a.delete(8);
//        Anotacoes ano = new Anotacoes();
//        ano.setTitulo("Tainha");
//        ano.setDescricao("Comprar tainha");
//        ano.setAnotacao("Comprar tainha para festa de confraternização da empresa");
//        
//        a.insert(ano);
//        List<Anotacoes> lista = a.getAll();
//        for (Anotacoes an : lista) {
//            System.out.println(an.getTitulo() + " " + an.getAnotacao());
//        }
//        EmpresaDAO empresa = new EmpresaDAO();
//        Empresa emp = new Empresa();
//        emp.setNomeEmpresarial("Amazon Inc.");
//        emp.setNomeFantasia("Amazon");
//        emp.setCNPJ(new Long("88823444666000"));
//        emp.setLogradouro("Rua das Ruas");
//        emp.setBairro("Centro");
//        Cidades cidade = new Cidades();
//        cidade.setCodigo(3);
//        emp.setCidade(cidade);
//        emp.setNumero(203);
//        emp.setComplemento("Cmp");
//        emp.setSite("amazon.com");
//        emp.setEmail("con@amazon.com");
//        try {
//			empresa.update(emp);
//		} catch (SistemaException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
////        System.out.println(cidade.getAll());
////        cidade.getEstadoID("SC");
//        System.exit(0);
    }

}
