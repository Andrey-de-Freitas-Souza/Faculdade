/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pacote;

import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class TelaEntrada extends javax.swing.JFrame {

    String tipo = "Entrada"; 
    String ativo_passivo = "N/A";
    String tipo_invest = "N/A";
    int id;
    public TelaEntrada() {
        initComponents();
        setLocationRelativeTo(null);
        btnCadEntrada.setBackground(new Color(0,0,0,0));
        txtData.setBackground(new Color(0,0,0,0));
        txtValor.setBackground(new Color(0,0,0,0));
        cbxCategoria.setBackground(new Color(0,0,0,0));
        cbxFixaVariavel.setBackground(new Color(0,0,0,0));
        btnConfirmarEdit.setBackground(new Color(0,0,0,0));
        btnEditEntrada.setBackground(new Color(0,0,0,0));
        btnCancelEntrada.setBackground(new Color(0,0,0,0));
        LocalDate dataAtual1 = LocalDate.now();       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String dataTxt = dataAtual1.format(formatter);
        txtData.setText(dataTxt);
        btnConfirmarEdit.setVisible(false);
        btnCancelEntrada.setVisible(false);
        aviso.setVisible(false);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aviso = new javax.swing.JLabel();
        btnConfirmarEdit = new javax.swing.JButton();
        btnCancelEntrada = new javax.swing.JButton();
        btnEditEntrada = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCadEntrada = new javax.swing.JButton();
        txtValor = new javax.swing.JFormattedTextField();
        txtData = new javax.swing.JFormattedTextField();
        cbxCategoria = new javax.swing.JComboBox<>();
        cbxFixaVariavel = new javax.swing.JComboBox<>();
        txtNome = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aviso.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        aviso.setForeground(new java.awt.Color(255, 0, 0));
        aviso.setText("Atenção você está editanto a entrada");
        getContentPane().add(aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 650, -1, -1));

        btnConfirmarEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ConfirmarGreen.png"))); // NOI18N
        btnConfirmarEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmarEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmarEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, 210, 130));

        btnCancelEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CancelarGreen.png"))); // NOI18N
        btnCancelEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 560, 210, 130));

        btnEditEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 560, 210, 130));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("R$");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        btnCadEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, 210, 130));

        txtValor.setBorder(null);
        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.##"))));
        txtValor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 331, 470, 50));

        txtData.setBorder(null);
        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtData.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 208, 260, 60));

        cbxCategoria.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salário", "Rendimento", "Presente", "Outros" }));
        cbxCategoria.setBorder(null);
        cbxCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 442, 510, 60));

        cbxFixaVariavel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cbxFixaVariavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Variável", "Fixa" }));
        cbxFixaVariavel.setBorder(null);
        cbxFixaVariavel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(cbxFixaVariavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 326, 280, 60));

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtNome.setBorder(null);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 213, 510, 50));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 21, 96, 37));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaEntrada (1)_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaInicial ti = new TelaInicial();
        ti.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnCadEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadEntradaActionPerformed
        String nome = txtNome.getText();
        String categoria = cbxCategoria.getSelectedItem().toString();
        double valor;
        if(txtValor.getText().isEmpty()){
                 valor = 0.0;
            }
            else{
                 valor = Double.parseDouble(txtValor.getText().replace(".", "").replace(",","."));
            }
        String fixa_variavel = cbxFixaVariavel.getSelectedItem().toString();        
        String Data_Transacao = txtData.getText().substring(6, 10) + "-" 
                                + txtData.getText().substring(3, 5)+ "-"
                                 + txtData.getText().substring(0, 2) ;
  

        DAO dao = new DAO();
        try {
            dao.cadastrarTransacao(tipo, nome, categoria, valor, fixa_variavel, ativo_passivo, Data_Transacao, tipo_invest);
        } catch (Exception ex) {
            Logger.getLogger(TelaEntrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtNome.setText("");
        cbxCategoria.setSelectedIndex(0);
        cbxFixaVariavel.setSelectedIndex(0);
        LocalDate dataAtual1 = LocalDate.now();       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String dataTxt = dataAtual1.format(formatter);
        txtData.setText(dataTxt);
        txtValor.setText("");

    }//GEN-LAST:event_btnCadEntradaActionPerformed

    private void btnEditEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditEntradaActionPerformed
        String verificaResp = JOptionPane.showInputDialog("Qual o ID da venda que você deseja editar?");
        btnConfirmarEdit.setVisible(true);
        btnCancelEntrada.setVisible(true);
        btnCadEntrada.setVisible(false);
        btnEditEntrada.setVisible(false);
// Verificar se o usuário clicou em "Cancelar" ou fechou a caixa de diálogo
if (verificaResp == null) {
    // Restaurar visibilidade dos botões
    btnConfirmarEdit.setVisible(false);
    btnCancelEntrada.setVisible(false);
    btnCadEntrada.setVisible(true);
    btnEditEntrada.setVisible(true);
} else {
    try {
        DAO dao = new DAO();
        int idMud = Integer.parseInt(verificaResp);
        
        Transferencia transfe = dao.getTransfe(idMud);
        if(!transfe.getEntrada_saida().equals("Entrada")){
            JOptionPane.showMessageDialog(null,"O id mencionado não é uma entrada.\n Tente novamente");
            btnConfirmarEdit.setVisible(false);
            btnCancelEntrada.setVisible(false);
            btnCadEntrada.setVisible(true);
            btnEditEntrada.setVisible(true);
        }
        else{
        this.id = idMud;
        txtNome.setText(transfe.getNome());
        txtValor.setText(Double.toString(transfe.getValor()).replace(".", ","));
        cbxCategoria.setSelectedItem(transfe.getCategoria());
        txtData.setText(transfe.getData_Transacao().substring(8, 10) + "/" 
                                + transfe.getData_Transacao().substring(5, 7)+ "/"
                                 + transfe.getData_Transacao().substring(0, 4));
        cbxFixaVariavel.setSelectedItem(transfe.getFixa_Variavel());
        aviso.setVisible(true);
        aviso.setText("Atenção você está editando a entrada " + idMud);
        }
   
    } catch (NumberFormatException e) {

        JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número válido.");
        btnConfirmarEdit.setVisible(false);
        btnCancelEntrada.setVisible(false);
        btnCadEntrada.setVisible(true);
        btnEditEntrada.setVisible(true);
    } catch (Exception ex) {
        // Tratar exceções ao tentar obter o produto
        JOptionPane.showMessageDialog(null, "Erro ao buscar o produto. Tente novamente.");
        
        // Restaurar visibilidade dos botões
        btnConfirmarEdit.setVisible(false);
        btnCancelEntrada.setVisible(false);
        btnCadEntrada.setVisible(true);
        btnEditEntrada.setVisible(true);
        }
    }       
    }//GEN-LAST:event_btnEditEntradaActionPerformed

    private void btnCancelEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelEntradaActionPerformed
        btnConfirmarEdit.setVisible(false);
        btnCancelEntrada.setVisible(false);
        btnCadEntrada.setVisible(true);
        btnEditEntrada.setVisible(true);
        txtNome.setText("");
        cbxCategoria.setSelectedIndex(0);
        cbxFixaVariavel.setSelectedIndex(0);
        LocalDate dataAtual1 = LocalDate.now();       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String dataTxt = dataAtual1.format(formatter);
        txtData.setText(dataTxt);
        txtValor.setText("");
        aviso.setVisible(false);
    }//GEN-LAST:event_btnCancelEntradaActionPerformed

    private void btnConfirmarEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarEditActionPerformed
        String nome = txtNome.getText();
        String categoria = cbxCategoria.getSelectedItem().toString();
        double valor;
        if(txtValor.getText().isEmpty()){
                 valor = 0.0;
            }
            else{
                 valor = Double.parseDouble(txtValor.getText().replace(".", "").replace(",","."));
            }
        String fixa_variavel = cbxFixaVariavel.getSelectedItem().toString();        
        String Data_Transacao = txtData.getText().substring(6, 10) + "-" 
                                + txtData.getText().substring(3, 5)+ "-"
                                 + txtData.getText().substring(0, 2) ;
  

        DAO dao = new DAO();
        try {
            dao.atualizaTransacao(id,tipo, nome, categoria, valor, fixa_variavel, ativo_passivo, Data_Transacao, tipo_invest);
        } catch (Exception ex) {
            Logger.getLogger(TelaEntrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtNome.setText("");
        cbxCategoria.setSelectedIndex(0);
        cbxFixaVariavel.setSelectedIndex(0);
        LocalDate dataAtual1 = LocalDate.now();       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String dataTxt = dataAtual1.format(formatter);
        txtData.setText(dataTxt);
        txtValor.setText("");
        btnConfirmarEdit.setVisible(false);
        btnCancelEntrada.setVisible(false);
        btnCadEntrada.setVisible(true);
        btnEditEntrada.setVisible(true);
        aviso.setVisible(false);
    }//GEN-LAST:event_btnConfirmarEditActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso;
    private javax.swing.JButton btnCadEntrada;
    private javax.swing.JButton btnCancelEntrada;
    private javax.swing.JButton btnConfirmarEdit;
    private javax.swing.JButton btnEditEntrada;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxFixaVariavel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
}