package br.com.secharpe.principal.listener;

import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Cidades;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CidadesMenuItem implements ActionListener {

    private Cidades cidades;
    private Painel painel;

    public CidadesMenuItem(Painel painel) {
        this.painel = painel;
        this.cidades = new Cidades(painel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(VerificaFrame.verificaFrame(painel, cidades)){
            VerificaFrame.exibirFrame(painel, cidades);
        }

    }
}
