package br.com.secharpe.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.com.secharpe.view.AnotacoesCadastro;
import br.com.secharpe.view.Anotacoes;

/**
 *
 * @author Darabas
 */
public class AnotacoesActionListener implements ActionListener {

    private AnotacoesCadastro cadastro;
    private Anotacoes view;

    public AnotacoesActionListener(AnotacoesCadastro cadastro) {
        this.cadastro = cadastro;
    }

    public AnotacoesActionListener(Anotacoes view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Cadastrar":
                if (cadastro.validar()) {
                    System.out.println(cadastro.getAnotacoes().toString());
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
