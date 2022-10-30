/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Controller;
import model.Encounter;
import model.Hospital;
import model.HospitalDirectory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.VitalRecord;

/**
 *
 * @author anujkumar
 */
public class DoctorRightViewPatientHistory extends javax.swing.JPanel {

    /**
     * Creates new form ViewDoctorJpanel
     */
    Controller system;
    Person person;
    public DoctorRightViewPatientHistory(Controller system,Person person) {
        initComponents();
        this.system=system;
        this.person=person;
         List<Encounter> encounter= system.searchEncountersByDoctor(person.getuserName());
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

        btnView_Search = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        DoctorSearchPatientName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableViewHistory = new javax.swing.JTable();

        btnView_Search.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        btnView_Search.setText("Search");
        btnView_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView_SearchActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jLabel28.setText("Patient Name : ");

        DoctorSearchPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorSearchPatientNameActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel19.setText("View ");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DoctorSearchPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(DoctorSearchPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(btnView_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnView_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView_SearchActionPerformed
        // TODO add your handling code here:
        String name= DoctorSearchPatientName.getText();
        if (name.isEmpty() || name == null){
            JOptionPane.showMessageDialog(this,"Name cannot be empty.");
            return;
        }
        List <Encounter> encounter = system.searchEncountersByPatient(person.getuserName(),name);
        populateTable(encounter);
        
    }//GEN-LAST:event_btnView_SearchActionPerformed
    
    private void DoctorSearchPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorSearchPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorSearchPatientNameActionPerformed

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
    private javax.swing.JTextField DoctorSearchPatientName;
    private javax.swing.JButton btnView_Search;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableViewHistory;
    // End of variables declaration//GEN-END:variables
}
