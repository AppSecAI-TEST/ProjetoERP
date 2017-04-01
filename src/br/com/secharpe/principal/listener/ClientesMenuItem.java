package br.com.secharpe.principal.listener;

import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Clientes;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientesMenuItem implements ActionListener {

    private Clientes clientes;
    private Painel painel;

    public ClientesMenuItem(Painel painel) {
        this.painel = painel;
        this.clientes = new Clientes(painel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(VerificaFrame.verificaFrame(painel, clientes)){
            VerificaFrame.exibirFrame(painel, clientes);
        }

    }
}
