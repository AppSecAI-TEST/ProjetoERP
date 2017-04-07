/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.secharpe.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.com.secharpe.model.Produtos;
import br.com.secharpe.view.ProdutosCadastro;

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
        switch (ae.getActionCommand()) {
            case "Salvar":
                Produtos cr = new Produtos();
                cr = cad.getProduto();
                System.out.println(cr.toString());

        }

    }

}
