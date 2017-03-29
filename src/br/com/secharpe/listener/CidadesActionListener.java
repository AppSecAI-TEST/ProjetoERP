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
                if(cadastro.validar()){
                    System.out.println(cadastro.getCidade().toString());
                }else{
                    System.out.println("Insira corretamente as informações!");
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
