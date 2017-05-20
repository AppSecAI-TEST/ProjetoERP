package br.com.secharpe.listener;

import br.com.secharpe.view.Painel;
import java.awt.event.ActionListener;
import br.com.secharpe.log.Log;
import java.io.File;
import br.com.secharpe.view.Login;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginActionListener implements ActionListener {
    
     br.com.secharpe.log.Log log = new br.com.secharpe.log.Log();
    

    private final br.com.secharpe.view.Login login;
    
    File User = new File("log.log");

    public LoginActionListener(br.com.secharpe.view.Login login) {
        this.login = login;
        
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Entrar":
                if (new br.com.secharpe.model.LoginModel(login.getUsuario(), login.getSenha()).Login()) {
                    login.dispose();
                    /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                     */
                    try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Nimbus".equals(info.getName())) {
                                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                break;
                            }
                        }
                    } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
        //</editor-fold>

                    /* Create and display the form */
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new Painel().setVisible(true);
                        }
                    });
                }
                break;
            case "Sair":
                //logout (change user status to offline in db) and exit
                System.exit(0);
                break;
        }
    }
}
