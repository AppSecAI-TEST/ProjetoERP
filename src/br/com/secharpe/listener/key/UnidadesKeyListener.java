package br.com.secharpe.listener.key;

import br.com.secharpe.view.UnidadesCadastro;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class UnidadesKeyListener implements KeyListener {

    private final UnidadesCadastro cadastro;

    public UnidadesKeyListener(UnidadesCadastro cadastro) {
        this.cadastro = cadastro;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            cadastro.sendInfo();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
