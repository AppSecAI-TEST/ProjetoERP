package br.com.secharpe.listener;

import br.com.secharpe.util.VerificaFrame;
import br.com.secharpe.view.Painel;
import br.com.secharpe.view.Unidades;
import br.com.secharpe.view.UnidadesCadastro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnidadesViewActionListener implements ActionListener {

    private Painel painel;
    private Unidades unidades;

    public UnidadesViewActionListener(Painel painel) {
        this.painel = painel;
        unidades = new Unidades(painel);
    }

    public UnidadesViewActionListener(Unidades unidades) {
        this.unidades = unidades;
        this.painel = unidades.getPainel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Novo":             
                UnidadesCadastro unidadesCadastro = new UnidadesCadastro();
                if (VerificaFrame.verificaFrame(unidades.getPainel(), unidadesCadastro)) {
                    VerificaFrame.exibirFrame(unidades.getPainel(), unidadesCadastro);
                }
                break;
            case "Remover":
                break;
            case "Editar":
                break;
            case "Fechar":
                unidades.dispose();
                break;
        }
    }

}
