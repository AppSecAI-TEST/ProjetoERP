/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.secharpe.listener;

import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Produtos;
import br.com.secharpe.view.ProdutosCadastro;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author LuizAlexandre17 <luizalexandre17@unesc.net>
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
        switch (e.getActionCommand()) {
            case "Novo":             
                ProdutosCadastro produtoCadastro = new ProdutosCadastro();
                if (VerificaFrame.verificaFrame(produtos.getPainel(), produtoCadastro)) {
                    VerificaFrame.exibirFrame(produtos.getPainel(), produtoCadastro);
                }
                break;
            case "Remover":
                break;
            case "Editar":
                break;
            case "Fechar":
                System.out.println("aa");
                produtos.dispose();
                break;
        }
    }
}





