package br.com.secharpe.view;

import br.com.secharpe.listener.UnidadesViewActionListener;
import javax.swing.JTable;

/**
 *
 * @author Darabas
 */
public class Unidades extends javax.swing.JInternalFrame {
    private static final long serialVersionUID = 1L;

    UnidadesViewActionListener handlerUnidades = new UnidadesViewActionListener(this);
    private Painel painel;

    /**
     * Creates new form Unidades
     */

    public Unidades(Painel painel) {
        this.painel = painel;
        init();
    }

    private void init() {
        initComponents();
        btNovo.addActionListener(handlerUnidades);
        btFechar.addActionListener(handlerUnidades);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtUnidades = new javax.swing.JTable();
        btNovo = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Unidades");
        setMaximumSize(new java.awt.Dimension(421, 321));
        setMinimumSize(new java.awt.Dimension(421, 321));

        jtUnidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtUnidades);

        btNovo.setText("Novo");

        btRemover.setText("Remover");

        btEditar.setText("Editar");

        btFechar.setText("Fechar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btNovo)
                .addGap(18, 18, 18)
                .addComponent(btRemover)
                .addGap(18, 18, 18)
                .addComponent(btEditar)
                .addGap(18, 18, 18)
                .addComponent(btFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btRemover)
                    .addComponent(btEditar)
                    .addComponent(btFechar))
                .addGap(0, 75, Short.MAX_VALUE))
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

    public JTable getTable() {
        return this.jtUnidades;
    }

    public Painel getPainel() {
        return this.painel;
    }
    private static Unidades instance;

    public static Unidades getInstance(Painel painel) {
        if (instance == null) {
            instance = new Unidades(painel);
        }
        return instance;
    }
}
