/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.BookTypeDao;
import entity.BookType;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class AddPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form Addpage
     */
    public AddPage() {
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

        jLabel1 = new javax.swing.JLabel();
        JTBookType = new javax.swing.JTextField();
        jBAddType = new javax.swing.JButton();

        jLabel1.setText("图书类别添加");

        JTBookType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTBookTypeActionPerformed(evt);
            }
        });

        jBAddType.setText("添加类别");
        jBAddType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAddType)
                    .addComponent(JTBookType, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTBookType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135)
                .addComponent(jBAddType)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTBookTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTBookTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTBookTypeActionPerformed

    private void jBAddTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddTypeActionPerformed
        // TODO add your handling code here:
        String bookTypeName = JTBookType.getText();
        BookType bookType = new BookType();
        bookType.setBookName(bookTypeName);
        BookTypeDao bookTypeDao = new BookTypeDao();
        int row = bookTypeDao.AddType(bookType);
        if(row == 1){
            JOptionPane.showMessageDialog(null, "成功");
        }else{
            JOptionPane.showMessageDialog(null, "失败");
        }
    }//GEN-LAST:event_jBAddTypeActionPerformed

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTBookType;
    private javax.swing.JButton jBAddType;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
