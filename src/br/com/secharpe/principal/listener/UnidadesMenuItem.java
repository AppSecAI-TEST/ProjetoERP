package br.com.secharpe.principal.listener;

import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Painel;
import br.com.secharpe.view.Unidades;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnidadesMenuItem implements ActionListener {

    private Unidades unidades;
    private Painel painel;

    public UnidadesMenuItem(Painel painel) {
        this.painel = painel;
        this.unidades = new Unidades(painel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(VerificaFrame.verificaFrame(painel, unidades)){
            VerificaFrame.exibirFrame(painel, unidades);
        }

    }
}
