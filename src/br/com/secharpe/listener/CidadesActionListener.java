package br.com.secharpe.listener;

import br.com.secharpe.model.Estados;
import br.com.secharpe.util.Vars;
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
        String action = e.getActionCommand();
        if (action.equals(Vars.PROP_SAVE)) {
            if (cadastro.validar()) {
                System.out.println(cadastro.getCidade().toString());
            } else {
                System.out.println("Insira corretamente as informações!");
            }
        } else if (action.equals(Vars.PROP_CLOSE)) {
            cadastro.dispose();
        }
        //view.getTable().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        //  public void valueChanged(ListSelectionEvent event) {
        //    JOptionPane.showMessageDialog(null, view.getTable().getSelectedRow());
        //}
        //});
    }

}
