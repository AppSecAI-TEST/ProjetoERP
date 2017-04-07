package br.com.secharpe.listener;

import br.com.secharpe.util.Vars;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Darabas
 */
public class EstadosActionListener implements ActionListener {

    private br.com.secharpe.view.EstadosCadastro cadastro;
    private br.com.secharpe.view.Estados view;

    public EstadosActionListener(br.com.secharpe.view.EstadosCadastro cadastro) {
        this.cadastro = cadastro;
    }

    public EstadosActionListener(br.com.secharpe.view.Estados view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals(Vars.PROP_SAVE)) {
            if (cadastro.getNome().isEmpty() && cadastro.getSigla().isEmpty()) {
                System.out.println("Insira corretamente as informações!");
            } else {
                System.out.println(cadastro.getEstado().toString());
            }
        } else if (action.equals(Vars.PROP_CLOSE)) {
            cadastro.dispose();
        }
    }
        //view.getTable().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
    //  public void valueChanged(ListSelectionEvent event) {
    //    JOptionPane.showMessageDialog(null, view.getTable().getSelectedRow());
    //}
    //});
}
