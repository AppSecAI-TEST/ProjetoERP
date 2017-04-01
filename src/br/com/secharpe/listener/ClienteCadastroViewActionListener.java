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
        switch (ae.getActionCommand()) {
            case "salvar":
                Clientes cr = new Clientes();
                cr = cad.getCliente();
                System.out.println(cr.getNome());

        }

    }

}
