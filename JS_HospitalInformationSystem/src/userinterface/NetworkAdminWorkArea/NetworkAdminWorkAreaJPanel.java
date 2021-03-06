/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NetworkAdminWorkArea;

import Business.HIS;
import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author yizhe
 */
public class NetworkAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NetworkAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Network network;
    HIS system;
    public NetworkAdminWorkAreaJPanel(JPanel userProcessContainer,Network network,HIS system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.network=network;
        this.system=system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageEnterprise = new javax.swing.JButton();
        btnManageAdmin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(224, 224, 224));
        setPreferredSize(new java.awt.Dimension(1200, 800));
        setLayout(null);

        btnManageEnterprise.setBackground(getBackground());
        btnManageEnterprise.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });
        add(btnManageEnterprise);
        btnManageEnterprise.setBounds(124, 129, 256, 35);

        btnManageAdmin.setBackground(getBackground());
        btnManageAdmin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnManageAdmin.setText("Manage Enterprise Admin");
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });
        add(btnManageAdmin);
        btnManageAdmin.setBounds(124, 195, 259, 35);

        jLabel3.setBackground(new java.awt.Color(118, 138, 168));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Network Admin Task List:");
        add(jLabel3);
        jLabel3.setBounds(83, 59, 320, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/center - Copy.png"))); // NOI18N
        jLabel14.setText("jLabel14");
        jLabel14.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel14.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel14.setPreferredSize(new java.awt.Dimension(1920, 1080));
        add(jLabel14);
        jLabel14.setBounds(0, 0, 1920, 940);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        ManageEnterpriseJPanel manageEnterpriseJPanel=new ManageEnterpriseJPanel(userProcessContainer, network,system);
        userProcessContainer.add("manageEnterpriseJPanel",manageEnterpriseJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel=new ManageEnterpriseAdminJPanel(userProcessContainer,network, system);
        userProcessContainer.add("manageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
