/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liveproject2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static liveproject2.DbConnection.od;
import static liveproject2.Operation_On_Student.adm1;
/**
 *
 * @author Hp
 */
public class Subject_Update extends javax.swing.JPanel {

    /**
     * Creates new form Subject_Update
     */
    static Subject_Update adt;
    public Subject_Update() {
        initComponents();
        adt=this;
    }
    public static Subject_Update returnInstance()
    {
        adt.setAllComponentsStable();
        return adt;
    }
    public void setAllComponentsStable()
    {
        jTextField1.setText("");
        jTextField2.setText("");
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("UPDATE SUBJECT DETAILS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Enter Subject ID:");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Subject Name:");

        jButton1.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jButton1.setText("UPDATE ???");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       String subject_id=jTextField1.getText();
        if(subject_id.equals(""))
        {
  JOptionPane.showMessageDialog(adm1,"Please enter correct subject ID","Subject Updation Process",JOptionPane.WARNING_MESSAGE);           
        }
         else
        {
  int x=JOptionPane.showConfirmDialog(adm1,"Do you want to save changes?","Subject Updation Process",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
       if(x==JOptionPane.YES_OPTION)
       {
           try {
               od=new oracle.jdbc.driver.OracleDriver();
               DriverManager.registerDriver(od);
               Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","prashant");
      PreparedStatement stmt = conn.prepareStatement("update subjects set name=? where subject_id=?");
      stmt.setString(1,jTextField2.getText());
      stmt.setString(3,jTextField1.getText());
      int val1=stmt.executeUpdate();

      stmt.close();
           if(val1>0)
           {
            JOptionPane.showMessageDialog(adm1,"Data has been updated successfully...","Subject Updation Process",JOptionPane.INFORMATION_MESSAGE);
            jTextField1.setText("");
            jTextField2.setText("");
           }
           else
           {
          JOptionPane.showMessageDialog(adm1,"Some problem has occured...Please try again !!!","Updation Process",JOptionPane.INFORMATION_MESSAGE);
           }
           } catch (SQLException ex) {
               Logger.getLogger(Teacher_Update.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else
       {
         JOptionPane.showMessageDialog(adm1,"Data has not been updated !!!","Updation Process",JOptionPane.WARNING_MESSAGE);
          jTextField1.setText("");
          jTextField2.setText("");
       }             
        }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      String subject_id=jTextField1.getText();
      if(subject_id.equals(""))
        {
       JOptionPane.showMessageDialog(adm1,"Please enter correct subject ID","Subject Updation Process",JOptionPane.WARNING_MESSAGE);     
        }  
      else
        {
            try {
                int log=0;
                od=new oracle.jdbc.driver.OracleDriver();
                DriverManager.registerDriver(od);            
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","prashant");
                PreparedStatement stmt = conn.prepareStatement("select * from subjects");
   //             stmt.setString(1,teacher_id);
                ResultSet rs=stmt.executeQuery();
                while(rs.next())
                {
                    if(rs.getString(1).equals(subject_id))
                    {
                        log=1;
                        jTextField2.setText(rs.getString(2));
                        break;
                    }   
                }
                stmt.close();
                rs.close();
                if(log==0)
                {
      JOptionPane.showMessageDialog(adm1,"Sorry,subject ID not present in database...","Subject Updation Process",JOptionPane.ERROR_MESSAGE);     
      jTextField1.setText("");
                }     
            } catch (SQLException ex) {
                Logger.getLogger(Teacher_Update.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}