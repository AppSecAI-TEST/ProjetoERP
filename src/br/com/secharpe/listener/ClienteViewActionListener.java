package br.com.secharpe.listener;

import br.com.secharpe.util.Vars;
import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Clientes;
import br.com.secharpe.view.ClientesCadastro;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ClienteViewActionListener implements ActionListener {

    private Painel painel;
    private Clientes clientes;

    public ClienteViewActionListener(Clientes cliente) {
        this.clientes = cliente;
        this.painel = clientes.getPainel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals(Vars.PROP_NEW)) {
            ClientesCadastro clienteCadastro = new ClientesCadastro();
            if (VerificaFrame.verificaFrame(clientes.getPainel(), clienteCadastro)) {
                VerificaFrame.exibirFrame(clientes.getPainel(), clienteCadastro);
            }
        } else if (action.equals(Vars.PROP_REMOVE)) {
            JOptionPane.showMessageDialog(null, "W.I.P.");
        } else if (action.equals(Vars.PROP_EDIT)) {
            JOptionPane.showMessageDialog(null, "W.I.P.");
        } else if (action.equals(Vars.PROP_CLOSE)) {
            clientes.dispose();
        }
    }

}
