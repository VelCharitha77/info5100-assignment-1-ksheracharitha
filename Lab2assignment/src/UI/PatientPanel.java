/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import model.Patient;

/**
 *
 * @author advai
 */
public class PatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientPanel
     */
    
    Patient patient;
    public PatientPanel(Patient patient) {
        initComponents();
        this.patient = patient;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PatientScreen = new javax.swing.JLabel();
        PatientID1 = new javax.swing.JLabel();
        DateofLV = new javax.swing.JLabel();
        DateofNA = new javax.swing.JLabel();
        Allergies_y_n = new javax.swing.JLabel();
        Medication_y_n = new javax.swing.JLabel();
        SetPatientID = new javax.swing.JTextField();
        SetDOLV = new javax.swing.JTextField();
        SetDofNA = new javax.swing.JTextField();
        Allergiesyn = new javax.swing.JTextField();
        Medicationyn = new javax.swing.JTextField();
        SAVE = new javax.swing.JButton();

        PatientScreen.setText("PatientDetails");

        PatientID1.setText("PatientID:");

        DateofLV.setText("DateofLastVisit:");

        DateofNA.setText("DateofNextAppointment:");

        Allergies_y_n.setText("Allergies(yes/no):");

        Medication_y_n.setText("Medication(yes/no):");

        SetPatientID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        SAVE.setText("SAVE");
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(PatientScreen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateofLV)
                            .addComponent(PatientID1)
                            .addComponent(DateofNA)
                            .addComponent(Allergies_y_n)
                            .addComponent(Medication_y_n))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SetDOLV, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(SetPatientID)
                            .addComponent(SetDofNA)
                            .addComponent(Allergiesyn)
                            .addComponent(Medicationyn, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(SAVE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PatientScreen)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatientID1)
                    .addComponent(SetPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateofLV)
                    .addComponent(SetDOLV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateofNA)
                    .addComponent(SetDofNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Allergies_y_n)
                    .addComponent(Allergiesyn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Medication_y_n)
                    .addComponent(Medicationyn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(SAVE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
        // TODO add your handling code here:
        
        patient.setAllergies(Allergiesyn.getText());
        patient.setDateofLV(SetDOLV.getText());
        patient.setMedication(Medicationyn.getText());
        patient.setNextAppointment(SetDofNA.getText());
        patient.setPatientID(SetPatientID.getText());
        JOptionPane.showMessageDialog(this,"SAVED");
        
    }//GEN-LAST:event_SAVEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Allergies_y_n;
    private javax.swing.JTextField Allergiesyn;
    private javax.swing.JLabel DateofLV;
    private javax.swing.JLabel DateofNA;
    private javax.swing.JLabel Medication_y_n;
    private javax.swing.JTextField Medicationyn;
    private javax.swing.JLabel PatientID1;
    private javax.swing.JLabel PatientScreen;
    private javax.swing.JButton SAVE;
    private javax.swing.JTextField SetDOLV;
    private javax.swing.JTextField SetDofNA;
    private javax.swing.JTextField SetPatientID;
    // End of variables declaration//GEN-END:variables
}
