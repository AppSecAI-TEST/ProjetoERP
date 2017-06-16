/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.secharpe.listener;

import br.com.secharpe.databank.ProdutoDAO;
import br.com.secharpe.exception.SistemaException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.com.secharpe.model.Produtos;
import br.com.secharpe.util.MessageCtrl;
import br.com.secharpe.util.Vars;
import br.com.secharpe.view.ProdutosCadastro;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LuizAlexandre17 <luizalexandreluz@unesc.net>
 */
public class ProdutoCadastroViewActionListener implements ActionListener {

    private ProdutosCadastro cad;

    public ProdutoCadastroViewActionListener(ProdutosCadastro p) {
        this.cad = p;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        if(action.equals(Vars.PROP_ERASE)){
            Produtos cr = new Produtos();
            try {
                cr = cad.getProduto();
                ProdutoDAO proddao = new ProdutoDAO();
               // proddao.delete(cr);
            } catch (SistemaException ex) {
                MessageCtrl.callMessage(ex.getMessage(), Vars.TITLE_MESSAGE_DEFAULT, 8);
            }
        }
        if (action.equals(Vars.PROP_SAVE)) {
            Produtos cr = new Produtos();
            try {
                cr = cad.getProduto();
                ProdutoDAO proddao = new ProdutoDAO();
                if (cr != null) {
                    System.out.println(cr.toString());
                   // proddao.insert(cr); 
                }

            } catch (SistemaException ex) {
                MessageCtrl.callMessage(ex.getMessage(), Vars.TITLE_MESSAGE_DEFAULT, 8);
            }

        } else if (action.equals(Vars.PROP_CLOSE)) {
            cad.dispose();
        }

    }

}
