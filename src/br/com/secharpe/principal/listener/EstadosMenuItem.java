package br.com.secharpe.principal.listener;

import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Estados;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstadosMenuItem implements ActionListener {

    private Estados estados;
    private Painel painel;

    public EstadosMenuItem(Painel painel) {
        this.painel = painel;
        this.estados = new Estados(painel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(VerificaFrame.verificaFrame(painel, estados)){
            VerificaFrame.exibirFrame(painel, estados);
        }

    }
}
