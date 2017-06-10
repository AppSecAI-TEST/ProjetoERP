/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.secharpe.listener;

import br.com.secharpe.exception.SistemaException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.com.secharpe.model.Clientes;
import br.com.secharpe.util.MessageCtrl;
import br.com.secharpe.util.Vars;
import br.com.secharpe.view.ClientesCadastro;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteCadastroViewActionListener implements ActionListener {

    private ClientesCadastro cad;

    public ClienteCadastroViewActionListener(ClientesCadastro c) {
        this.cad = c;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        if (action.equals(Vars.PROP_SAVE)) {
            Clientes cr = new Clientes();
            try {
                cr = cad.getCliente();
                System.out.println(cr.toString());
            } catch (SistemaException ex) {
                MessageCtrl.callMessage(ex.getMessage(), Vars.TITLE_MESSAGE_DEFAULT, 8);
            }
        } else if (action.equals(Vars.PROP_CLOSE)) {
            cad.dispose();
        }

    }

}
