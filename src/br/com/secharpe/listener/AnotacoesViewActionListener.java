package br.com.secharpe.listener;

import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Anotacoes;
import br.com.secharpe.view.AnotacoesCadastro;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnotacoesViewActionListener implements ActionListener {

    private Painel painel;
    private Anotacoes cidades;

    public AnotacoesViewActionListener(Painel painel) {
        this.painel = painel;
        cidades = new Anotacoes(painel);
    }

    public AnotacoesViewActionListener(Anotacoes anotacoes) {
        this.cidades = anotacoes;
        this.painel = anotacoes.getPainel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Novo":             
                AnotacoesCadastro anotacoesCadastro = new AnotacoesCadastro();
                if (VerificaFrame.verificaFrame(cidades.getPainel(), anotacoesCadastro)) {
                    VerificaFrame.exibirFrame(cidades.getPainel(), anotacoesCadastro);
                }
                break;
            case "Ver":
                break;
            case "Remover":
                break;
            case "Editar":
                break;
            case "Fechar":
                cidades.dispose();
                break;
        }
    }

}
