/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.presentation;

import delfinen.data.CompetitiveTeam;
import delfinen.data.Discipline;
import static delfinen.data.Discipline.BRYST;
import static delfinen.data.Discipline.BUTTERFLY;
import static delfinen.data.Discipline.CRAWL;
import static delfinen.data.Discipline.RYGCRAWL;
import delfinen.data.JuniorTeam;
import delfinen.data.MotionistTeam;
import delfinen.data.SeniorTeam;
import delfinen.data.Team;
import delfinen.filehandler.PresidentFile;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author sinanjasar
 */
public class EditMember extends javax.swing.JFrame {

    CompetitiveTeam competitiveTeam = new CompetitiveTeam("Konkurrenceholdet");
    MotionistTeam motionistTeam = new MotionistTeam("Motionistholdet");
    JuniorTeam juniorTeam = new JuniorTeam("Juniorholdet");
    SeniorTeam seniorTeam = new SeniorTeam("Seniorholdet");

    /**
     * Creates new form SearchForMember
     */
    public EditMember() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        medlemsID = new javax.swing.JTextField();
        Aktivitetsform = new javax.swing.JLabel();
        aktiv = new javax.swing.JRadioButton();
        passiv = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        Crawl = new javax.swing.JRadioButton();
        Rygcrawl = new javax.swing.JRadioButton();
        Brystsvømning = new javax.swing.JRadioButton();
        Butterfly = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dayBox = new javax.swing.JComboBox<>();
        monthBox = new javax.swing.JComboBox<>();
        Rediger = new javax.swing.JButton();
        motionist = new javax.swing.JRadioButton();
        yearBox = new javax.swing.JComboBox<>();
        konkurrence = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Indtast medlemmets ID");

