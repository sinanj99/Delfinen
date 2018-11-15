/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.presentation;

import delfinen.data.CompetitiveMember;
import delfinen.data.CompetitiveTeam;
import delfinen.data.Discipline;
import static delfinen.data.Discipline.BRYST;
import static delfinen.data.Discipline.BUTTERFLY;
import static delfinen.data.Discipline.CRAWL;
import static delfinen.data.Discipline.RYGCRAWL;
import delfinen.data.JuniorTeam;
import delfinen.data.Member;
import delfinen.data.MotionistTeam;
import delfinen.data.SeniorTeam;
import delfinen.data.Team;
import delfinen.filehandler.PresidentFile;
import delfinen.logic.Controller;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author sinanjasar
 */
public class RegisterMember extends javax.swing.JFrame {

    /**
     * Creates new form GUIDelfinen2
     */
    public RegisterMember() {
        
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
        jLabel2 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dayBox = new javax.swing.JComboBox<>();
        monthBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        yearBox = new javax.swing.JComboBox<>();
        Aktivitetsform = new javax.swing.JLabel();
        aktiv = new javax.swing.JRadioButton();
        passiv = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        Crawl = new javax.swing.JRadioButton();
        Rygcrawl = new javax.swing.JRadioButton();
        Brystsvømning = new javax.swing.JRadioButton();
        Butterfly = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        motionist = new javax.swing.JRadioButton();
        konkurrence = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fornavn");

        jLabel2.setText("Efternavn");

        firstName.setText("Indtast fornavn");
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        lastName.setText("Indtast efternavn");

        jLabel3.setText("Fødselsdag");

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

        jButton1.setText("Registrer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        buttonGroup3.add(Crawl);
        Crawl.setText("Crawl");

        buttonGroup3.add(Rygcrawl);
        Rygcrawl.setText("Rygcrawl");

        buttonGroup3.add(Brystsvømning);
        Brystsvømning.setText("Brystsvømning");

        buttonGroup3.add(Butterfly);
        Butterfly.setText("Butterfly");

        jLabel6.setText("Holdtype");

        buttonGroup2.add(motionist);
        motionist.setText("Motionist");

        buttonGroup2.add(konkurrence);
        konkurrence.setText("Konkurrence");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aktiv)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(passiv)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(Aktivitetsform)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Rygcrawl)
                                    .addComponent(Butterfly)
                                    .addComponent(Crawl)
                                    .addComponent(Brystsvømning)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(konkurrence)
                                    .addComponent(motionist))
                                .addGap(18, 18, 18)))
                        .addGap(0, 115, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Crawl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Brystsvømning, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Butterfly)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rygcrawl)))
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
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed

    }//GEN-LAST:event_firstNameActionPerformed

    private void dayBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayBoxActionPerformed

    }//GEN-LAST:event_dayBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int userId = PresidentFile.getLatestId();
        Controller ctrl = new Controller();
        PresidentFile ff = new PresidentFile();
        
        String firstName = this.firstName.getText();
        String lastName = this.lastName.getText();
        
        boolean active = this.aktiv.isSelected();
        boolean passive = this.passiv.isSelected();
        String activity = null;
        
        boolean competitive = this.konkurrence.isSelected();
        boolean motionist = this.motionist.isSelected();
        Team team = null;
        Member member = null;
        CompetitiveMember competitiveMember = null;
        
        boolean crawl = this.Crawl.isSelected();
        boolean bryst = this.Brystsvømning.isSelected();
        boolean butterfly = this.Butterfly.isSelected();
        boolean rygcrawl = this.Rygcrawl.isSelected();
        Discipline dis = null;
        
        int day = Integer.parseInt((String) dayBox.getSelectedItem()); 
        int month = Integer.parseInt((String) monthBox.getSelectedItem());
        int year = Integer.parseInt((String) yearBox.getSelectedItem());
        CompetitiveTeam competitiveTeam = new CompetitiveTeam("Competitive");
        MotionistTeam motionistTeam = new MotionistTeam("Motionist");
        JuniorTeam juniorTeam = new JuniorTeam("Junior");
        SeniorTeam seniorTeam = new SeniorTeam("Senior");
        
        try {

            if(active) {
                activity = "active";
            }
            if(passive) {
                activity = "passive";
            }

            if (!active && !passive) {
                throw new Exception("Activity not chosen");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vælg venligst din aktivitetsform");
        }
        
        try {

            if(crawl) {
                dis = CRAWL;
            }
            if(bryst) {
                dis = BRYST;
            }
            if(butterfly)
            {
               dis = BUTTERFLY;
            }
            if(rygcrawl)
            {
               dis = RYGCRAWL;
            }

            if (!crawl && !bryst && !butterfly && !rygcrawl) {
                throw new Exception("Discipline not chosen");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vælg venligst din(e) disciplin(er)");
        }
         
         try {
             
            if(competitive) {
                competitiveMember = ctrl.createCompetitiveMember(userId, firstName, lastName, activity, LocalDate.of(year,month,day), dis, team);
                ctrl.addCompetitiveMember(competitiveMember, competitiveTeam);
                if(ChronoUnit.YEARS.between(LocalDate.of(year,month,day), LocalDate.now()) <= 18)
                {
                    PresidentFile.printJuniorTeamMembers();
                }
                else
                {
                    ctrl.addSeniorMember(competitiveMember, seniorTeam);
                    PresidentFile.printSeniorTeamMembers();
                }
                //PresidentFile.printCompetitiveTeamMembers(competitiveTeam.getCompetitiveMembers());
                PresidentFile.printCompetitiveTeamMembers(ctrl.createCompetitiveMember(userId, firstName, lastName, activity, LocalDate.of(year,month,day), dis, team));
            }
            if(motionist) {
                member = ctrl.createMember(userId, firstName, lastName, activity, LocalDate.of(year,month,day), dis, team);
                ctrl.addMotionistMember(member, motionistTeam);
                //PresidentFile.printMotionistTeamMembers(motionistTeam.getMotionistMembers());
                PresidentFile.printMotionistTeamMembers(ctrl.createMember(day, firstName, lastName, activity, LocalDate.of(year,month,day), dis, team));
            }

            
        } catch (Exception e) {
        }
         
        try{
            if (!competitive && !motionist) {
               throw new Exception("Team type not chosen");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vælg venligst din holdtype");
        }
         
        try {
            if(motionist){
                PresidentFile.printMember(ctrl.createMember(userId, firstName, lastName, activity, LocalDate.of(year, month, day), dis, team));
                PresidentFile.printMotionistTeamMembers(ctrl.createMember(userId, firstName, lastName, activity, LocalDate.of(year,month,day), dis, team));
            }
            
            if(competitive){
                PresidentFile.printCompetitiveMember(ctrl.createCompetitiveMember(userId, firstName, lastName, activity, LocalDate.of(year,month,day), dis, team));
                PresidentFile.printCompetitiveTeamMembers(ctrl.createCompetitiveMember(userId, firstName, lastName, activity, LocalDate.of(year,month,day), dis, team));
            }
        } catch (IOException e) {
          
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void yearBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearBoxActionPerformed
       
    }//GEN-LAST:event_yearBoxActionPerformed

    private void monthBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthBoxActionPerformed

    private void aktivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aktivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aktivActionPerformed

    private void passivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passivActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aktivitetsform;
    private javax.swing.JRadioButton Brystsvømning;
    private javax.swing.JRadioButton Butterfly;
    private javax.swing.JRadioButton Crawl;
    private javax.swing.JRadioButton Rygcrawl;
    private javax.swing.JRadioButton aktiv;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> dayBox;
    private javax.swing.JTextField firstName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton konkurrence;
    private javax.swing.JTextField lastName;
    private javax.swing.JComboBox<String> monthBox;
    private javax.swing.JRadioButton motionist;
    private javax.swing.JRadioButton passiv;
    private javax.swing.JComboBox<String> yearBox;
    // End of variables declaration//GEN-END:variables
}
