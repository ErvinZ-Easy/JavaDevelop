/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HAdminWorkArea;

import Business.Enterprise.Enterprise;
import Business.HIS;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yizhe
 */
public class ManageOrgJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrgJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    HIS system;
    public ManageOrgJPanel(JPanel userProcessContainer, Enterprise enterprise,HIS system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.system=system;
        populateInterface();
        populateComboBox();
        
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
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HOrgJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        renameJB = new javax.swing.JButton();
        EnterpriseJCB = new javax.swing.JComboBox();
        renameJTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        delnameJTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        OrgTypeJCB = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        delnameJB = new javax.swing.JButton();

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

        jLabel8.setBackground(new java.awt.Color(224, 224, 224));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("Hospital Information System-Hospital Organization");

        jScrollPane1.setBackground(new java.awt.Color(224, 224, 224));

        HOrgJTable.setBackground(new java.awt.Color(224, 224, 224));
        HOrgJTable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        HOrgJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Org Name", "Org Type", "Enterprise"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        HOrgJTable.setGridColor(new java.awt.Color(0, 0, 0));
        HOrgJTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        HOrgJTable.setSelectionForeground(new java.awt.Color(255, 255, 0));
        HOrgJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HOrgJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(HOrgJTable);
        if (HOrgJTable.getColumnModel().getColumnCount() > 0) {
            HOrgJTable.getColumnModel().getColumn(0).setResizable(false);
            HOrgJTable.getColumnModel().getColumn(1).setResizable(false);
            HOrgJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel4.setBackground(new java.awt.Color(224, 224, 224));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Create New Organization:");

        jLabel6.setBackground(new java.awt.Color(224, 224, 224));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Rename Selected Organization:");

        jLabel1.setBackground(new java.awt.Color(224, 224, 224));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Enterprise");

        renameJB.setBackground(new java.awt.Color(224, 224, 224));
        renameJB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        renameJB.setText("Submit");
        renameJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renameJBActionPerformed(evt);
            }
        });

        EnterpriseJCB.setBackground(new java.awt.Color(224, 224, 224));
        EnterpriseJCB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        EnterpriseJCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        renameJTF.setBackground(new java.awt.Color(224, 224, 224));
        renameJTF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        renameJTF.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(224, 224, 224));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel7.setBackground(new java.awt.Color(224, 224, 224));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("ReName");

        nameJTextField.setBackground(new java.awt.Color(224, 224, 224));
        nameJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nameJTextField.setCaretColor(new java.awt.Color(255, 255, 255));

        delnameJTF.setEditable(false);
        delnameJTF.setBackground(new java.awt.Color(224, 224, 224));
        delnameJTF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        delnameJTF.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(224, 224, 224));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Organization Type");

        jLabel9.setBackground(new java.awt.Color(224, 224, 224));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Name");

        OrgTypeJCB.setBackground(new java.awt.Color(224, 224, 224));
        OrgTypeJCB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        OrgTypeJCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setBackground(new java.awt.Color(224, 224, 224));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Delete Selected Organization:");

        submitJButton.setBackground(new java.awt.Color(224, 224, 224));
        submitJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        delnameJB.setBackground(new java.awt.Color(224, 224, 224));
        delnameJB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        delnameJB.setText("Delete");
        delnameJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delnameJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(651, 651, 651)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(92, 92, 92)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(delnameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(renameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(OrgTypeJCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EnterpriseJCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(renameJB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(submitJButton)
                                    .addComponent(delnameJB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backJButton)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EnterpriseJCB, OrgTypeJCB, delnameJTF, nameJTextField, renameJTF});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(EnterpriseJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(OrgTypeJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(submitJButton))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(renameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(delnameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(delnameJB))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(renameJB)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backJButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(256, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public boolean CheckNameFromSystem(String name){
        for(Network n:system.getNetworkList()){
            if(n.getName().equals(name)) return false;
            for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getName().equals(name)) return false;
                for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                    if(o.getName().equals(name)) return false;
                }
            }
        }
        return true;
    }
    
    public void populateInterface(){
        DefaultTableModel model = (DefaultTableModel) HOrgJTable.getModel();

        model.setRowCount(0);
        
            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                Object[] row = new Object[3];
                row[0] = org;
                row[1] = org.getOrganizationType().getValue();
                row[2] = enterprise.getName();

                model.addRow(row);
            }
        
    }
    
    public void populateComboBox(){
        EnterpriseJCB.removeAllItems();
        EnterpriseJCB.addItem(enterprise);
        OrgTypeJCB.removeAllItems();
        for (Organization.OrganizationType type : Organization.OrganizationType.values()) {
            if(type.getValue().equals("ClinicalDept") ||type.getValue().equals("FinancialDept") ||type.getValue().equals("PharmacyDept"))
                OrgTypeJCB.addItem(type);
        }
    }
    
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void HOrgJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HOrgJTableMouseClicked
        // TODO add your handling code here:
        int selectedrow=HOrgJTable.getSelectedRow();
        if(selectedrow >=0){
            Organization org=(Organization)HOrgJTable.getValueAt(selectedrow,0);
            delnameJTF.setText(org.getName());
        }
    }//GEN-LAST:event_HOrgJTableMouseClicked

    private void renameJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renameJBActionPerformed
        // TODO add your handling code here:
        Boolean unique=false;
        int selectedrow=HOrgJTable.getSelectedRow();
        if(selectedrow >=0){
            Organization org=(Organization)HOrgJTable.getValueAt(selectedrow,0);
            String name =renameJTF.getText();
            unique=CheckNameFromSystem(name);
            if(unique==true){
                org.setName(name);
                JOptionPane.showMessageDialog(null,"Rename successfully");
                renameJTF.setText("");
                populateInterface();
            }else{
                JOptionPane.showMessageDialog(null,"duplicate name,change name please");
            }
        }
    }//GEN-LAST:event_renameJBActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        Boolean unique=false;
        Enterprise enterprise = (Enterprise) EnterpriseJCB.getSelectedItem();
        Organization.OrganizationType type = (Organization.OrganizationType) OrgTypeJCB.getSelectedItem();

        if (enterprise == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }

        String name = nameJTextField.getText();
        unique=CheckNameFromSystem(name);
        if(unique==true){
            Organization org=enterprise.getOrganizationDirectory().createOrganization(type,name);

            populateInterface();
            JOptionPane.showMessageDialog(null,"Create successfully");
            nameJTextField.setText("");
        }else{
            JOptionPane.showMessageDialog(null,"duplicate name,change name please");
        }
    }//GEN-LAST:event_submitJButtonActionPerformed
//gai
    private void delnameJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delnameJBActionPerformed
        // TODO add your handling code here:
        int selectedrow=HOrgJTable.getSelectedRow();
        int flag=0;
        if(selectedrow >=0){
            Organization org=(Organization)HOrgJTable.getValueAt(selectedrow,0);
            for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                if(organization.equals(org)){
                    flag=1;
                }
            }
            if(flag==1){
                enterprise.getOrganizationDirectory().deleteOrganization(org);
                JOptionPane.showMessageDialog(null,"Delete successfully");
                delnameJTF.setText("");
                populateInterface();
            }
        }
       
    }//GEN-LAST:event_delnameJBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox EnterpriseJCB;
    private javax.swing.JTable HOrgJTable;
    private javax.swing.JComboBox OrgTypeJCB;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton delnameJB;
    private javax.swing.JTextField delnameJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JButton renameJB;
    private javax.swing.JTextField renameJTF;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}