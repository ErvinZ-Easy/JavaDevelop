/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorWorkArea;

import Business.Clinical.ClinicalRecord;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicalDept;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClinicalWorkRequest;
import Business.WorkQueue.WorkRequest;
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
public class clinicalhistory extends javax.swing.JPanel {

    /**
     * Creates new form clinicalhistory
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount patientAccount;
    String hospitalName;
    UserAccount doctorName;
    UserAccount doctorAccount;
    Organization org;
    public  clinicalhistory(JPanel userProcessContainer, Enterprise enterprise,String hospitalName,UserAccount doctorName,UserAccount patientAccount,UserAccount ua,Organization org) {
        initComponents();
        Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize);
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.hospitalName=hospitalName;
        this.doctorName=doctorName;
        this.patientAccount=patientAccount;
        this.doctorAccount=ua;
        this.org=org;
        patientNameJTF.setText(patientAccount.getPeople().getName());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        patientNameJTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        conditionJTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        RemarkJTF = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        MedJCB = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        QJTF = new javax.swing.JTextField();
        SearchJB = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        HistoryJTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(224, 224, 224));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jLabel3.setBackground(new java.awt.Color(224, 224, 224));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Hospital Information System - Doctor WorkArea / Clinical History");

        jLabel4.setBackground(new java.awt.Color(224, 224, 224));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Add new Clinical Record:");

        jLabel6.setBackground(new java.awt.Color(224, 224, 224));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("PatientName");

        patientNameJTF.setEditable(false);
        patientNameJTF.setBackground(new java.awt.Color(224, 224, 224));
        patientNameJTF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        patientNameJTF.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(224, 224, 224));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Condition");

        conditionJTF.setBackground(new java.awt.Color(224, 224, 224));
        conditionJTF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        conditionJTF.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(224, 224, 224));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Medicine");

        jLabel9.setBackground(new java.awt.Color(224, 224, 224));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Remark");

        RemarkJTF.setBackground(new java.awt.Color(224, 224, 224));
        RemarkJTF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RemarkJTF.setCaretColor(new java.awt.Color(255, 255, 255));

        submitJButton.setBackground(new java.awt.Color(224, 224, 224));
        submitJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(224, 224, 224));
        backJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        MedJCB.setBackground(new java.awt.Color(224, 224, 224));
        MedJCB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MedJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antibiotics", "albomycin", "berberine", "penicillin G", "Analgesics", "aspirin", "Vitamins" }));
        MedJCB.setPreferredSize(null);

        jLabel10.setBackground(new java.awt.Color(224, 224, 224));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Quantity");

        QJTF.setBackground(new java.awt.Color(224, 224, 224));
        QJTF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        QJTF.setCaretColor(new java.awt.Color(255, 255, 255));
        QJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QJTFActionPerformed(evt);
            }
        });

        SearchJB.setBackground(new java.awt.Color(224, 224, 224));
        SearchJB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SearchJB.setText("SearchClinicalHistory");
        SearchJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchJBActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(224, 224, 224));

        HistoryJTable.setBackground(new java.awt.Color(224, 224, 224));
        HistoryJTable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        HistoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HospitalName", "DoctorName", "PatientName", "Condition", "Medicine", "Quantity", "Remark", "ResolveDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        HistoryJTable.setGridColor(new java.awt.Color(0, 0, 0));
        HistoryJTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        HistoryJTable.setSelectionForeground(new java.awt.Color(255, 255, 0));
        jScrollPane2.setViewportView(HistoryJTable);
        if (HistoryJTable.getColumnModel().getColumnCount() > 0) {
            HistoryJTable.getColumnModel().getColumn(0).setResizable(false);
            HistoryJTable.getColumnModel().getColumn(1).setResizable(false);
            HistoryJTable.getColumnModel().getColumn(2).setResizable(false);
            HistoryJTable.getColumnModel().getColumn(3).setResizable(false);
            HistoryJTable.getColumnModel().getColumn(4).setResizable(false);
            HistoryJTable.getColumnModel().getColumn(5).setResizable(false);
            HistoryJTable.getColumnModel().getColumn(6).setResizable(false);
            HistoryJTable.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel5.setBackground(new java.awt.Color(224, 224, 224));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel5.setText("Patient Clinical History");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1087, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(784, 784, 784))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(QJTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(MedJCB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(patientNameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(RemarkJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(submitJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(backJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(434, 434, 434))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(conditionJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(437, 437, 437))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SearchJB)))
                        .addGap(0, 796, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SearchJB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(patientNameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(conditionJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MedJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(QJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(RemarkJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(submitJButton)
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addGap(369, 369, 369))
        );
    }// </editor-fold>//GEN-END:initComponents

//    public void populateTable(){
//        DefaultTableModel model = (DefaultTableModel) ClinicalRecordJTable.getModel();
//        model.setRowCount(0);
//            for(WorkRequest wr:doctorAccount.getWorkQueue().getWorkRequestList()){
//                ClinicalWorkRequest cwr=(ClinicalWorkRequest) wr;
//                ClinicalRecord cwrTemp=cwr.getClinicalrecord();
//                if(cwrTemp!=null){
//                    Object[] row = new Object[7];
//                    row[0] = cwrTemp;
//                    row[1] = cwrTemp.getDoctorName();
//                    row[2] = cwrTemp.getPatientName();
//                    row[3] = cwrTemp.getCondition();
//                    row[4] = cwrTemp.getMedicine();
//                    row[5] = cwrTemp.getQuantity();
//                    row[6] = cwrTemp.getRemark();
//                    model.addRow(row);
//                }
//            }
//            
//        
//    }
    
    public void populateHTable(String patientName){
        DefaultTableModel model = (DefaultTableModel) HistoryJTable.getModel();
        model.setRowCount(0);
            for(WorkRequest wr:doctorAccount.getWorkQueue().getWorkRequestList()){
                ClinicalWorkRequest cwr=(ClinicalWorkRequest) wr;
                ClinicalRecord cwrTemp=cwr.getClinicalrecord();
                if(cwrTemp!=null && cwrTemp.getPatientName().toString().equals(patientName)){
                    Object[] row = new Object[8];
                    row[0] = cwrTemp;
                    row[1] = cwrTemp.getDoctorName();
                    row[2] = cwrTemp.getPatientName();
                    row[3] = cwrTemp.getCondition();
                    row[4] = cwrTemp.getMedicine();
                    row[5] = cwrTemp.getQuantity();
                    row[6] = cwrTemp.getRemark();
                    row[7] = cwr.getResolveDate();
                    model.addRow(row);
                }
            }
            
        
    }
    
    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        try{
        String condition=conditionJTF.getText();
        String medicine=MedJCB.getSelectedItem().toString();
        int quantity=Integer.parseInt(QJTF.getText());
        String remark=RemarkJTF.getText();
        ClinicalRecord cr=org.getCrd().AddClinicalRecord(hospitalName, doctorName, patientAccount, condition, medicine, quantity,remark,"attendence");
       
        Organization organization = null;
        for (Organization orga : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (orga instanceof ClinicalDept){
                organization = orga;
                break;
            }
        }
        if (organization!=null){
            doctorAccount.getWorkQueue().createclinicalWorkRequest(doctorAccount, patientAccount, cr);
       
            JOptionPane.showMessageDialog(null,"Submit Clinical Record Request Successfully");
            populateHTable(patientNameJTF.getText());
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data format error!");
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void SearchJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchJBActionPerformed
        // TODO add your handling code here:
        String name=patientNameJTF.getText();
        populateHTable(name);
    }//GEN-LAST:event_SearchJBActionPerformed

    private void QJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QJTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable HistoryJTable;
    private javax.swing.JComboBox<String> MedJCB;
    private javax.swing.JTextField QJTF;
    private javax.swing.JTextField RemarkJTF;
    private javax.swing.JButton SearchJB;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField conditionJTF;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField patientNameJTF;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
