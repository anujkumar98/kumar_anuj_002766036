/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Person;
import models.PersonRegistry;

/**
 *
 * @author anujkumar
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchScreen
     */
    PersonRegistry personRecord;
    public SearchJPanel(PersonRegistry personRecord) {
        this.personRecord=personRecord;
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

        jLabelTitle = new javax.swing.JLabel();
        jLabelAgeGender = new javax.swing.JLabel();
        jLabelNameStartDate = new javax.swing.JLabel();
        jTextFieldNameStartDate = new javax.swing.JTextField();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelEmployeeID = new javax.swing.JLabel();
        jTextFieldEmployeeID = new javax.swing.JTextField();
        jLabelNameAge = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSearchResults = new javax.swing.JTable();
        jLabelTitleFilter = new javax.swing.JLabel();
        jButtonClear = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1200, 600));
        setRequestFocusEnabled(false);

        jLabelTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("SEARCH PERSON RECORD");
        jLabelTitle.setAlignmentY(0.0F);

        jLabelAgeGender.setText("Gender:");

        jLabelNameStartDate.setText("Start Date:");

        jTextFieldNameStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameStartDateActionPerformed(evt);
            }
        });

        jRadioButtonFemale.setText("Female");
        jRadioButtonFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemaleActionPerformed(evt);
            }
        });

        jRadioButtonMale.setText("Male");
        jRadioButtonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMaleActionPerformed(evt);
            }
        });

        jLabelName.setText("Name:");

        jLabelEmployeeID.setText("Employee Id:");

        jTextFieldEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmployeeIDActionPerformed(evt);
            }
        });

        jLabelNameAge.setText("Age:");

        jLabelEmail.setText("Email Address:");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTableSearchResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Age", "Email", "Cell Phone", "Start Date", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableSearchResults);

        jLabelTitleFilter.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabelTitleFilter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitleFilter.setText("Filters");
        jLabelTitleFilter.setAlignmentY(0.0F);

        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelNameStartDate)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNameStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelNameAge)
                                    .addComponent(jLabelAgeGender))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonFemale))
                                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelEmail)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelName)
                                    .addComponent(jLabelEmployeeID))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTitleFilter)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldName)
                                        .addComponent(jTextFieldEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonClear)
                                .addGap(30, 30, 30)
                                .addComponent(jButton1)
                                .addGap(10, 10, 10)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitleFilter)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmployeeID)
                            .addComponent(jTextFieldEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNameAge)
                            .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAgeGender)
                            .addComponent(jRadioButtonMale)
                            .addComponent(jRadioButtonFemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNameStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNameStartDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButtonClear))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameStartDateActionPerformed

    private void jRadioButtonFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemaleActionPerformed
        // TODO add your handling code here:
        if(jRadioButtonFemale.isSelected()){
            jRadioButtonMale.setSelected(false);

        }
    }//GEN-LAST:event_jRadioButtonFemaleActionPerformed

    private void jRadioButtonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMaleActionPerformed
        // TODO add your handling code here:
        if(jRadioButtonMale.isSelected()){
            jRadioButtonFemale.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButtonMaleActionPerformed

    private void jTextFieldEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmployeeIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        getSearchParameter();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        ArrayList<Person> emptyArrayList=new ArrayList<>();
        populate_table(emptyArrayList);
        jTextFieldName.setText("");
        jTextFieldEmployeeID.setText("");
        jTextFieldAge.setText("");
        jTextFieldNameStartDate.setText("");
        jTextFieldEmail.setText("");
        jRadioButtonFemale.setSelected(false);
        jRadioButtonMale.setSelected(false);
        
    }//GEN-LAST:event_jButtonClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JLabel jLabelAgeGender;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmployeeID;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNameAge;
    private javax.swing.JLabel jLabelNameStartDate;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitleFilter;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSearchResults;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmployeeID;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNameStartDate;
    // End of variables declaration//GEN-END:variables

    private void getSearchParameter() {
        Person personToSearch=new Person();
        personToSearch.setName(jTextFieldName.getText());
        personToSearch.setEmployeeId(jTextFieldEmployeeID.getText());
        try{
           personToSearch.setAge(Integer.parseInt(jTextFieldAge.getText()));
        }
        catch(NumberFormatException e){
            personToSearch.setAge(0);
            //JOptionPane.showMessageDialog(this,"Please enter age in numberic format");
        }
        try{
            personToSearch.setStartDate(LocalDate.parse(jTextFieldNameStartDate.getText()));
        }
        catch(Exception e){
            personToSearch.setStartDate(LocalDate.parse("1900-01-01"));
            //JOptionPane.showMessageDialog(this,"Please enter data in format YYYY-MM-DD");
        }
        personToSearch.setEmailAddress(jTextFieldEmail.getText());
        String gender="";
        if (jRadioButtonFemale.isSelected()){
            gender="Female";
        }
        else if(jRadioButtonMale.isSelected()){
            gender="Male";
        }
        personToSearch.setGender(gender);
        populate_table(personRecord.searchPerson(personToSearch));
    }

    private void populate_table(ArrayList<Person> searchPerson) {
        DefaultTableModel model=(DefaultTableModel) jTableSearchResults.getModel();
        model.setRowCount(0);
        for(Person p:searchPerson){
            Object[] row =new Object[7];
            row[0]=p.getEmployeeId();
            row[1]=p.getName();
            row[2]=p.getAge();
            row[3]=p.getEmailAddress();
            row[4]=p.getCellPhoneNumber();
            row[5]=p.getStartDate().toString();
            row[6]=p.getGender();
            model.addRow(row);
        }
    }
}
