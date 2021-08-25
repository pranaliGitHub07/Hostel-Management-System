
import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranali
 */
public class LeaveForm extends javax.swing.JFrame {
    
      public void clear()
    {
        s_name.setText("");
       p_name.setText("");
        s_mo.setText("");
        p_mo.setText("");
        f_email.setText("");
        rel_with_s.setText("");
       res_leave.setText("");
        tg.setText("");
        addr.setText("");
         days.setText("");
        rect.setText("");
        from.setText("");
        to.setText("");
        per_of_rect.removeAllItems();
        go_to.removeAllItems();
        inform_to_tg.removeAllItems();
    }


    /**
     * Creates new form LeaveForm
     */
    public LeaveForm() {
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

        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        from = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        to = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        go_to = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        tg = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        inform_to_tg = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        days = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        per_of_rect = new javax.swing.JComboBox<>();
        s_mo = new javax.swing.JTextField();
        p_mo = new javax.swing.JTextField();
        s_name = new javax.swing.JTextField();
        p_name = new javax.swing.JTextField();
        rel_with_s = new javax.swing.JTextField();
        res_leave = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        f_email = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        rect = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        addr = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pages background.jpg"))); // NOI18N

        jLabel19.setText("jLabel19");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        jButton1.setText("send Email To Parent");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Leave Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 21, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name of student");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(" Mobile No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Parent Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mobile No");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Relation with Student");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Reason of Leave");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Duration of Leave");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("From");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, -1));

        from.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(from, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 151, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("To");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        to.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 98, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Where to Go");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        go_to.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        go_to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "My Home", "Relative Home", "Friend Home", "Others" }));
        getContentPane().add(go_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Name of TG");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        tg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgActionPerformed(evt);
            }
        });
        getContentPane().add(tg, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 270, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Informed to TG");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        inform_to_tg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inform_to_tg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        getContentPane().add(inform_to_tg, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Name Of Hostel Rector");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        days.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(days, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 238, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Permisson of Rector to Leave ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, -1));

        per_of_rect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        per_of_rect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        getContentPane().add(per_of_rect, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, -1, -1));

        s_mo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(s_mo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 160, -1));

        p_mo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(p_mo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 160, -1));

        s_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(s_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 270, -1));

        p_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        p_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_nameActionPerformed(evt);
            }
        });
        getContentPane().add(p_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 270, -1));

        rel_with_s.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rel_with_s.setText(" ");
        getContentPane().add(rel_with_s, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 270, -1));

        res_leave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(res_leave, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 513, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Father Email id");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        f_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(f_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 270, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Days of Leave");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        rect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(rect, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 250, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton2.setText("Submit Form");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update & Delete Student.png"))); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close all jframe.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Address");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        addr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(addr, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 310, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pages background.jpg"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new emailsend().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void p_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_nameActionPerformed

    private void tgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String stud_name=s_name.getText();
        String par_name=p_name.getText();
        String s_mobile=s_mo.getText();
        String p_mobile=p_mo.getText();
        String father_email=f_email.getText();
        String relation=rel_with_s.getText();
        String reasion=res_leave.getText();
        String where_going=(String)go_to.getSelectedItem();
       String address=addr.getText();
         String tg_name=tg.getText();
         String inform=(String)inform_to_tg.getSelectedItem();
         String day=days.getText();
         String fromd=from.getText();
         String tod=to.getText();
         String rect_name=rect.getText();
         String permit=(String)per_of_rect.getSelectedItem();
         
         
         
          try
        {
            Connection con= ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("insert into hostel_leave_form values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1,stud_name);
            ps.setString(2,par_name);
            ps.setString(3,s_mobile);
            ps.setString(4,p_mobile);
            ps.setString(5,father_email);
            ps.setString(6,relation);
            ps.setString(7,reasion);
            ps.setString(8,where_going);
            ps.setString(9,address);
             ps.setString(10,tg_name);
              ps.setString(11,inform);
               ps.setString(12,day);
                ps.setString(13,fromd);
                 ps.setString(14,tod);
                  ps.setString(15,rect_name);
                   ps.setString(16,permit);
                 
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "  Successfully Inserted in Record ");
            clear();
           
            
            
            
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
        }
         
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(LeaveForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeaveForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeaveForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeaveForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeaveForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addr;
    private javax.swing.JTextField days;
    private javax.swing.JTextField f_email;
    private javax.swing.JTextField from;
    private javax.swing.JComboBox<String> go_to;
    private javax.swing.JComboBox<String> inform_to_tg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField p_mo;
    private javax.swing.JTextField p_name;
    private javax.swing.JComboBox<String> per_of_rect;
    private javax.swing.JTextField rect;
    private javax.swing.JTextField rel_with_s;
    private javax.swing.JTextField res_leave;
    private javax.swing.JTextField s_mo;
    private javax.swing.JTextField s_name;
    private javax.swing.JTextField tg;
    private javax.swing.JTextField to;
    // End of variables declaration//GEN-END:variables
}