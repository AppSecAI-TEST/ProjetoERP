package br.com.secharpe.principal.listener;

import br.com.secharpe.view.Painel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SairMenuItem implements ActionListener {
    private Painel painel;
    public SairMenuItem(Painel painel) {
        this.painel = painel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //call splash and do user logout
        painel.dispose();
        System.exit(0);
    }
}
