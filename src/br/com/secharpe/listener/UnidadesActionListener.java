package br.com.secharpe.listener;

import br.com.secharpe.util.Vars;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Darabas
 */
public class UnidadesActionListener implements ActionListener {

    private br.com.secharpe.view.UnidadesCadastro cadastro;
    private br.com.secharpe.view.Unidades view;

    public UnidadesActionListener(br.com.secharpe.view.UnidadesCadastro cadastro) {
        this.cadastro = cadastro;
    }

    public UnidadesActionListener(br.com.secharpe.view.Unidades view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        br.com.secharpe.model.Unidades unidade = new br.com.secharpe.model.Unidades();
        if (action.equals(Vars.PROP_SAVE)) {
            if (cadastro.validar()) {
                br.com.secharpe.dao.UnidadeDAO und = new br.com.secharpe.dao.UnidadeDAO();
                System.out.println(cadastro.getUnidade().toString());
                unidade = cadastro.getUnidade();
                und.insert(unidade);
                cadastro.getUnidadeView().setTableValues();
                System.out.println(cadastro.getUnidade().toString());
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
