package br.com.secharpe.view;

import br.com.secharpe.listener.ProdutoViewActionListener;

/**
 *
 * @author LuizAlexandre17 <luizalexandre17@unesc.net>
 */
public class Produtos extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;

    private final ProdutoViewActionListener handlerProdutos = new ProdutoViewActionListener(this);
    private Painel painel;

    /**
     * Creates new form Produtos
     *
     * @param painel Painel
     */
    public Produtos(Painel painel) {
        new br.com.secharpe.util.Log().put("Produtos", "Abrindo janela");
        this.painel = painel;
        initComponents();
        btNovo.addActionListener(handlerProdutos);
        btEditar.addActionListener(handlerProdutos);
        btFechar.addActionListener(handlerProdutos);
        btRemover.addActionListener(handlerProdutos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btNovo = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUnidades = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Produtos");

        btNovo.setText(br.com.secharpe.util.Propriedades.getProp("form.new"));

        btRemover.setText(br.com.secharpe.util.Propriedades.getProp("form.remove"));

        btEditar.setText(br.com.secharpe.util.Propriedades.getProp("form.edit"));

        btFechar.setText(br.com.secharpe.util.Propriedades.getProp("form.close"));

        jtUnidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Descrição", "Preço Custo", "Preço Final", "Fabricante", "Unidade", "Tipo", "Estq. Min", "Estq. Atual"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtUnidades);
        if (jtUnidades.getColumnModel().getColumnCount() > 0) {
            jtUnidades.getColumnModel().getColumn(0).setPreferredWidth(20);
            jtUnidades.getColumnModel().getColumn(3).setPreferredWidth(55);
            jtUnidades.getColumnModel().getColumn(4).setPreferredWidth(50);
            jtUnidades.getColumnModel().getColumn(8).setPreferredWidth(35);
            jtUnidades.getColumnModel().getColumn(9).setPreferredWidth(35);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btRemover)
                    .addComponent(btEditar)
                    .addComponent(btFechar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btFechar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtUnidades;
    // End of variables declaration//GEN-END:variables
    /**
     * @return painel Painel
     */
    public Painel getPainel() {
        return this.painel;
    }
}
