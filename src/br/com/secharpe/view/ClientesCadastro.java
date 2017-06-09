/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.secharpe.view;

import br.com.secharpe.listener.ClienteCadastroViewActionListener;
import br.com.secharpe.model.Clientes;
import br.com.secharpe.util.Log;
import java.awt.Graphics;
import java.awt.Image;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.swing.ImageIcon;

/**
 *
 * @author LuizAlexandre17 <luizalexandreluz@unesc.net>
 */
public class ClientesCadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form Clientes
     */
    ClienteCadastroViewActionListener clienteAl = new ClienteCadastroViewActionListener(this);
    Log logimp = new Log();
    Painel painel;

    public ClientesCadastro() {
        new br.com.secharpe.util.Log().put("ClientesCadastro", "Abrindo janela");
        
        this.painel = painel;
        
        initComponents();
        btSalvarCliente.addActionListener(clienteAl);
        btSairCliente.addActionListener(clienteAl);
        
    }

    public Clientes getCliente() {
        Clientes cl = new Clientes();

        if (cNome.getText() != null) {
            try {
                br.com.secharpe.model.Estados estado = new br.com.secharpe.model.Estados();
                br.com.secharpe.model.Cidades cidade = new br.com.secharpe.model.Cidades();
                cl.setNome(cNome.getText());
                if (cCPF.getText() != null && !cCPF.getText().trim().equals("")) {
                    cl.setCpf(Integer.parseInt((cCPF.getText())));
                }
                if (cRG.getText() != null && !cRG.getText().trim().equals("")) {
                    cl.setRg(Integer.parseInt(cRG.getText()));
                }
                if (cCelular.getText() != null && !cCelular.getText().trim().equals("")) {
                    cl.setCelular(Integer.parseInt(cCelular.getText()));
                }
                if (cTelefone.getText() != null && !cTelefone.getText().trim().equals("")) {
                    cl.setTelefone(Integer.parseInt(cTelefone.getText()));
                }
                if (cNumero.getText() != null && !cNumero.getText().trim().equals("")) {
                    cl.setNumero(Integer.parseInt(cNumero.getText()));
                }

                estado.setCodigo(cEstado.getSelectedIndex());//implementar com o banco
                estado.setNome("Nome"); //implementar futuramente com o banco de dados
                estado.setSigla("Sigla"); //implementar futuramente com o banco de dados
                cidade.setCodigo(cCidade.getSelectedIndex()); //implementar futuramente com o banco de dados
                cidade.setEstado(estado); //implementar futuramente com o banco de dados
                cidade.setNome("Nome"); //implementar futuramente com o banco de dados
                cl.setCidade(cidade); //implementar futuramente com o banco de dados
                cl.setEstado(estado);
                cl.setCodigo(0);
                cl.setComplemento(cComplemento.getText());
                cl.setEmail(cEmail.getText());
                cl.setBairro(cBairro.getText());
                cl.setEndereco(cEndereço.getText());

                return cl;
            } catch (NumberFormatException nfe) {
                System.out.println("A String digitado não corresponde a informação");
                StringWriter sw = new StringWriter();
                nfe.printStackTrace(new PrintWriter(sw));
                String exceptionAsString = sw.toString();
                System.out.println();
                logimp.put("ERRO", exceptionAsString);
                logimp.put("ClientesCadastro", "getCliente", exceptionAsString);

            }
            catch (NullPointerException nf){
                System.out.println("ERRO Null Pointer");
                StringWriter sw = new StringWriter();
                nf.printStackTrace(new PrintWriter(sw));
                String exceptionAsString = sw.toString();
                System.out.println();
                logimp.put("ERRO", exceptionAsString);
                logimp.put("ClientesCadastro", "getCliente", exceptionAsString);
            }
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cEstado = new javax.swing.JComboBox<>();
        cCidade = new javax.swing.JComboBox<>();
        cTelefone = new javax.swing.JTextField();
        cCelular = new javax.swing.JTextField();
        cEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btSalvarCliente = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btSairCliente = new javax.swing.JButton();
        cNome = new javax.swing.JTextField();
        cCPF = new javax.swing.JTextField();
        cRG = new javax.swing.JTextField();
        cEndereço = new javax.swing.JTextField();
        cNumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cBairro = new javax.swing.JTextField();
        cComplemento = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cCodInterno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Cadastrar Clientes");

        cEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Bairro");

        jLabel11.setText("Telefone:");

        jLabel12.setText("Celular:");

        btSalvarCliente.setText(br.com.secharpe.util.Propriedades.getProp("form.save"));

        jLabel13.setText("Email:");

        btSairCliente.setText(br.com.secharpe.util.Propriedades.getProp("form.close"));

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("RG:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("Numero:");

        jLabel6.setText("Complemento:");

        jLabel7.setText("Estado");

        jLabel8.setText("Cidade");

        jLabel17.setText("Codigo Interno:");

        cCodInterno.setEditable(false);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/secharpe/image/cadastro-clientes.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/secharpe/image/Imagem Azul.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btSairCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                    .addComponent(jLabel10)))
                            .addGap(4, 4, 4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cNome, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(cCPF)
                                    .addComponent(cEndereço)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cComplemento)
                                    .addComponent(cBairro)
                                    .addComponent(cEmail)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 125, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(12, 12, 12)
                                .addComponent(cEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cRG, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(cNumero)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cCodInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(cCodInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(cEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(cBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(cTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(btSairCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSalvarCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSairCliente;
    private javax.swing.JButton btSalvarCliente;
    private javax.swing.JTextField cBairro;
    private javax.swing.JTextField cCPF;
    private javax.swing.JTextField cCelular;
    private javax.swing.JComboBox<String> cCidade;
    private javax.swing.JTextField cCodInterno;
    private javax.swing.JTextField cComplemento;
    private javax.swing.JTextField cEmail;
    private javax.swing.JTextField cEndereço;
    private javax.swing.JComboBox<String> cEstado;
    private javax.swing.JTextField cNome;
    private javax.swing.JTextField cNumero;
    private javax.swing.JTextField cRG;
    private javax.swing.JTextField cTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    public Painel getPainel() {
        return this.painel;
    }
    
    

}
