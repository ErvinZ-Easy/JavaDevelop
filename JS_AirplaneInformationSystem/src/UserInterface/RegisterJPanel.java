/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Users.Airliner;
import Business.Users.Customer;
import Business.Users.TravelAgency;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author yizhe
 */
public class RegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterJPanel
     */
    private TravelAgency travelagency;
    private JPanel CardSequenceJPanel;
    
    public RegisterJPanel(TravelAgency travelagency,JPanel CardSequenceJPanel) {
        initComponents();
        this.travelagency=travelagency;
        this.CardSequenceJPanel=CardSequenceJPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFname = new javax.swing.JTextField();
        TFpswd = new javax.swing.JTextField();
        TypeJCB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btn_signup = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TFpswd2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBACK = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Password:");

        TFname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TFname.setForeground(new java.awt.Color(0, 0, 0));

        TFpswd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        TypeJCB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TypeJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Airliner" }));
        TypeJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeJCBActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("UserType:");

        btn_signup.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_signup.setText("Register");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Re-enter Password:");

        TFpswd2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TFpswd2.setForeground(java.awt.Color.lightGray);
        TFpswd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFpswd2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("User Registration");

        btnBACK.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBACK.setText("Back");
        btnBACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBACKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TypeJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TFpswd2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                            .addComponent(TFpswd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFname, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(btnBACK, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFpswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFpswd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btn_signup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(btnBACK)
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TypeJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeJCBActionPerformed
        // TODO add your handling code here:
        TFname.setText(null);
        
    }//GEN-LAST:event_TypeJCBActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        // TODO add your handling code here:
        String name = TFname.getText();
        String pswd = TFpswd.getText();
        String pswd2 = TFpswd2.getText();
        if (TypeJCB.getSelectedItem().equals("TravelAgency")) {
            JOptionPane.showMessageDialog(null, "TravelAgency is unique, can't be created");
            btnBACK.doClick();
            return;
        }
        if (name == null || name.equals("")) {
            JOptionPane.showMessageDialog(null, "don't empty");
            return;
        }
     
        if (!usernamePatternCorrect()) {
            JOptionPane.showMessageDialog(null, "form xxx.xxx");
            return;
        }
        if (pswd == null || pswd.equals("")) {
            JOptionPane.showMessageDialog(null, "password not empty");
            return;
        }
        if (!passwordPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "password at least 6 digits" + "combination of number,upper case,lower case" + "special characters $,*,#,&");
            return;
        }
        if (!pswd.equals(pswd2)) {
            JOptionPane.showMessageDialog(null, "password not match");
            return;
        }
        if (TypeJCB.getSelectedItem().equals("Customer")) {
            travelagency.getCustomerDir().getCustomerdirectory().add(new Customer(pswd, name));
            JOptionPane.showMessageDialog(null, "customer created sucessfully");
            btnBACK.doClick();
        }
        if (TypeJCB.getSelectedItem().equals("Airliner")) {
            travelagency.getAirlinerDir().getAirlinerdirectory().add(new Airliner(pswd, name,"AAA"));
            JOptionPane.showMessageDialog(null, "Airliner created successfully");
            btnBACK.doClick();
        }
        
    }//GEN-LAST:event_btn_signupActionPerformed

    private boolean passwordPatternCorrect() {
        Pattern p = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$*#&])[A-Za-z\\d$*#&]{6,}$");
        Matcher m = p.matcher(TFpswd.getText());
        boolean b = m.matches();
        return b;
        
    }

    private boolean usernamePatternCorrect() {
        Pattern p = Pattern.compile("[a-zA-Z0-9]+\\.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(TFname.getText());
        boolean b = m.matches();
        return b;
    }
     
    
    private void TFpswd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFpswd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFpswd2ActionPerformed

    private void btnBACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBACKActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBACKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFname;
    private javax.swing.JTextField TFpswd;
    private javax.swing.JTextField TFpswd2;
    private javax.swing.JComboBox<String> TypeJCB;
    private javax.swing.JButton btnBACK;
    private javax.swing.JButton btn_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
