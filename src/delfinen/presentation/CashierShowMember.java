/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.presentation;

import delfinen.data.Member;
import delfinen.data.Payment;
import delfinen.filehandler.CashierFile;
import delfinen.logic.Controller;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Obaydah Mohamad
 */
public class CashierShowMember extends javax.swing.JFrame {
    Member member;
    private int id;
    Controller ctrl = new Controller();
    /**
     * Creates new form CashierShowMember
     */
    public CashierShowMember() {
        this.member = ctrl.getMember(id);
        initComponents();
    }
    
    public CashierShowMember(int id){
        this.id = id;
        this.member = ctrl.getMember(id);
        
        initComponents();
        memberName.setText(member.getFirstName() + " " + member.getLastName());
        memberId.setText(Integer.toString(member.getId()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        memberIdLabel = new javax.swing.JLabel();
        memberId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        memberNameLabel = new javax.swing.JLabel();
        memberName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        paymentIdLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        addPaymentField = new javax.swing.JTextField();
        addPaymentButton = new javax.swing.JButton();
        addPaymentLabel = new javax.swing.JLabel();
        deficitLabel = new javax.swing.JLabel();
        deficit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        memberIdLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        memberIdLabel.setText("Medlem id:");

        DefaultListModel paymentList = new DefaultListModel();
        ArrayList<Payment> payments = CashierFile.getPaymentsByMember(id);
        if(payments.size() < 1){
            paymentList.addElement("Ingen betalinger at finde " + payments.size());
        }else{
            for(int i = 0; i < payments.size(); i++){
                int status = payments.get(i).getStatus();
                String isPaid = "*IKKE BETALT*";
                if(status == 1) isPaid = "BETALT";
                int paymentId = payments.get(i).getPaymentId();
                int amount = payments.get(i).getAmount();
                String date = payments.get(i).getDate();

                paymentList.addElement("BetalingsId: "+ paymentId + ":    (Beløb: " + amount + "kr. - Dato: " + date + " - Status: " + isPaid + ")");
            }
        }
        jList1.setModel(paymentList);
        jScrollPane1.setViewportView(jList1);

        memberNameLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        memberNameLabel.setText("Medlem:");

        paymentIdLabel.setText("Indtast betalings Id");

        backButton.setText("Tilbage");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addPaymentButton.setText("Registrer betaling");
        addPaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPaymentButtonActionPerformed(evt);
            }
        });

        addPaymentLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addPaymentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addPaymentLabel.setText("Registrer betaling");

        deficitLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deficitLabel.setText("Restance:");

        int intDeficit = CashierFile.getDeficitByMember(id);
        if(intDeficit == 0){
            deficit.setText("0");
        }else{
            deficit.setText("-" + Integer.toString(intDeficit));
            deficit.setForeground(Color.red);
            Font f = deficit.getFont();
            deficit.setFont(f.deriveFont(f.getStyle() ^ Font.BOLD));
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addPaymentField)
                    .addComponent(addPaymentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPaymentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(memberIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memberId))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(memberNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memberName))
                            .addComponent(paymentIdLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deficitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deficit)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(memberId)
                            .addComponent(memberIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(memberName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(memberNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deficitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deficit))
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPaymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(paymentIdLabel)
                        .addGap(5, 5, 5)
                        .addComponent(addPaymentField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addPaymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backButton)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new CashierChoice().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addPaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPaymentButtonActionPerformed
        String passedId = addPaymentField.getText();
        CashierFile.addPayment(passedId);
    }//GEN-LAST:event_addPaymentButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CashierShowMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierShowMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierShowMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierShowMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierShowMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPaymentButton;
    private javax.swing.JTextField addPaymentField;
    private javax.swing.JLabel addPaymentLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel deficit;
    private javax.swing.JLabel deficitLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel memberId;
    private javax.swing.JLabel memberIdLabel;
    private javax.swing.JLabel memberName;
    private javax.swing.JLabel memberNameLabel;
    private javax.swing.JLabel paymentIdLabel;
    // End of variables declaration//GEN-END:variables
}
