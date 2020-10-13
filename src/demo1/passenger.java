/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

import com.sun.glass.events.KeyEvent;
import static demo1.passenger.deleteAllRows;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author lenovo
 */
public class passenger extends javax.swing.JFrame {

    /**
     * Creates new form passenger
     */
    public passenger() {
        initComponents();
         this.setLocationRelativeTo(null);
        
    }
    
     public static void deleteAllRows(final DefaultTableModel model){
         for(int i=model.getRowCount()-1;i>=0;i--)
         {
             model.removeRow(i);
         }
     }
     
     ticket ticketdata=new ticket();
     flight flt=new flight();
     
     
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        p_id = new javax.swing.JTextField();
        p_name = new javax.swing.JTextField();
        p_mail = new javax.swing.JTextField();
        p_mob = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ticket_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabledata2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        r_flight = new javax.swing.JRadioButton();
        r_ticket = new javax.swing.JRadioButton();
        mob_label = new javax.swing.JLabel();
        flight_name = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("PASSENGER DETAILS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("passenger id :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("passenger name :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("email id : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("mobile number :");

        p_mob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_mobActionPerformed(evt);
            }
        });
        p_mob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p_mobKeyPressed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(0, 255, 0));
        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("flight name :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("ticket id :");

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(0, 255, 0));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        tabledata2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "passenge_ id", "passenger_name", "email_id", "mobile_number", "flight_name", "ticket_id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabledata2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabledata2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabledata2);

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setText("view");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        r_flight.setText("BOOK FLIGHT");
        r_flight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r_flightMouseClicked(evt);
            }
        });

        r_ticket.setText("TICKET DETAILS");
        r_ticket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r_ticketMouseClicked(evt);
            }
        });

        mob_label.setForeground(new java.awt.Color(255, 51, 0));

        flight_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Airbus", "emirates", "Airindia", "indigo", "Spacejet", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(p_id, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(p_name, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)
                        .addGap(8, 8, 8)
                        .addComponent(p_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(p_mob, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(mob_label, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(submit)
                        .addGap(10, 10, 10)
                        .addComponent(clear)))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(r_flight))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel7))
                    .addComponent(jButton2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(r_ticket))
                            .addComponent(ticket_id, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(flight_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(p_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(p_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(p_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(p_mob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(mob_label, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(submit)
                    .addComponent(clear)))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r_flight)
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(flight_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r_ticket)
                        .addGap(104, 104, 104)
                        .addComponent(ticket_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(183, 183, 183)
                .addComponent(jButton2))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        sample sam=new sample();
        sam.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        p_id.setText(null);
        p_name.setText(null);
        p_mail.setText(null);
        ticket_id.setText(null);
        //flight_name.setText(null);
        p_mob.setText(null);
    }//GEN-LAST:event_clearActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
        
       
        
        
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","17cs107","sushanth107");
            String query="select * from PASSENGER";
            Statement stat=con.createStatement();
            ResultSet rs=stat.executeQuery(query);
            
            DefaultTableModel model=(DefaultTableModel) tabledata2.getModel();
            deleteAllRows(model);
              boolean flag=false;
            while(rs.next())
            {
                
                String passenger_id=rs.getString("passenger_id");
                String passenger_name=rs.getString("passenger_name");
                String email_id=rs.getString("email_id");
                String mobile_num=rs.getString("mobile_number");
                String flight_name=rs.getString("flight_name");
                String ticket_id=rs.getString("ticket_id");
                if(flag==false)
               
                model.addRow(new Object[] {passenger_id,passenger_name,email_id,mobile_num,flight_name,ticket_id});
                
            }
            
        }catch (SQLException | ClassNotFoundException ex) {
           
            Logger.getLogger(passenger.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        String id=p_id.getText();
        String name=p_name.getText();
        String email=p_mail.getText();
        String mobnumber=p_mob.getText();
        String flightname=(String) flight_name.getSelectedItem();
        String ticketid=ticket_id.getText();
          try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","17cs107","sushanth107");
            Statement stat=con.createStatement();
            String query="insert into PASSENGER(PASSENGER_ID,PASSENGER_NAME,EMAIL_ID,MOBILE_NUMBER,FLIGHT_NAME,TICKET_ID)values('"+id+"','"+name+"','"+email+"','"+mobnumber+"','"+flightname+"','"+ticketid+"')";
            stat.executeUpdate(query);
            con.close();
            JOptionPane.showMessageDialog(null,"successfull");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"information already exists");
            Logger.getLogger(passenger.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"enter all the fields");
            Logger.getLogger(passenger.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_submitActionPerformed

    private void tabledata2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabledata2MouseClicked
        // TODO add your handling code here:
        r_ticket.setVisible(true);
        r_flight.setVisible(true);
        
        
        //int index=tabledata2.getSelectedRow();
        //TableModel model=tabledata2.getModel();
        //String passenger_id=model.getValueAt(index, 0).toString();
        
        //String ticket_id=model.getValueAt(index, 5).toString();
        //ticketdata.setVisible(true);
        //ticketdata.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //ticketdata.ticket_id.setText(ticket_id);
        //ticketdata.p_id.setText(passenger_id);
        //this.dispose();
        
        
    }//GEN-LAST:event_tabledata2MouseClicked

    private void r_flightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r_flightMouseClicked
        // TODO add your handling code here:
        int index=tabledata2.getSelectedRow();
        TableModel model=tabledata2.getModel();
        String flight_name=model.getValueAt(index, 4).toString();
        
        flt.setVisible(true);
        flt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        flt.flight_name.setText(flight_name);
        
        this.dispose();
        
        flt.setVisible(true);
        this.dispose();
        
        
        
    }//GEN-LAST:event_r_flightMouseClicked

    private void r_ticketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r_ticketMouseClicked
        // TODO add your handling code here:
        int index=tabledata2.getSelectedRow();
        TableModel model=tabledata2.getModel();
        String passenger_id=model.getValueAt(index, 0).toString();
        //String passenger_id=model.getValueAt(index, 1).toString();
        //String book_date=model.getValueAt(index, 2).toString();
        String ticket_id=model.getValueAt(index, 5).toString();
        ticketdata.setVisible(true);
        ticketdata.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ticketdata.ticket_id.setText(ticket_id);
        ticketdata.p_id.setText(passenger_id);
        this.dispose();
        
    }//GEN-LAST:event_r_ticketMouseClicked

    private void p_mobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_mobActionPerformed
        // TODO add your handling code here:
       String mob=p_mob.getText();
       int length=mob.length();
       if(length!=10)
       {
           mob_label.setText("*enter valid number");
       }
    }//GEN-LAST:event_p_mobActionPerformed

    private void p_mobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p_mobKeyPressed
        // TODO add your handling code here:
         // TODO add your handling code here:
         String mob=p_mob.getText();
         char c=evt.getKeyChar();
       //int length=mob.length();
       if(c>='0' && c<='9')
       {
           if(mob.length()<10)
           {
               p_mob.setEditable(true);
               //mob_label.setText(" ");
           }
           else
           {
               //mob_label.setText("*enter valid number");
               p_mob.setEditable(false);
           }
           
       }
       else
       {    
           if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE ||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
           {
               p_mob.setEditable(true);
           }
           else
           {
               p_mob.setEditable(false);
           }
       }
       if(mob.length()!=9)
       {
           //mob_label.setText("*enter valid number");
       }
       else
       {
           //mob_label.setText(null);
       }
       
       
       
    }//GEN-LAST:event_p_mobKeyPressed
     
        
              
        
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passenger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new passenger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> flight_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mob_label;
    private javax.swing.JTextField p_id;
    private javax.swing.JTextField p_mail;
    private javax.swing.JTextField p_mob;
    private javax.swing.JTextField p_name;
    public javax.swing.JRadioButton r_flight;
    public javax.swing.JRadioButton r_ticket;
    private javax.swing.JButton submit;
    private javax.swing.JTable tabledata2;
    private javax.swing.JTextField ticket_id;
    // End of variables declaration//GEN-END:variables

    

    

    
}
