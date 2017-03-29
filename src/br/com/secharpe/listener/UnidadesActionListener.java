package br.com.secharpe.listener;

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
        switch (e.getActionCommand()) {
            case "Cadastrar":
                if (cadastro.validar()) {
                    System.out.println(cadastro.getUnidade().toString());
                } else {
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
