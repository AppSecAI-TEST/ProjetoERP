package br.com.secharpe.principal.listener;

import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Anotacoes;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnotacoesMenuItem implements ActionListener {

    private Anotacoes anotacoes;
    private Painel painel;

    public AnotacoesMenuItem(Painel painel) {
        this.painel = painel;
        this.anotacoes = new Anotacoes(painel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(VerificaFrame.verificaFrame(painel, anotacoes)){
            VerificaFrame.exibirFrame(painel, anotacoes);
        }

    }
}
