/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.Controller;
import model.Person;

/**
 *
 * @author anujkumar
 */
public class PatientAfterLogin extends javax.swing.JFrame {

    /**
     * Creates new form DoctorAfterLogin
     */
    static Person person;
    private static Controller system;
    public PatientAfterLogin(Controller system,Person p ) {
        initComponents();
        this.system=system;
        this.person=p;
        jLabelRole.setText(person.getRole().toString());
        jLabelName.setText(person.getName());
        jLabelUserName.setText(person.getuserName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPaneDoctor = new javax.swing.JSplitPane();
        jPanelLeftPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelRole = new javax.swing.JLabel();
        jButtonSearchHospital = new javax.swing.JButton();
        jButtonViewHistory = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jPanelRightPane = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Details");

        jLabel2.setText("Name");

        jLabel3.setText("Username");

        jLabel4.setText("Role");

        jButtonSearchHospital.setText("Search Hospital");
        jButtonSearchHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchHospitalActionPerformed(evt);
            }
        });

        jButtonViewHistory.setText("View History");
        jButtonViewHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewHistoryActionPerformed(evt);
            }
        });

        jButtonLogout.setText("Logout");

        javax.swing.GroupLayout jPanelLeftPaneLayout = new javax.swing.GroupLayout(jPanelLeftPane);
        jPanelLeftPane.setLayout(jPanelLeftPaneLayout);
        jPanelLeftPaneLayout.setHorizontalGroup(
            jPanelLeftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeftPaneLayout.createSequentialGroup()
                .addGroup(jPanelLeftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLeftPaneLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(jPanelLeftPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelName))
                    .addGroup(jPanelLeftPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelUserName))
                    .addGroup(jPanelLeftPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelRole))
                    .addGroup(jPanelLeftPaneLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanelLeftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSearchHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonViewHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLeftPaneLayout.setVerticalGroup(
            jPanelLeftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLeftPaneLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanelLeftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLeftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLeftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelRole))
                .addGap(31, 31, 31)
                .addComponent(jButtonSearchHospital)
                .addGap(18, 18, 18)
                .addComponent(jButtonViewHistory)
                .addGap(18, 18, 18)
                .addComponent(jButtonLogout)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jSplitPaneDoctor.setLeftComponent(jPanelLeftPane);

        javax.swing.GroupLayout jPanelRightPaneLayout = new javax.swing.GroupLayout(jPanelRightPane);
        jPanelRightPane.setLayout(jPanelRightPaneLayout);
        jPanelRightPaneLayout.setHorizontalGroup(
            jPanelRightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );
        jPanelRightPaneLayout.setVerticalGroup(
            jPanelRightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        jSplitPaneDoctor.setRightComponent(jPanelRightPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneDoctor, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchHospitalActionPerformed
        // TODO add your handling code here:
        PatientRightSearchHospital prsh=new PatientRightSearchHospital(system,person);
        jSplitPaneDoctor.setRightComponent(prsh);
    }//GEN-LAST:event_jButtonSearchHospitalActionPerformed

    private void jButtonViewHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewHistoryActionPerformed
        // TODO add your handling code here:
        PatientRightViewEncounter prve=new PatientRightViewEncounter(system,person);
        jSplitPaneDoctor.setRightComponent(prve);
    }//GEN-LAST:event_jButtonViewHistoryActionPerformed

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
            java.util.logging.Logger.getLogger(PatientAfterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientAfterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientAfterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientAfterLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientAfterLogin(system,person).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonSearchHospital;
    private javax.swing.JButton jButtonViewHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelRole;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JPanel jPanelLeftPane;
    private javax.swing.JPanel jPanelRightPane;
    private javax.swing.JSplitPane jSplitPaneDoctor;
    // End of variables declaration//GEN-END:variables
}