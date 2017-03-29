package br.com.secharpe.principal.listener;

import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Empresa;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpresaMenuItem implements ActionListener {

    private Empresa empresa;
    private Painel painel;

    public EmpresaMenuItem(Painel painel) {
        this.painel = painel;
        this.empresa = new Empresa(painel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(VerificaFrame.verificaFrame(painel, empresa)){
            VerificaFrame.exibirFrame(painel, empresa);
        }

    }
}
