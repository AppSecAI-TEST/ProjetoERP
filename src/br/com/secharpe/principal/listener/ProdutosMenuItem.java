/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.secharpe.principal.listener;

/**
 *
 * @author LuizAlexandre17 <luizalexandre17@unesc.net>
 */
import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Produtos;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProdutosMenuItem implements ActionListener {

    private Produtos produto;
    private Painel painel;

    public ProdutosMenuItem(Painel painel) {
        this.painel = painel;
        this.produto = new Produtos(painel);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if(VerificaFrame.verificaFrame(painel, produto)){
            VerificaFrame.exibirFrame(painel, produto);
        }
    }

}
