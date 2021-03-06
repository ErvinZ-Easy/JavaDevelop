/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerService;

import Business.Flight;
import Business.Ticket;
import Business.TicketDirectory;
import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yizhe
 */
public class FlightBookingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FlightBookingJPanel
     */
    private JPanel CardSequenceJPanel;
    private String seatNo;
    private Flight f;
    private TicketDirectory ticketdirectory;
    private String username;
    public FlightBookingJPanel(JPanel CardSequenceJPanel,Flight flight,String seatNo,TicketDirectory td,String username) {
        initComponents();
        this.CardSequenceJPanel=CardSequenceJPanel;
        this.seatNo=seatNo;
        this.f=flight;
        this.ticketdirectory=td;
        this.username=username;
        
        snoTF.setText(seatNo);
        
        if(Pattern.compile("^[A-K]+[1-6]+$").matcher(seatNo).matches()){
            clTF.setText("First Class");
        }else{
            clTF.setText("Economy Class");
        }
        
        fnoTF.setText(f.getFlightNum());
        dtTF.setText(f.getDeptDate());
        atTF.setText(f.getArrivalDate());
        ttTF.setText(f.getTripType());
        tidTF.setText(flight+seatNo+f.getDeptDateMD());
        TFusername.setText(username);
        popTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tidTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fnoTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        clTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dtTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        atTF = new javax.swing.JTextField();
        btnBook = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ttTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ticketJTB = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        snoTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TFusername = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Book - Ticket Details");

        btnBack.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("TicketID");

        tidTF.setEditable(false);
        tidTF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tidTF.setMinimumSize(new java.awt.Dimension(40, 34));
        tidTF.setPreferredSize(new java.awt.Dimension(150, 34));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("FlightNo");

        fnoTF.setEditable(false);
        fnoTF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fnoTF.setMinimumSize(new java.awt.Dimension(40, 34));
        fnoTF.setPreferredSize(new java.awt.Dimension(150, 34));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("ClassLevel");

        clTF.setEditable(false);
        clTF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        clTF.setMinimumSize(new java.awt.Dimension(40, 34));
        clTF.setPreferredSize(new java.awt.Dimension(150, 34));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("DeptTime");

        dtTF.setEditable(false);
        dtTF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dtTF.setMinimumSize(new java.awt.Dimension(40, 34));
        dtTF.setPreferredSize(new java.awt.Dimension(150, 34));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("ArrivalTime");

        atTF.setEditable(false);
        atTF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        atTF.setMinimumSize(new java.awt.Dimension(40, 34));
        atTF.setPreferredSize(new java.awt.Dimension(150, 34));

        btnBook.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBook.setText("Sure!Book it!");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("TripType");

        ttTF.setEditable(false);
        ttTF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ttTF.setMinimumSize(new java.awt.Dimension(40, 34));

        ticketJTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FlightNo", "TripType", "DeptTime", "ArrivalTime", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ticketJTB);
        if (ticketJTB.getColumnModel().getColumnCount() > 0) {
            ticketJTB.getColumnModel().getColumn(0).setResizable(false);
            ticketJTB.getColumnModel().getColumn(1).setResizable(false);
            ticketJTB.getColumnModel().getColumn(2).setResizable(false);
            ticketJTB.getColumnModel().getColumn(3).setResizable(false);
            ticketJTB.getColumnModel().getColumn(4).setResizable(false);
            ticketJTB.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setText("Your Tickets");

        jSeparator1.setForeground(java.awt.Color.black);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setText("SeatNo");

        snoTF.setEditable(false);
        snoTF.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        snoTF.setMinimumSize(new java.awt.Dimension(40, 34));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setText("Username");

        TFusername.setEditable(false);
        TFusername.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TFusername.setMinimumSize(new java.awt.Dimension(40, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBook)
                        .addContainerGap(364, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(fnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(32, 32, 32))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(snoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(clTF, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel6))
                                            .addGap(32, 32, 32)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(dtTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(atTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(29, 29, 29)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(ttTF, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                                .addComponent(TFusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 102, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel4, jLabel5, jLabel6, jLabel7});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {atTF, dtTF});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBook))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(fnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(clTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(snoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(dtTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(atTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ttTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6)))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        
        Ticket t=ticketdirectory.addTicket();
        t.setFlightNo(fnoTF.getText());
        t.setArrivalDate(atTF.getText());
        t.setSeatNo(snoTF.getText());
        if(snoTF.getText().equals("^[A-K][1-6]$")){
            t.setClassLevel("First Class");
            t.setPrice(2222);
        }else{
            t.setClassLevel("Economy Class");
            t.setPrice(1555);
        }
        t.setDeptDate(dtTF.getText());
        
        t.setTicketID(tidTF.getText());
        t.setTripType(ttTF.getText());
        t.setUsername(username);
                
        popTable();
        
        btnBack.setEnabled(false);
        btnBook.setEnabled(false);
        JOptionPane.showMessageDialog(null,"Book Successfully");
    }//GEN-LAST:event_btnBookActionPerformed

    public void popTable(){
        DefaultTableModel dtm =(DefaultTableModel)ticketJTB.getModel();
        dtm.setRowCount(0);
        for(Ticket t: ticketdirectory.getTicketdirectory())
        {
                Object row[]=new Object[6];
                row[0]=t;
                row[1]=t.getFlightNo();
                row[2]=t.getTripType();
                row[3]=t.getDeptDate();
                row[4]=t.getArrivalDate();
                row[5]=t.getPrice();
                
                dtm.addRow(row);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFusername;
    private javax.swing.JTextField atTF;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBook;
    private javax.swing.JTextField clTF;
    private javax.swing.JTextField dtTF;
    private javax.swing.JTextField fnoTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField snoTF;
    private javax.swing.JTable ticketJTB;
    private javax.swing.JTextField tidTF;
    private javax.swing.JTextField ttTF;
    // End of variables declaration//GEN-END:variables
}
