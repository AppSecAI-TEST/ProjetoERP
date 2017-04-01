package br.com.secharpe.listener;

import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Clientes;
import br.com.secharpe.view.ClientesCadastro;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClienteViewActionListener implements ActionListener {

    private Painel painel;
    private Clientes clientes;


    public ClienteViewActionListener(Clientes cliente) {
        this.clientes = cliente;
        this.painel = clientes.getPainel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Novo":             
                ClientesCadastro clienteCadastro = new ClientesCadastro();
                if (VerificaFrame.verificaFrame(clientes.getPainel(), clienteCadastro)) {
                    VerificaFrame.exibirFrame(clientes.getPainel(), clienteCadastro);
                }
                break;
            case "Remover":
                break;
            case "Editar":
                break;
            case "Fechar":
                System.out.println("aa");
                clientes.dispose();
                break;
        }
    }

}
