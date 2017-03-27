package br.com.secharpe.listener;

import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Cidades;
import br.com.secharpe.view.CidadesCadastro;
import br.com.secharpe.view.Estados;
import br.com.secharpe.view.EstadosCadastro;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstadosViewActionListener implements ActionListener {

    private Painel painel;
    private Estados estados;

    public EstadosViewActionListener(Painel painel) {
        this.painel = painel;
        estados = new Estados(painel);
    }

    public EstadosViewActionListener(Estados estados) {
        this.estados = estados;
        this.painel = estados.getPainel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Novo":             
                EstadosCadastro cidadesCadastro = new EstadosCadastro();
                if (VerificaFrame.verificaFrame(estados.getPainel(), cidadesCadastro)) {
                    VerificaFrame.exibirFrame(estados.getPainel(), cidadesCadastro);
                }
                break;
            case "Remover":
                break;
            case "Editar":
                break;
            case "Fechar":
                System.out.println("aa");
                estados.dispose();
                break;
        }
    }

}
