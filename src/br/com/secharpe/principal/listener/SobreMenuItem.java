package br.com.secharpe.principal.listener;

import br.com.secharpe.view.Sobre;
import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SobreMenuItem implements ActionListener {

    private Sobre sobre;

    @Override
    public void actionPerformed(ActionEvent e) {
        sobre = new Sobre();
        sobre.setVisible(true);
    }
}
