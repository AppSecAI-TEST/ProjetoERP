package br.com.secharpe.view;

import javax.swing.JDesktopPane;

/**
 * View Painel
 *
 * @author luandr<stringigualanull@outlook.com>
 */
public class Painel extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    private final br.com.secharpe.principal.listener.UnidadesMenuItem handlerUnidadesMenuItem = new br.com.secharpe.principal.listener.UnidadesMenuItem(this);
    private final br.com.secharpe.principal.listener.CidadesMenuItem handlerCidadesMenuItem = new br.com.secharpe.principal.listener.CidadesMenuItem(this);
    private final br.com.secharpe.principal.listener.EstadosMenuItem handlerEstadosMenuItem = new br.com.secharpe.principal.listener.EstadosMenuItem(this);
    private final br.com.secharpe.principal.listener.SairMenuItem handlerSairMenuItem = new br.com.secharpe.principal.listener.SairMenuItem(this);
    private final br.com.secharpe.principal.listener.EmpresaMenuItem handlerEmpresaMenuItem = new br.com.secharpe.principal.listener.EmpresaMenuItem(this);
    private final br.com.secharpe.principal.listener.AnotacoesMenuItem handlerAnotacoesMenuItem = new br.com.secharpe.principal.listener.AnotacoesMenuItem(this);
    private final br.com.secharpe.principal.listener.ClientesMenuItem handlerClientesMenuItem = new br.com.secharpe.principal.listener.ClientesMenuItem(this);
    private final br.com.secharpe.principal.listener.ProdutosMenuItem handlerProdutosMenuItem = new br.com.secharpe.principal.listener.ProdutosMenuItem(this);
    private final br.com.secharpe.principal.listener.SobreMenuItem handlerSobre = new br.com.secharpe.principal.listener.SobreMenuItem();

    /**
     * @return JDesktopPane
     */
    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    public Painel() {
        new br.com.secharpe.util.Log().put("Painel", "Abrindo janela");
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        unidadesMenuItem.addActionListener(handlerUnidadesMenuItem);
        cidadesMenuItem.addActionListener(handlerCidadesMenuItem);
        estadosMenuItem.addActionListener(handlerEstadosMenuItem);
        sairMenuItem.addActionListener(handlerSairMenuItem);
        empresaMenuItem.addActionListener(handlerEmpresaMenuItem);
        anotacoesMenuItem.addActionListener(handlerAnotacoesMenuItem);
        clientesMenuItem.addActionListener(handlerClientesMenuItem);
        produtosMenuItem.addActionListener(handlerProdutosMenuItem);
        infoMenu.addActionListener(handlerSobre);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        arquivoMenu = new javax.swing.JMenu();
        sairMenuItem = new javax.swing.JMenuItem();
        cadastroMenu = new javax.swing.JMenu();
        clientesMenuItem = new javax.swing.JMenuItem();
        produtosMenuItem = new javax.swing.JMenuItem();
        adicionaisMenu = new javax.swing.JMenu();
        unidadesMenuItem = new javax.swing.JMenuItem();
        cidadesMenuItem = new javax.swing.JMenuItem();
        estadosMenuItem = new javax.swing.JMenuItem();
        empresaMenuItem = new javax.swing.JMenuItem();
        utilitariosMenu = new javax.swing.JMenu();
        anotacoesMenuItem = new javax.swing.JMenuItem();
        sobreMenu = new javax.swing.JMenu();
        infoMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        arquivoMenu.setMnemonic('f');
        arquivoMenu.setText("Arquivo");

        sairMenuItem.setMnemonic('o');
        sairMenuItem.setText("Sair");
        arquivoMenu.add(sairMenuItem);

        menuBar.add(arquivoMenu);

        cadastroMenu.setMnemonic('e');
        cadastroMenu.setText("Cadastros");

        clientesMenuItem.setText("Clientes");
        cadastroMenu.add(clientesMenuItem);

        produtosMenuItem.setText("Produtos");
        cadastroMenu.add(produtosMenuItem);

        menuBar.add(cadastroMenu);

        adicionaisMenu.setText("Adicionais");

        unidadesMenuItem.setMnemonic('t');
        unidadesMenuItem.setText("Unidades");
        adicionaisMenu.add(unidadesMenuItem);

        cidadesMenuItem.setMnemonic('y');
        cidadesMenuItem.setText("Cidades");
        adicionaisMenu.add(cidadesMenuItem);

        estadosMenuItem.setMnemonic('p');
        estadosMenuItem.setText("Estados");
        adicionaisMenu.add(estadosMenuItem);

        empresaMenuItem.setMnemonic('d');
        empresaMenuItem.setText("Empresa");
        adicionaisMenu.add(empresaMenuItem);

        menuBar.add(adicionaisMenu);

        utilitariosMenu.setText("Utilitários");

        anotacoesMenuItem.setText("Anotações");
        utilitariosMenu.add(anotacoesMenuItem);

        menuBar.add(utilitariosMenu);

        sobreMenu.setMnemonic('h');
        sobreMenu.setText("Sobre");

        infoMenu.setText("Info");
        sobreMenu.add(infoMenu);

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
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu adicionaisMenu;
    private javax.swing.JMenuItem anotacoesMenuItem;
    private javax.swing.JMenu arquivoMenu;
    private javax.swing.JMenu cadastroMenu;
    private javax.swing.JMenuItem cidadesMenuItem;
    private javax.swing.JMenuItem clientesMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem empresaMenuItem;
    private javax.swing.JMenuItem estadosMenuItem;
    private javax.swing.JMenuItem infoMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem produtosMenuItem;
    private javax.swing.JMenuItem sairMenuItem;
    private javax.swing.JMenu sobreMenu;
    private javax.swing.JMenuItem unidadesMenuItem;
    private javax.swing.JMenu utilitariosMenu;
    // End of variables declaration//GEN-END:variables

}
