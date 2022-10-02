/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Person;
import models.PersonRegistory;

/**
 *
 * @author anujkumar
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    PersonRegistory personRecord;
    public ViewJPanel(PersonRegistory personRecord) {
        initComponents();
        this.personRecord=personRecord;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelAge = new javax.swing.JLabel();
        jTextFieldEmployeeId = new javax.swing.JTextField();
        jLabelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePersonDisplay = new javax.swing.JTable();
        jButtonFetchRecord = new javax.swing.JButton();
        jButtonDeleteRecord = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jLabelCellPhoneNumber = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldPositionTitle = new javax.swing.JTextField();
        jLabelCellPhoneNumber1 = new javax.swing.JLabel();
        jTextFieldLevel = new javax.swing.JTextField();
        jLabelEmail1 = new javax.swing.JLabel();
        jTextFieldTeamInfo = new javax.swing.JTextField();
        jLabelEmail2 = new javax.swing.JLabel();
        jTextFieldCellNumber = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1200, 600));
        setRequestFocusEnabled(false);

        jLabelName.setText("Name:");
        jLabelName.setLocation(new java.awt.Point(0, 6));

        jTextFieldName.setLocation(new java.awt.Point(0, 6));

        jLabelAge.setText("Employee Id:");
        jLabelAge.setLocation(new java.awt.Point(0, 6));

        jTextFieldEmployeeId.setLocation(new java.awt.Point(0, 6));
        jTextFieldEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmployeeIdActionPerformed(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("VIEW");
        jLabelTitle.setAlignmentY(0.0F);

        jTablePersonDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Name", "Age", "Email Adress", "Cell Phone ", "Position Title", "Level"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePersonDisplay);

        jButtonFetchRecord.setText("Fetch");
        jButtonFetchRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFetchRecordActionPerformed(evt);
            }
        });

        jButtonDeleteRecord.setText("Delete");
        jButtonDeleteRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteRecordActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabelCellPhoneNumber.setText("Age:");

        jLabelEmail.setText("Position Title:");

        jLabelCellPhoneNumber1.setText("Level:");

        jLabelEmail1.setText("Team Info:");

        jLabelEmail2.setText("Cell Phone Number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButtonFetchRecord)
                        .addGap(65, 65, 65)
                        .addComponent(jButtonUpdate)
                        .addGap(66, 66, 66)
                        .addComponent(jButtonDeleteRecord)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelCellPhoneNumber))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelName)
                            .addComponent(jLabelAge))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelEmail1)
                            .addComponent(jLabelCellPhoneNumber1)
                            .addComponent(jLabelEmail2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCellNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(jTextFieldTeamInfo)
                            .addComponent(jTextFieldLevel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonFetchRecord)
                            .addComponent(jButtonDeleteRecord)
                            .addComponent(jButtonUpdate)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAge)
                            .addComponent(jTextFieldEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCellPhoneNumber)
                            .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCellPhoneNumber1)
                            .addComponent(jTextFieldLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmail1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCellNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmail2))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmployeeIdActionPerformed

    private void jButtonFetchRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFetchRecordActionPerformed
        // TODO add your handling code here:
        int selectedIndex=jTablePersonDisplay.getSelectedRow();
        if (selectedIndex != -1){
            Person person=personRecord.fetchPerson(selectedIndex);
            jTextFieldName.setText(person.getName());
            jTextFieldAge.setText(String.valueOf(person.getAge()));
            jTextFieldEmployeeId.setText(person.getEmployeeId());
            jTextFieldPositionTitle.setText(person.getPositionTitle());
            jTextFieldLevel.setText(person.getLevel());
            jTextFieldTeamInfo.setText(person.getTeamInfo());
            jTextFieldCellNumber.setText(person.getCellPhoneNumber());
            return;
        }
        JOptionPane.showMessageDialog(this, "Please select a row to display");
    }//GEN-LAST:event_jButtonFetchRecordActionPerformed

    private void jButtonDeleteRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteRecordActionPerformed
        // TODO add your handling code here:
        int selectedIndex=jTablePersonDisplay.getSelectedRow();
        if (selectedIndex != -1){
            personRecord.deletePerson(selectedIndex);
            populateTable();
            JOptionPane.showMessageDialog(this, "Employee record deleted");
            jTextFieldName.setText("");
            jTextFieldEmployeeId.setText("");
            return;
        }
        JOptionPane.showMessageDialog(this, "Please select a row to delete");
    }//GEN-LAST:event_jButtonDeleteRecordActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        if (jTextFieldEmployeeId.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please fetch a row to update");
            return;
        }
        String uniqueID=jTextFieldEmployeeId.getText();//Get unique empolyee ID to update
        Person personUpdatedDetails=new Person();
        personUpdatedDetails.setName(jTextFieldName.getText());
        try{
        personUpdatedDetails.setAge(Integer.parseInt(jTextFieldAge.getText()));       
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Age must be entered in numbers.");
        }
        personUpdatedDetails.setEmployeeId(jTextFieldEmployeeId.getText());
        personUpdatedDetails.setPositionTitle(jTextFieldPositionTitle.getText());
        personUpdatedDetails.setLevel(jTextFieldLevel.getText());
        personUpdatedDetails.setTeamInfo(jTextFieldTeamInfo.getText());
        personUpdatedDetails.setCellPhoneNumber(jTextFieldCellNumber.getText());
        if (validateUpdateRecord(personUpdatedDetails)==1){
            personRecord.updatePerson(uniqueID,personUpdatedDetails);
            JOptionPane.showMessageDialog(this, "Record Updated.");
            jTextFieldName.setText("");
            jTextFieldEmployeeId.setText("");
            jTextFieldAge.setText("");
            jTextFieldPositionTitle.setText("");
            jTextFieldLevel.setText("");
            jTextFieldTeamInfo.setText("");
            jTextFieldCellNumber.setText("");
        }
        
        populateTable();
    }//GEN-LAST:event_jButtonUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteRecord;
    private javax.swing.JButton jButtonFetchRecord;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelCellPhoneNumber;
    private javax.swing.JLabel jLabelCellPhoneNumber1;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmail1;
    private javax.swing.JLabel jLabelEmail2;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePersonDisplay;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldCellNumber;
    private javax.swing.JTextField jTextFieldEmployeeId;
    private javax.swing.JTextField jTextFieldLevel;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPositionTitle;
    private javax.swing.JTextField jTextFieldTeamInfo;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model=(DefaultTableModel) jTablePersonDisplay.getModel();
        model.setRowCount(0);
        for(Person p:personRecord.getPersonRecord()){
            Object[] row =new Object[7];
            row[0]=p.getEmployeeId();
            row[1]=p.getName();
            row[2]=p.getAge();
            row[3]=p.getEmailAddress();
            row[4]=p.getCellPhoneNumber();
            row[5]=p.getPositionTitle();
            row[6]=p.getLevel();
            model.addRow(row);
        }
    }
    private int validateUpdateRecord(Person notValidated) {
        int validated=1;
        Pattern patternCellNumber = Pattern.compile("^[+\\d](\\d{11})$");
        Matcher matcherCell = patternCellNumber.matcher(notValidated.getCellPhoneNumber());
        if(notValidated.getName() == null || notValidated.getName().isEmpty()){
            JOptionPane.showMessageDialog(this,"Name cannot be empty.");
            validated=0;
        }
        else if(notValidated.getEmployeeId() == null || notValidated.getEmployeeId().isEmpty()){
            JOptionPane.showMessageDialog(this,"Employee Id cannot be empty.");
            validated=0;
        }
        else if(notValidated.getAge() < 16 || notValidated.getAge() > 99){
            JOptionPane.showMessageDialog(this,"Employee Age cannot be less than 16 or greater than 99.");
            validated=0;
        }
        else if(notValidated.getPositionTitle() == null || notValidated.getPositionTitle().isEmpty()){
            JOptionPane.showMessageDialog(this,"Employee position title cannot be empty.");
            validated=0;
        }
        else if(notValidated.getLevel() == null || notValidated.getLevel().isEmpty()){
            JOptionPane.showMessageDialog(this,"Employee level cannot be empty.");
            validated=0;
        }
        else if(notValidated.getTeamInfo() == null || notValidated.getTeamInfo().isEmpty()){
            JOptionPane.showMessageDialog(this,"Employee team info cannot be empty.");
            validated=0;
        }
        
        else if(notValidated.getCellPhoneNumber() == null || notValidated.getCellPhoneNumber().isEmpty()){
            JOptionPane.showMessageDialog(this,"Employee cell phone cannot be empty.");
            validated=0;
        }
        else if (!matcherCell.matches()){
            JOptionPane.showMessageDialog(this,"Employee phone number should be valid.");
            validated=0;
        }
        return validated;
    }

}
