/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import util.DBUtil;

/**
 *
 * @author Administrator
 */
public class PreLoginFron extends javax.swing.JFrame {

    /**
     * Creates new form PreLoginFron
     */
    public PreLoginFron() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jT_user_name = new javax.swing.JTextField();
        jT_user_password = new javax.swing.JPasswordField();
        jB_login = new javax.swing.JButton();
        jBSignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("用户名");

        jLabel2.setText("密码");

        jT_user_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_user_nameActionPerformed(evt);
            }
        });

        jB_login.setText("登陆");
        jB_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_loginActionPerformed(evt);
            }
        });

        jBSignUp.setText("注册");
        jBSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jT_user_name, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(jT_user_password))
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jB_login)
                .addGap(49, 49, 49)
                .addComponent(jBSignUp)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jT_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jT_user_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_login)
                    .addComponent(jBSignUp))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_user_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_user_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_user_nameActionPerformed

    private void jB_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_loginActionPerformed
        // TODO add your handling code here:
        String userName = jT_user_name.getText();
        String userPassword = jT_user_password.getText();
        
        Connection conn = null;
        PreparedStatement state = null;
        ResultSet rs = null;
        
        try {
            conn = DBUtil.getConn();
            String sql_select = "select * from user where user_id = ? and user_password = ?";
            
            state = conn.prepareStatement(sql_select);
            
            state.setString(1, userName);
            state.setString(2, userPassword);
            rs = state.executeQuery();
            
            if(rs.next()){
                Mainform mainform = new Mainform();
                mainform.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "错误");
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(rs, conn, state);
        }
    }//GEN-LAST:event_jB_loginActionPerformed

    private void jBSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSignUpActionPerformed
        // TODO add your handling code here:
        String userName = jT_user_name.getText();
        String userPassword = jT_user_password.getText();
        
        Connection conn = null;
        PreparedStatement state = null;
        ResultSet rs = null;
        
        try {
            conn = util.DBUtil.getConn();
            String sqlInsert = "insert into user values (0, ?, ?)";
            state = conn.prepareStatement(sqlInsert);
            
            state.setString(1, userName);
            state.setString(2, userPassword);
            
            state.executeUpdate();
            JOptionPane.showMessageDialog(null, "注册成功");
        } catch (Exception e) {
            e.printStackTrace();;
        }finally{
            util.DBUtil.close(rs, conn, state);
        }
    }//GEN-LAST:event_jBSignUpActionPerformed

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
            java.util.logging.Logger.getLogger(PreLoginFron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreLoginFron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreLoginFron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreLoginFron.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreLoginFron().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSignUp;
    private javax.swing.JButton jB_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jT_user_name;
    private javax.swing.JPasswordField jT_user_password;
    // End of variables declaration//GEN-END:variables
}
