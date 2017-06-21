package br.com.secharpe.listener;

import br.com.secharpe.util.Vars;
import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Estados;
import br.com.secharpe.view.EstadosCadastro;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class EstadosViewActionListener implements ActionListener {

    private Painel painel;
    private Estados estados;

    public EstadosViewActionListener(Painel painel) {
        this.painel = painel;
        estados = new Estados(painel);
    }

    public EstadosViewActionListener(Estados estados) {
        this.estados = estados;
        this.painel = estados.getPainel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals(Vars.PROP_NEW)) {
            EstadosCadastro cidadesCadastro = new EstadosCadastro(estados);
            if (VerificaFrame.verificaFrame(estados.getPainel(), cidadesCadastro)) {
                VerificaFrame.exibirFrame(estados.getPainel(), cidadesCadastro);
            }
        } else if (action.equals(Vars.PROP_REMOVE)) {
            JOptionPane.showMessageDialog(null, "W.I.P.");
        } else if (action.equals(Vars.PROP_EDIT)) {
            JOptionPane.showMessageDialog(null, "W.I.P.");
        } else if (action.equals(Vars.PROP_CLOSE)) {
            estados.dispose();
        }
    }

}
