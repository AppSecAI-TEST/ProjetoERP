package br.com.secharpe.view;

import br.com.secharpe.listener.CidadesActionListener;
import br.com.secharpe.model.Cidades;
import br.com.secharpe.model.Estados;
import br.com.secharpe.util.Log;

/**
 * View para criar novas cidades
 * @author luandr<stringigualanull@outlook.com>
 */
public class CidadesCadastro extends javax.swing.JInternalFrame {
    private static final long serialVersionUID = 1L;

    private final Log log = new Log();
    private final CidadesActionListener handlerCidades = new CidadesActionListener(this);
    private Painel painel;

    public CidadesCadastro() {
        new br.com.secharpe.util.Log().put("CidadesCadastro", "Abrindo janela");
        initComponents();
        btCadastrar.addActionListener(handlerCidades);
        btFechar.addActionListener(handlerCidades);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox();
        btCadastrar = new javax.swing.JButton();
        btFechar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastrar Cidade");

        jLabel1.setText("Nome");

        jLabel2.setText("Estado");

        btCadastrar.setText(br.com.secharpe.util.Propriedades.getProp("form.save"));

        btFechar.setText(br.com.secharpe.util.Propriedades.getProp("form.close"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btFechar;
    private javax.swing.JComboBox cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

    public Cidades getCidade() {
        Cidades cidade = new Cidades();
        cidade.setCodigo(0);
        cidade.setNome(tfNome.getText());
        Estados estado = new Estados();
        estado.setCodigo(cbEstado.getSelectedIndex());//implementar futuramente com o banco de dados
        estado.setNome("Nome"); //implementar futuramente com o banco de dados
        estado.setSigla("Sigla"); //implementar futuramente com o banco de dados
        cidade.setEstado(estado); //implementar futuramente com o banco de dados
        log.put("Cadastro", "Cidade Cadastrada");
        return cidade;
    }

    public Painel getPainel() {
        return painel;
    }

    private static CidadesCadastro instance;

    public static CidadesCadastro getInstance(Painel painel) {
        if (instance == null) {
            instance = new CidadesCadastro();
        }
        return instance;
    }

    public boolean validar() {
        return ((!tfNome.getText().equals("")) || (cbEstado.getSelectedIndex() != 0));
    }
}
