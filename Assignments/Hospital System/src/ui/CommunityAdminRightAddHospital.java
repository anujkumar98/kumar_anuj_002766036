/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Controller;
import model.Hospital;
import model.HospitalDirectory;

/**
 *
 * @author renuka
 */
public class CommunityAdminRightAddHospital extends javax.swing.JPanel {

    /**
     * Creates new form ComAdminJPanel
     */
    Controller system;
    public CommunityAdminRightAddHospital(Controller system) {
        initComponents();
        this.system = system;
        HospitalDirectory hd= system.getHospitalDirectory();
        List<Hospital> hospitals = hd.getHospitalList();
        populateTable(hospitals);
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        workArea = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCommunityName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospital = new javax.swing.JTable();
        btnAddHospitals = new javax.swing.JButton();
        jButtonDeleteHospital = new javax.swing.JButton();

        workArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setText("Hospital Name : ");

        jLabel6.setText("City : ");

        jLabel1.setText("Community Name :");

        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hospital Name", "City", "Community Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHospital);

        btnAddHospitals.setText("Add Hospital");
        btnAddHospitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHospitalsActionPerformed(evt);
            }
        });

        jButtonDeleteHospital.setText("Delete Hospital");
        jButtonDeleteHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteHospitalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel3))
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(workAreaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(workAreaLayout.createSequentialGroup()
                                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(63, 63, 63)
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonDeleteHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddHospitals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(workAreaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnAddHospitals))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonDeleteHospital))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(workArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(workArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddHospitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHospitalsActionPerformed
        // TODO add your handling code here:
        String name = txtHospitalName.getText();
        String city = txtCity.getText();
        String CommunityName = txtCommunityName.getText();
        int validate=validateInputFields(name,city,CommunityName);
        if(validate == 1){
            system.addHospital(name, city, CommunityName);
            HospitalDirectory hd= system.getHospitalDirectory();
            List<Hospital> hospitals = hd.getHospitalList();
            populateTable(hospitals);
            txtHospitalName.setText("");
            txtCity.setText("");     
            txtCommunityName.setText("");
        }
    }//GEN-LAST:event_btnAddHospitalsActionPerformed

    private int validateInputFields(String name,String city,String CommunityName) {
        //Function to validate the input fields
        int validated=1;
        
        if(name == null || name.isEmpty()){
            JOptionPane.showMessageDialog(this,"Hospital name cannot be empty.");
            validated=0;
        }
        else if(city == null || city.isEmpty()){
            JOptionPane.showMessageDialog(this,"City cannot be empty.");
            validated=0;
        }
        else if(CommunityName == null || CommunityName.isEmpty()){
            JOptionPane.showMessageDialog(this,"Community name cannot be empty.");
            validated=0;
        }
        return validated;
    }
    private void jButtonDeleteHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteHospitalActionPerformed
        // TODO add your handling code here:
        
        int selectedIndex=tblHospital.getSelectedRow();
        if (selectedIndex >= 0){
            HospitalDirectory hd= system.getHospitalDirectory();
            List<Hospital> hospitals = hd.getHospitalList();
            Hospital h= hospitals.get(selectedIndex);
            String hospitalName=h.getName();
            system.removeHospital(hospitalName);
            hd= system.getHospitalDirectory();
            hospitals = hd.getHospitalList();
            populateTable(hospitals);
            //populateTable();
            JOptionPane.showMessageDialog(this, "Hospital record deleted");
            
            return;
        }
        JOptionPane.showMessageDialog(this, "Please select a row to delete");
    }//GEN-LAST:event_jButtonDeleteHospitalActionPerformed

void populateTable(List <Hospital> hospitals){
    DefaultTableModel model=(DefaultTableModel) tblHospital.getModel(); 
    model.setRowCount(0);
    for(Hospital h: hospitals){
        Object[] row = new Object[3];
        row[0] = h.getName();
        row[1] = h.getCity();
        row[2] = h.getCommunityName();
        
        model.addRow(row);
    }
    
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddHospitals;
    private javax.swing.JButton jButtonDeleteHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHospital;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}

