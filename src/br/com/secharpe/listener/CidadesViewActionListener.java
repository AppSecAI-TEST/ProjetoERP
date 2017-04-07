package br.com.secharpe.listener;

import br.com.secharpe.util.Vars;
import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Cidades;
import br.com.secharpe.view.CidadesCadastro;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CidadesViewActionListener implements ActionListener {

    private Painel painel;
    private Cidades cidades;

    public CidadesViewActionListener(Painel painel) {
        this.painel = painel;
        cidades = new Cidades(painel);
    }

    public CidadesViewActionListener(Cidades cidades) {
        this.cidades = cidades;
        this.painel = cidades.getPainel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals(Vars.PROP_NEW)) {
            CidadesCadastro cidadesCadastro = new CidadesCadastro();
            if (VerificaFrame.verificaFrame(cidades.getPainel(), cidadesCadastro)) {
                VerificaFrame.exibirFrame(cidades.getPainel(), cidadesCadastro);
            }
        } else if (action.equals(Vars.PROP_REMOVE)) {
            JOptionPane.showMessageDialog(null, "W.I.P.");
        } else if (action.equals(Vars.PROP_EDIT)) {
            JOptionPane.showMessageDialog(null, "W.I.P.");
        } else if (action.equals(Vars.PROP_CLOSE)) {
            cidades.dispose();
        }
    }

}