        medlemsID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medlemsIDActionPerformed(evt);
            }
        });

        Aktivitetsform.setText("Aktivitetsform");

        buttonGroup1.add(aktiv);
        aktiv.setText("Aktivt medlemsskab");
        aktiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aktivActionPerformed(evt);
            }
        });

        buttonGroup1.add(passiv);
        passiv.setText("Passivt medlemsskab");
        passiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passivActionPerformed(evt);
            }
        });

        jLabel5.setText("Disciplin");

        buttonGroup2.add(Crawl);
        Crawl.setText("Crawl");

        buttonGroup2.add(Rygcrawl);
        Rygcrawl.setText("Rygcrawl");

        buttonGroup2.add(Brystsvømning);
        Brystsvømning.setText("Brystsvømning");

        buttonGroup2.add(Butterfly);
        Butterfly.setText("Butterfly");

        jLabel6.setText("Holdtype");

        jLabel2.setText("Fornavn");

        jLabel3.setText("Efternavn");

        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        lastName.setText(" ");
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Fødselsdag");

        dayBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dayBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayBoxActionPerformed(evt);
            }
        });

        monthBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        monthBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthBoxActionPerformed(evt);
            }
        });

        Rediger.setText("Ændr");
        Rediger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedigerActionPerformed(evt);
            }
        });

        buttonGroup3.add(motionist);
        motionist.setText("Motionist");

        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        int yearLen =  yearNow-1900+1;
        int year = 1900;
        int yearPos = 0;
        String[] years = new String[yearLen];

        for(int i = 1; i < yearLen+1; i++){
            years[yearPos] = Integer.toString(year);
            year++;
            yearPos++;
        }
        yearBox.setModel(new javax.swing.DefaultComboBoxModel<>(years));
        yearBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearBoxActionPerformed(evt);
            }
        });

        buttonGroup3.add(konkurrence);
        konkurrence.setText("Konkurrence");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(medlemsID)
                                .addGap(7, 7, 7)))
                        .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(416, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(aktiv)
                                                .addComponent(passiv)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(Aktivitetsform)))
                                    .addGap(88, 88, 88)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(konkurrence)
                                        .addComponent(motionist)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(298, 298, 298)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Rygcrawl)
                                        .addComponent(Butterfly)
                                        .addComponent(Crawl)
                                        .addComponent(Brystsvømning)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(450, 450, 450)
                            .addComponent(Rediger)))
                    .addGap(98, 98, 98)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medlemsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(273, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Crawl))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Brystsvømning)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Butterfly)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Rygcrawl)
                    .addGap(45, 45, 45)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Aktivitetsform))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(aktiv)
                        .addComponent(motionist))
                    .addGap(2, 2, 2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passiv)
                        .addComponent(konkurrence))
                    .addGap(4, 4, 4)
                    .addComponent(Rediger)
                    .addContainerGap(88, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void medlemsIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medlemsIDActionPerformed

    }//GEN-LAST:event_medlemsIDActionPerformed

    private void aktivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aktivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aktivActionPerformed

    private void passivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passivActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed

    }//GEN-LAST:event_firstNameActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void dayBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayBoxActionPerformed

    }//GEN-LAST:event_dayBoxActionPerformed

    private void monthBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthBoxActionPerformed

    private void RedigerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedigerActionPerformed

        String editTerm = this.medlemsID.getText();
        String newFirstName = this.firstName.getText();
        String newLastName = this.lastName.getText();
        boolean active = this.aktiv.isSelected();
        boolean passive = this.passiv.isSelected();
        String newActivity = "";
        boolean crawl = this.Crawl.isSelected();
        boolean bryst = this.Brystsvømning.isSelected();
        boolean butterfly = this.Butterfly.isSelected();
        boolean rygcrawl = this.Rygcrawl.isSelected();
        Discipline newDis = null;
        int day = Integer.parseInt((String) dayBox.getSelectedItem());
        int month = Integer.parseInt((String) monthBox.getSelectedItem());
        int year = Integer.parseInt((String) yearBox.getSelectedItem());
        Team newTeam = null;
        boolean competitive = this.konkurrence.isSelected();
        boolean motionist = this.motionist.isSelected();

        try {

            if (active) {
                newActivity = "active";
            }
            if (passive) {
                newActivity = "passive";
            }

            if (!active && !passive) {
                throw new Exception("Activity not chosen");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vælg venligst din aktivitetsform");
        }

        try {

            if (crawl) {
                newDis = CRAWL;
            }
            if (bryst) {
                newDis = BRYST;
            }
            if (butterfly) {
                newDis = BUTTERFLY;
            }
            if (rygcrawl) {
                newDis = RYGCRAWL;
            }

            if (!crawl && !bryst && !butterfly && !rygcrawl) {
                throw new Exception("Discipline not chosen");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vælg venligst din(e) disciplin(er)");
        }

        try {

            if (competitive) {
                newTeam = competitiveTeam;
                if (ChronoUnit.YEARS.between(LocalDate.of(year, month, day), LocalDate.now()) < 18) {
                    PresidentFile.DeleteJuniorMember(editTerm);
                } else {
                }
                if (motionist) {
                    newTeam = motionistTeam;
                }

            }
        } catch (Exception e) {
        }

        PresidentFile.editMember(editTerm, newFirstName, newLastName, newActivity, String.valueOf(LocalDate.of(year, month, day)), String.valueOf(newDis), String.valueOf(newTeam));
        PresidentFile.editJuniorMember(editTerm, newFirstName, newLastName, newActivity, String.valueOf(LocalDate.of(year, month, day)), String.valueOf(newDis), String.valueOf(newTeam));
        PresidentFile.editSeniorMember(editTerm, newFirstName, newLastName, newActivity, String.valueOf(LocalDate.of(year, month, day)), String.valueOf(newDis), String.valueOf(newTeam));
    }//GEN-LAST:event_RedigerActionPerformed

    private void yearBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearBoxActionPerformed

    }//GEN-LAST:event_yearBoxActionPerformed

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
            java.util.logging.Logger.getLogger(EditMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aktivitetsform;
    private javax.swing.JRadioButton Brystsvømning;
    private javax.swing.JRadioButton Butterfly;
    private javax.swing.JRadioButton Crawl;
    private javax.swing.JButton Rediger;
    private javax.swing.JRadioButton Rygcrawl;
    private javax.swing.JRadioButton aktiv;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> dayBox;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton konkurrence;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField medlemsID;
    private javax.swing.JComboBox<String> monthBox;
    private javax.swing.JRadioButton motionist;
    private javax.swing.JRadioButton passiv;
    private javax.swing.JComboBox<String> yearBox;
    // End of variables declaration//GEN-END:variables
}
