/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Business.DBOperate;
import Business.LogWriter;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author yizhe
 */
public class AdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminJPanel
     */
    String command;
    List<String> dataList=new ArrayList<>();
    public AdminJPanel() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        cmdJTA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        hcmdJTA = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        sqlJTA = new javax.swing.JTextArea();
        NoJCB = new javax.swing.JComboBox<>();
        statusJL = new javax.swing.JLabel();

        setBackground(new java.awt.Color(19, 21, 34));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(19, 21, 34));

        cmdJTA.setBackground(new java.awt.Color(0, 0, 0));
        cmdJTA.setColumns(20);
        cmdJTA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cmdJTA.setForeground(new java.awt.Color(255, 255, 255));
        cmdJTA.setRows(5);
        cmdJTA.setText(">>");
        cmdJTA.setToolTipText("");
        cmdJTA.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(204, 204, 204)), "  (c) 2019 JP Info Corporation. All rights reserved. ( Press 'ctrl' To execute )", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255)), "  JP INFO [Version 0.3.14159.265]\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255)), " Command", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        cmdJTA.setCaretColor(new java.awt.Color(255, 255, 255));
        cmdJTA.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cmdJTA.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cmdJTA.setName(""); // NOI18N
        cmdJTA.setOpaque(false);
        cmdJTA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmdJTAKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(cmdJTA);

        jScrollPane2.setBackground(new java.awt.Color(19, 21, 34));

        hcmdJTA.setEditable(false);
        hcmdJTA.setBackground(new java.awt.Color(0, 0, 0));
        hcmdJTA.setColumns(20);
        hcmdJTA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        hcmdJTA.setForeground(new java.awt.Color(255, 255, 255));
        hcmdJTA.setRows(20);
        hcmdJTA.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "History Command", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        hcmdJTA.setCaretColor(new java.awt.Color(255, 255, 255));
        hcmdJTA.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        hcmdJTA.setOpaque(false);
        hcmdJTA.setPreferredSize(new java.awt.Dimension(29, 511));
        jScrollPane2.setViewportView(hcmdJTA);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Export Log");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sqlJTA.setBackground(new java.awt.Color(19, 21, 34));
        sqlJTA.setColumns(20);
        sqlJTA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        sqlJTA.setForeground(new java.awt.Color(255, 255, 255));
        sqlJTA.setRows(5);
        jScrollPane3.setViewportView(sqlJTA);

        NoJCB.setBackground(new java.awt.Color(0, 0, 0));
        NoJCB.setForeground(new java.awt.Color(255, 255, 255));
        NoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        statusJL.setBackground(new java.awt.Color(19, 21, 34));
        statusJL.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        statusJL.setForeground(new java.awt.Color(255, 255, 255));
        statusJL.setText("Status Bar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                        .addComponent(jScrollPane2))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NoJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(statusJL, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NoJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusJL))
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        cmdJTA.requestFocus();
    }//GEN-LAST:event_formMouseMoved

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formKeyTyped

    private void cmdJTAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdJTAKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==KeyEvent.VK_CONTROL){
            command=cmdJTA.getText().substring(2);
            String sql=command.replaceAll("(\r|\n)","");
            if(sql.startsWith("select") ||sql.startsWith("SELECT")){
                try{
                    ResultSet rs=DBOperate.select(sql);
                    statusJL.setText("Status: select successfully");
                    int col = rs.getMetaData().getColumnCount();
                    while (rs.next()) {
                        for (int i = 1; i <= col; i++) {
                            sqlJTA.setText(sqlJTA.getText()+" "+rs.getString(i)+" ");
    //                        if ((i == 2) && (rs.getString(i).length() < 8)) {
    //                            System.out.print("\t");
    //                        }
                        }
                        sqlJTA.setText(sqlJTA.getText()+"\n");
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }else{
                int dbi=DBOperate.update(sql);
                statusJL.setText("Status: "+dbi+" rows affected");
            }
            
            dataList.add(command);
            hcmdJTA.setText(hcmdJTA.getText()+'\n'+cmdJTA.getText());
            cmdJTA.setText(">>");
           
        };
    }//GEN-LAST:event_cmdJTAKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LogWriter.exportLog(new File("E:/log.txt"), dataList);
        JOptionPane.showMessageDialog(null,"Export Log Successfully");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> NoJCB;
    private javax.swing.JTextArea cmdJTA;
    private javax.swing.JTextArea hcmdJTA;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea sqlJTA;
    private javax.swing.JLabel statusJL;
    // End of variables declaration//GEN-END:variables
}
