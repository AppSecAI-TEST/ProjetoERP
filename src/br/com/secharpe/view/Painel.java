/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.secharpe.view;

import javax.swing.JDesktopPane;

/**
 *
 * @author Usuario
 */
public class Painel extends javax.swing.JFrame {
private static final long serialVersionUID = 1L;

    br.com.secharpe.principal.listener.UnidadesMenuItem handlerUnidadesMenuItem = new br.com.secharpe.principal.listener.UnidadesMenuItem(this);
    br.com.secharpe.principal.listener.CidadesMenuItem handlerCidadesMenuItem = new br.com.secharpe.principal.listener.CidadesMenuItem(this);
    br.com.secharpe.principal.listener.EstadosMenuItem handlerEstadosMenuItem = new br.com.secharpe.principal.listener.EstadosMenuItem(this);
    br.com.secharpe.principal.listener.SairMenuItem handlerSairMenuItem = new br.com.secharpe.principal.listener.SairMenuItem(this);
    br.com.secharpe.principal.listener.EmpresaMenuItem handlerEmpresaMenuItem = new br.com.secharpe.principal.listener.EmpresaMenuItem(this);
    br.com.secharpe.principal.listener.AnotacoesMenuItem handlerAnotacoesMenuItem = new br.com.secharpe.principal.listener.AnotacoesMenuItem(this);

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    /**
     * Creates new form Painel
     */
    public Painel() {
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        unidadesMenuItem.addActionListener(handlerUnidadesMenuItem);
        cidadesMenuItem.addActionListener(handlerCidadesMenuItem);
        estadosMenuItem.addActionListener(handlerEstadosMenuItem);
        sairMenuItem.addActionListener(handlerSairMenuItem);
        empresaMenuItem.addActionListener(handlerEmpresaMenuItem);
        anotacoesMenuItem.addActionListener(handlerAnotacoesMenuItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        arquivoMenu = new javax.swing.JMenu();
        sairMenuItem = new javax.swing.JMenuItem();
        cadastroMenu = new javax.swing.JMenu();
        unidadesMenuItem = new javax.swing.JMenuItem();
        cidadesMenuItem = new javax.swing.JMenuItem();
        estadosMenuItem = new javax.swing.JMenuItem();
        empresaMenuItem = new javax.swing.JMenuItem();
        utilitariosMenu = new javax.swing.JMenu();
        anotacoesMenuItem = new javax.swing.JMenuItem();
        sobreMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        arquivoMenu.setMnemonic('f');
        arquivoMenu.setText("Arquivo");

        sairMenuItem.setMnemonic('o');
        sairMenuItem.setText("Sair");
        arquivoMenu.add(sairMenuItem);

        menuBar.add(arquivoMenu);

        cadastroMenu.setMnemonic('e');
        cadastroMenu.setText("Cadastros");

        unidadesMenuItem.setMnemonic('t');
        unidadesMenuItem.setText("Unidades");
        cadastroMenu.add(unidadesMenuItem);

        cidadesMenuItem.setMnemonic('y');
        cidadesMenuItem.setText("Cidades");
        cadastroMenu.add(cidadesMenuItem);

        estadosMenuItem.setMnemonic('p');
        estadosMenuItem.setText("Estados");
        cadastroMenu.add(estadosMenuItem);

        empresaMenuItem.setMnemonic('d');
        empresaMenuItem.setText("Empresas");
        cadastroMenu.add(empresaMenuItem);

        menuBar.add(cadastroMenu);

        utilitariosMenu.setText("Utilitários");

        anotacoesMenuItem.setText("Anotações");
        utilitariosMenu.add(anotacoesMenuItem);

        menuBar.add(utilitariosMenu);

        sobreMenu.setMnemonic('h');
        sobreMenu.setText("Sobre");
        menuBar.add(sobreMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Painel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem anotacoesMenuItem;
    private javax.swing.JMenu arquivoMenu;
    private javax.swing.JMenu cadastroMenu;
    private javax.swing.JMenuItem cidadesMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem empresaMenuItem;
    private javax.swing.JMenuItem estadosMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem sairMenuItem;
    private javax.swing.JMenu sobreMenu;
    private javax.swing.JMenuItem unidadesMenuItem;
    private javax.swing.JMenu utilitariosMenu;
    // End of variables declaration//GEN-END:variables

}
