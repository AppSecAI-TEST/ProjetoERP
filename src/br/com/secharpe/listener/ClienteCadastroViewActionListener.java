/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.secharpe.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.com.secharpe.model.Clientes;
import br.com.secharpe.view.ClientesCadastro;
import br.com.secharpe.util.Vars;

/**
 *
 * @author LuizAlexandre17 <luizalexandreluz@unesc.net>
 */
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
            cr = cad.getCliente();
            if(cr != null)
            System.out.println(cr.toString());
        } else if (action.equals(Vars.PROP_CLOSE)) {
            cad.dispose();
        }

    }

}
