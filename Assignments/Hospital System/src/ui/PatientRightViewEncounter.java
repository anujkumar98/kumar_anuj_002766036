/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Controller;
import model.Encounter;
import model.EncounterRecords;
import model.Person;
import model.VitalRecord;

/**
 *
 * @author kb282
 */
public class PatientRightViewEncounter extends javax.swing.JPanel {

    /**
     * Creates new form PatientLeftPanel
     */
    Person person;
    Controller system;
    public PatientRightViewEncounter(Controller system,Person person) {
        initComponents();
        this.person=person;
        this.system=system;
        List <Encounter> encounter= system.searchEncountersByPatient(null, person.getName());
        populateTable(encounter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableViewHistory = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        PatientSearchDoctorName = new javax.swing.JTextField();
        btnView_Search = new javax.swing.JButton();

        jTableViewHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Doctor Name", "Heartrate", "Temperature", "Allergies"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableViewHistory);

        jLabel28.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel28.setText("Doctor Name : ");

        PatientSearchDoctorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientSearchDoctorNameActionPerformed(evt);
            }
        });

        btnView_Search.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        btnView_Search.setText("Search");
        btnView_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView_SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PatientSearchDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(PatientSearchDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnView_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PatientSearchDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientSearchDoctorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientSearchDoctorNameActionPerformed

    private void btnView_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView_SearchActionPerformed
        // TODO add your handling code here:
        String name= PatientSearchDoctorName.getText();
        List <Encounter> encounter= system.searchEncountersByPatient(name, person.getName());
        populateTable(encounter);

    }//GEN-LAST:event_btnView_SearchActionPerformed
    
     void populateTable(List <Encounter> encounter){
    DefaultTableModel model=(DefaultTableModel) jTableViewHistory.getModel(); 
    model.setRowCount(0);
    for(Encounter e: encounter){
        VitalRecord vr= e.getVital();
        Object[] row = new Object[5];
        row[0] = e.getPatientUsername();
        row[1] = e.getDoctorUsername();
        row[2] = vr.getHeartrate();
        row[3] = vr.getTemperature();
        row[4] = vr.getAllergies();
        model.addRow(row);
    }
   
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PatientSearchDoctorName;
    private javax.swing.JButton btnView_Search;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableViewHistory;
    // End of variables declaration//GEN-END:variables
}