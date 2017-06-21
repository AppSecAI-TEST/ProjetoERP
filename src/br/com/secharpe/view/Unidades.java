package br.com.secharpe.view;

import br.com.secharpe.databank.UnidadeDAO;
import br.com.secharpe.listener.UnidadesViewActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Darabas
 */
public class Unidades extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;

    UnidadesViewActionListener handlerUnidades = new UnidadesViewActionListener(this);
    private Painel painel;
    private String[] columnNames = {"Nome", "Sigla"};
    private DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form Unidades
     */
    public Unidades(Painel painel) {
        new br.com.secharpe.util.Log().put("Unidades", "Abrindo janela");
        this.painel = painel;
        initComponents();
        btNovo.addActionListener(handlerUnidades);
        btFechar.addActionListener(handlerUnidades);
        btRemover.addActionListener(handlerUnidades);
        btEditar.addActionListener(handlerUnidades);
        model.setColumnIdentifiers(columnNames);
        jtUnidades.setModel(model);
        
    }

    private void init() {
        initComponents();
        btNovo.addActionListener(handlerUnidades);
        btFechar.addActionListener(handlerUnidades);
        btEditar.addActionListener(handlerUnidades);
        btRemover.addActionListener(handlerUnidades);
         model.setColumnIdentifiers(columnNames);
        jtUnidades.setModel(model);
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
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jtUnidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sigla"
            }
        ));
        jScrollPane1.setViewportView(jtUnidades);

        btNovo.setText(br.com.secharpe.util.Propriedades.getProp("form.new"));

        btRemover.setText(br.com.secharpe.util.Propriedades.getProp("form.remove"));

        btEditar.setText(br.com.secharpe.util.Propriedades.getProp("form.edit"));

        btFechar.setText(br.com.secharpe.util.Propriedades.getProp("form.close"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       setTableValues();
    }//GEN-LAST:event_formInternalFrameOpened


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
    public void setTableValues() {
        model.setRowCount(0);
        UnidadeDAO undao = new UnidadeDAO();
        List<br.com.secharpe.model.Unidades> listUnidade = undao.getAll();
        for (br.com.secharpe.model.Unidades un : listUnidade) {
            model.addRow(new Object[]{un.getNome(), un.getSigla()});
        }
    }
}
