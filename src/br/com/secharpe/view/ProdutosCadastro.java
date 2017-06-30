package br.com.secharpe.view;

import br.com.secharpe.exception.SistemaException;
import br.com.secharpe.model.Produtos;
import br.com.secharpe.listener.ProdutoCadastroViewActionListener;
import br.com.secharpe.util.Log;
import br.com.secharpe.util.MessageCtrl;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 *
 * @author LuizAlexandre17 <luizalexandreluz@unesc.net>
 */
public class ProdutosCadastro extends javax.swing.JInternalFrame {
    private static final long serialVersionUID = 1L;

    private final ProdutoCadastroViewActionListener hadlerProdutos = new ProdutoCadastroViewActionListener(this);
    private final Log logimp = new Log();

    /**
     * Creates new form CadastroProduto
     */
    public ProdutosCadastro() {
        new br.com.secharpe.util.Log().put("ProdutosCadastro", "Abrindo janela");
        initComponents();
        pSalvar.addActionListener(hadlerProdutos);
        pFechar.addActionListener(hadlerProdutos);
    }

    public Produtos getProduto() throws NullPointerException, SistemaException {
        if (pCodigo.getText().trim().equals("") || pCodigo.getText().trim().equals("0")) {
            throw new SistemaException("Insira o Codigo");
        }
        if (pDescricao.getText().trim().equals("")) {
            throw new SistemaException("Insira a Descrição");
        }
        if (pEstoqueAtual.getText().trim().equals("") || pEstoqueAtual.getText().trim().equals("0")) {
            throw new SistemaException("Insira o Estoque Atual");
        }
        if (pEstoqueMinimo.getText().trim().equals("") || pEstoqueMinimo.getText().trim().equals("0")) {
            throw new SistemaException("Insira o Estoque Minimo");
        }

        if (pCodigo.getText() != null || pCodigo.getText() != "0") {
            try {
                Produtos p = new Produtos();
                p.setCodigo(Integer.parseInt(pCodigo.getText()));
                p.setNome(pNome.getText());
                p.setDescrição(pDescricao.getText());
                if (pEstoqueAtual.getText() != null && !pEstoqueAtual.getText().trim().equals("")) {
                    p.setEstoqueAtual(Integer.parseInt(pEstoqueAtual.getText()));
                }
                if (pEstoqueMinimo.getText() != null && !pEstoqueMinimo.getText().trim().equals("")) {
                    p.setEstoqueMin(Integer.parseInt(pEstoqueMinimo.getText()));
                }
                if (pPrecoCusto.getText() != null && !pPrecoCusto.getText().trim().equals("")) {
                    p.setPreçoCusto(Float.parseFloat(pPrecoCusto.getText()));

                }
                if (pPrecoVenda.getText() != null && !pPrecoVenda.getText().trim().equals("")) {
                    p.setPreçoFinal(Float.parseFloat(pPrecoVenda.getText()));
                }

                p.setFabricante(pFabricante.getSelectedItem().toString());

                p.setTipo(pTipo.getSelectedItem().toString());
                p.setUnidade(pUnidade.getSelectedItem().toString());
                logimp.put("Cadastro", "Produto Cadastrado");
                return p;
            } catch (NumberFormatException nfe) {
                MessageCtrl.callMessage("A String digitado não corresponde a informação", "Ops, um erro ocorreu", 8);
                System.out.println("A String digitado não corresponde a informação");
                StringWriter sw = new StringWriter();
                nfe.printStackTrace(new PrintWriter(sw));
                String exceptionAsString = sw.toString();
                logimp.put("ERRO", exceptionAsString);
                logimp.put("ProdutosCadastro", "getProduto", exceptionAsString);
            } catch (NullPointerException x) {

                System.out.println("Null Pointer");
                StringWriter sw = new StringWriter();
                x.printStackTrace(new PrintWriter(sw));
                String exceptionAsString = sw.toString();
                logimp.put("ERRO", exceptionAsString);
                logimp.put("ProdutosCadastro", "getProduto", exceptionAsString);
            }
            return null;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCodigo = new javax.swing.JTextField();
        pNome = new javax.swing.JTextField();
        pDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pEstoqueAtual = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        pCodInterno = new javax.swing.JTextField();
        pAdicionarFabricante = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pEstoqueMinimo = new javax.swing.JTextField();
        pAdicionarTipo = new javax.swing.JButton();
        pTipo = new javax.swing.JComboBox<>();
        pFabricante = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pPrecoCusto = new javax.swing.JTextField();
        pPrecoVenda = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pUnidade = new javax.swing.JComboBox<>();
        pAdicionarUnidade = new javax.swing.JButton();
        pFechar = new javax.swing.JButton();
        pSalvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastrar Produto");
        setPreferredSize(new java.awt.Dimension(670, 250));

        jLabel1.setText("Codigo do Produto:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Tipo:");

        jLabel4.setText("Descrição:");

        jLabel5.setText("Fabricante:");

        jLabel6.setText("Estoque Atual:");

        jLabel16.setText("Codigo Interno:");

        pCodInterno.setEditable(false);

        jLabel7.setText("Estoque Minimo:");

        pTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        pFabricante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Preço Custo:");

        jLabel9.setText("Preço Venda:");

        jLabel10.setText("Unidade:");

        pUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidade", "Kilos", "Metro" }));

        pFechar.setText(br.com.secharpe.util.Propriedades.getProp("form.close"));

        pSalvar.setText(br.com.secharpe.util.Propriedades.getProp("form.save"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pDescricao)
                                        .addComponent(pNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(101, 101, 101)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(70, 70, 70)
                                            .addComponent(jLabel5)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(pEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pCodInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pFabricante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pAdicionarUnidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pAdicionarTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pAdicionarFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(pPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(pCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(pDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(pEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pCodInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pAdicionarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pAdicionarFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pAdicionarUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(pPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pSalvar)
                    .addComponent(pFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton pAdicionarFabricante;
    private javax.swing.JButton pAdicionarTipo;
    private javax.swing.JButton pAdicionarUnidade;
    private javax.swing.JTextField pCodInterno;
    private javax.swing.JTextField pCodigo;
    private javax.swing.JTextField pDescricao;
    private javax.swing.JTextField pEstoqueAtual;
    private javax.swing.JTextField pEstoqueMinimo;
    private javax.swing.JComboBox<String> pFabricante;
    private javax.swing.JButton pFechar;
    private javax.swing.JTextField pNome;
    private javax.swing.JTextField pPrecoCusto;
    private javax.swing.JTextField pPrecoVenda;
    private javax.swing.JButton pSalvar;
    private javax.swing.JComboBox<String> pTipo;
    private javax.swing.JComboBox<String> pUnidade;
    // End of variables declaration//GEN-END:variables
}
