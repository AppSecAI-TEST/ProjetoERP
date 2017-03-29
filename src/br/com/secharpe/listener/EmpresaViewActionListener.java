package br.com.secharpe.listener;

import br.com.secharpe.view.Empresa;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpresaViewActionListener implements ActionListener {

    private Painel painel;
    private Empresa empresa;

    public EmpresaViewActionListener(Painel painel) {
        this.painel = painel;
        empresa = new Empresa(painel);
    }

    public EmpresaViewActionListener(Empresa empresa) {
        this.empresa = empresa;
        this.painel = empresa.getPainel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Salvar":
                empresa.editarCampo(false);
                System.out.println(empresa.getEmpresa().toString());
                break;
            case "Editar":
                empresa.editarCampo(true);
                break;
            case "Limpar":
                empresa.clean();
                break;
            case "Fechar":
                empresa.dispose();
                break;
        }
    }

}
