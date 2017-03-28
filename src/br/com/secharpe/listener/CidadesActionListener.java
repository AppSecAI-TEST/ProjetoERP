package br.com.secharpe.listener;

import br.com.secharpe.model.Estados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Darabas
 */
public class CidadesActionListener implements ActionListener {

    private br.com.secharpe.view.CidadesCadastro cadastro;
    private br.com.secharpe.view.Cidades view;

    public CidadesActionListener(br.com.secharpe.view.CidadesCadastro cadastro) {
        this.cadastro = cadastro;
    }
    
    public CidadesActionListener(br.com.secharpe.view.Cidades view) {
        this.view = view;
    }
    
      
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Cadastrar":
                if(cadastro.getNome().isEmpty() && cadastro.getEstado().equals("")){
                    System.out.println("Insira corretamente as informações!");
                }else{
                    System.out.println(new br.com.secharpe.model.Cidades(1, cadastro.getNome(), new Estados(1, cadastro.getEstado(), "SC")).toString());
                }
                break;
            case "Fechar":
                cadastro.dispose();
                break;
        }
        //view.getTable().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
          //  public void valueChanged(ListSelectionEvent event) {
            //    JOptionPane.showMessageDialog(null, view.getTable().getSelectedRow());
            //}
        //});
    }

}
