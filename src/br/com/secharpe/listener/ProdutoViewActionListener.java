package br.com.secharpe.listener;

import br.com.secharpe.util.Vars;
import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Produtos;
import br.com.secharpe.view.ProdutosCadastro;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/* Classe para action listener de Produtos
 *
 * @author luandr <stringigualanull@outlook.com>
 * @author LuizAlexandre17 <luizalexandreluz@unesc.net>
 */
public class ProdutoViewActionListener implements ActionListener {

    private Painel painel;
    private Produtos produtos;

    public ProdutoViewActionListener(Produtos produto) {
        this.produtos = produto;
        this.painel = produtos.getPainel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals(Vars.PROP_NEW)) {
            ProdutosCadastro produtoCadastro = new ProdutosCadastro();
            if (VerificaFrame.verificaFrame(produtos.getPainel(), produtoCadastro)) {
                VerificaFrame.exibirFrame(produtos.getPainel(), produtoCadastro);
            }
        } else if (action.equals(Vars.PROP_REMOVE)) {
            JOptionPane.showMessageDialog(null, "W.I.P.");
        } else if (action.equals(Vars.PROP_EDIT)) {
            JOptionPane.showMessageDialog(null, "W.I.P.");
        } else if (action.equals(Vars.PROP_CLOSE)) {
            produtos.dispose();
        }
    }
}
