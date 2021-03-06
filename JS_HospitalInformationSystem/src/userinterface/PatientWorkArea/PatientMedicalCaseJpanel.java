/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientWorkArea;

import Business.Clinical.ClinicalRecord;
import Business.Enterprise.Enterprise;
import Business.HIS;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClinicalWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.Patientaskmedicine.askformedicine;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cheny
 */
public class PatientMedicalCaseJpanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientMedicalCaseJpanel
     */
     
    JPanel userProcessContainer;
    Enterprise enterprise;
    Organization org;
    UserAccount account;
    HIS system;
    Network network;
   public PatientMedicalCaseJpanel(JPanel userProcessContainer, HIS system, Network network,Enterprise enterprise,Organization org,UserAccount account) {
       initComponents();
        Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize);
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.org=org;
        this.account=account;
        this.system=system;
        this.network=network;
        populateTable();
     }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) ClinicalRecordJTable.getModel();
        model.setRowCount(0);
        for (Network n : system.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount ua: o.getUserAccountDirectory().getUserAccountList()){
                        if(ua.getRole().toString().equals("Doctor")){
                            for(WorkRequest wr:ua.getWorkQueue().getWorkRequestList()){
                                ClinicalWorkRequest cwr=(ClinicalWorkRequest) wr;
                                ClinicalRecord cwrTemp=cwr.getClinicalrecord();
                                if(cwrTemp!=null&&cwrTemp.getPatientName()==account){
                                    Object[] row = new Object[8];
                                    row[0] = cwrTemp;
                                    row[1] = cwrTemp.getDoctorName();
                                    row[2] = cwrTemp.getPatientName();
                                    row[3] = cwrTemp.getCondition();
                                    row[4] = cwrTemp.getMedicine();
                                    row[5] = cwrTemp.getQuantity();
                                    row[6] = cwrTemp.getRemark();
                                    row[7]=cwrTemp.getStatus();
                                    model.addRow(row);
                                }
                            }
                        }
                    }
                }
            }
        }
     
    }
    PatientMedicalCaseJpanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount useraccount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClinicalRecordJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(224, 224, 224));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        backJButton.setBackground(new java.awt.Color(224, 224, 224));
        backJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(224, 224, 224));

        ClinicalRecordJTable.setBackground(new java.awt.Color(224, 224, 224));
        ClinicalRecordJTable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ClinicalRecordJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "HospitalName", "DoctorName", "PatientName", "Condition", "Medicine", "Quantity", "Remark", "Medicine status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ClinicalRecordJTable.setGridColor(new java.awt.Color(0, 0, 0));
        ClinicalRecordJTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        ClinicalRecordJTable.setSelectionForeground(new java.awt.Color(255, 255, 0));
        jScrollPane1.setViewportView(ClinicalRecordJTable);

        jButton1.setBackground(new java.awt.Color(224, 224, 224));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("ask for medicine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(224, 224, 224));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Hospital Information System - PatientMedicalCase");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(908, 908, 908)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(0, 657, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(609, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
         int selectedrow=ClinicalRecordJTable.getSelectedRow();
        if(selectedrow>=0){
            ClinicalRecord cr =(ClinicalRecord)ClinicalRecordJTable.getValueAt(selectedrow,0);
             if(cr.getStatus().equals("waitingformedicine")){
                 JOptionPane.showMessageDialog(null,"already ask for medicine , you can not have this medicine again .if you still are not in good state ,please make a reservation");
             }
             else if(cr.getStatus().equals("alreadygiving")){
                 JOptionPane.showMessageDialog(null,"already giving");
             
            }else{
            cr.setStatus("waitingformedicine");
            String HospitalName=cr.getHospitalName();
            UserAccount DoctorName=cr.getDoctorName();
            UserAccount PatientName=cr.getPatientName();
            String Medicine=cr.getMedicine();
            int Quantity=cr.getQuantity();
            String medicinestatus="waiting";
            askformedicine af=org.getAfd().AddaskformedicineRecord(HospitalName, DoctorName, PatientName, Medicine, Quantity, medicinestatus);
            JOptionPane.showMessageDialog(null,"Succeed");
                populateTable();
            //org.getCrd().AddClinicalRecord(HospitalName, HospitalName, PatientName, Medicine, Medicine, Quantity, Medicine, medicinestatus);
             }
        }
         else{
        JOptionPane.showMessageDialog(null,"please select one row");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ClinicalRecordJTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
