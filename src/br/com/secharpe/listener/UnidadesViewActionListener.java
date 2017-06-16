package br.com.secharpe.listener;

import br.com.secharpe.databank.UnidadeDAO;
import br.com.secharpe.util.Vars;
import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Painel;
import br.com.secharpe.view.Unidades;
import br.com.secharpe.view.UnidadesCadastro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class UnidadesViewActionListener implements ActionListener {

    private Painel painel;
    private Unidades unidades;

    public UnidadesViewActionListener(Painel painel) {
        this.painel = painel;
        unidades = new Unidades(painel);
    }

    public UnidadesViewActionListener(Unidades unidades) {
        this.unidades = unidades;
        this.painel = unidades.getPainel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals(Vars.PROP_NEW)) {
            UnidadeDAO undao = new UnidadeDAO();
            UnidadesCadastro unidadesCadastro = new UnidadesCadastro();
            if (VerificaFrame.verificaFrame(unidades.getPainel(), unidadesCadastro)) {
                VerificaFrame.exibirFrame(unidades.getPainel(), unidadesCadastro);
            }
        } else if (action.equals(Vars.PROP_REMOVE)) {
            JOptionPane.showMessageDialog(null, "W.I.P.");
        } else if (action.equals(Vars.PROP_EDIT)) {
            JOptionPane.showMessageDialog(null, "W.I.P.");
        } else if (action.equals(Vars.PROP_CLOSE)) {
            unidades.dispose();
        }
    }

}
