/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.challenge.conversor.main;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import br.com.challenge.conversor.moeda.*;
import br.com.challenge.conversor.temperatura.*;
import br.com.challenge.conversor.massa.*;

/**
 *
 * @author Luan Flavio
 */
public class TelaPrincipal extends javax.swing.JFrame {
    String[] listaMenuPrincipal = {"Conversor de Moedas","Conversor de Temperatura", "Conversor de Massas"};
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        JComboBox<String> comboBox = new JComboBox<>();
        menuDrop.setModel(new DefaultComboBoxModel<>(listaMenuPrincipal));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuDrop = new javax.swing.JComboBox<>();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Challenge Alura | Conversor by Luan");
        setPreferredSize(new java.awt.Dimension(620, 300));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modelo/images/b6256fa6-5fde-4cdd-a4a3-d33ebc90_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 120, 300));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Challenge Alura");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 500, -1));

        menuDrop.setBackground(new java.awt.Color(255, 255, 255));
        menuDrop.setForeground(new java.awt.Color(0, 0, 0));
        menuDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDropActionPerformed(evt);
            }
        });
        jPanel1.add(menuDrop, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 126, 275, 33));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 267, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDropActionPerformed
        int escolhaMenuPricipal = menuDrop.getSelectedIndex();
        if(escolhaMenuPricipal == 0){
            TelaConversorMoeda telaConversorMoeda = new TelaConversorMoeda();
            telaConversorMoeda.setVisible(true);
            this.dispose();
        } else if(escolhaMenuPricipal == 1){
            TelaConversorTemperatura telaConversorTemperatura = new TelaConversorTemperatura();
            telaConversorTemperatura.setVisible(true);
            this.dispose();
        } else if(escolhaMenuPricipal == 2){
            TelaConversorMassa telaConversorMassa = new TelaConversorMassa();
            telaConversorMassa.setVisible(true);
        }
    }//GEN-LAST:event_menuDropActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> menuDrop;
    // End of variables declaration//GEN-END:variables
}
