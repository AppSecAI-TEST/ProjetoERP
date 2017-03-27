package br.com.secharpe.listener;

import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Cidades;
import br.com.secharpe.view.CidadesCadastro;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CidadesViewActionListener implements ActionListener {

    private Painel painel;
    private Cidades cidades;

    public CidadesViewActionListener(Painel painel) {
        this.painel = painel;
        cidades = new Cidades(painel);
    }

    public CidadesViewActionListener(Cidades cidades) {
        this.cidades = cidades;
        this.painel = cidades.getPainel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Novo":             
                CidadesCadastro cidadesCadastro = new CidadesCadastro();
                if (VerificaFrame.verificaFrame(cidades.getPainel(), cidadesCadastro)) {
                    VerificaFrame.exibirFrame(cidades.getPainel(), cidadesCadastro);
                }
                break;
            case "Remover":
                break;
            case "Editar":
                break;
            case "Fechar":
                System.out.println("aa");
                cidades.dispose();
                break;
        }
    }

}
