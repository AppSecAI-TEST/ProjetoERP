package br.com.secharpe.listener;

import br.com.secharpe.dao.UnidadeDAO;
import br.com.secharpe.util.Vars;
import br.com.secharpe.util.VerificaFrame;
import static br.com.secharpe.util.VerificaFrame.centralizar;
import br.com.secharpe.view.Painel;
import br.com.secharpe.view.Unidades;
import br.com.secharpe.view.UnidadesCadastro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class UnidadesViewActionListener implements ActionListener {

    private Painel painel;
    private Unidades unidades;

    public UnidadesViewActionListener(Unidades unidades) {
        this.unidades = unidades;
        this.painel = unidades.getPainel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals(Vars.PROP_NEW)) {
            UnidadesCadastro unidadesCadastro = new UnidadesCadastro(unidades);
            unidades.getPainel().getDesktopPane().add(unidadesCadastro);
            unidadesCadastro.setVisible(true);
            unidadesCadastro.toFront();
            unidadesCadastro.setLocation((unidades.getPainel().getWidth() - unidadesCadastro.getWidth()) / 2, (unidades.getPainel().getHeight() - unidadesCadastro.getHeight()) / 2);
            unidades.childAdd(unidadesCadastro);
        } else if (action.equals(Vars.PROP_REMOVE)) {
            JOptionPane.showMessageDialog(null, "W.I.P.");
        } else if (action.equals(Vars.PROP_EDIT)) {
            JOptionPane.showMessageDialog(null, "W.I.P.");
        } else if (action.equals(Vars.PROP_CLOSE)) {
            unidades.dispose();
        }
    }

}
