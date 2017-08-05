/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker.check;
import dao.CheckDao;
import entity.Check;
import dao.DrugDao;
import dao.PatientDrugDao;
import dao.PatientTotalDao;
import entity.Drug;
import entity.PatientBuy;
import entity.PatientCheck;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class CheckForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form CheckForm
     */
    public CheckForm() {
        initComponents();
        init();
    }
    public void init(){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        CheckDao checkDao = new CheckDao();
        
        List<Check> checkList = checkDao.getCheck();
        
       for(int i=0;i<checkList.size();i++){
        Check check = (Check) checkList.get(i);
       model.addRow(new Object[]{check.getPatientNo(),check.getPatientName(),check.getDrugName(),check.getDrugPrice()});
       }
       
       
       
    }

    /**s
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtSum = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jButton1.setText("确认结账");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "药品名称", "药品单价", "药品数量"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jLabel3.setText("购药清单");

        jLabel4.setText("病人信息");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "病人编号", "病人姓名"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setText("应付总价");

        jtSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtSumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtSum, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jButton1)
                .addGap(0, 289, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        int id = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
        
          DefaultTableModel model2 = (DefaultTableModel)jTable2.getModel();
          model2.setRowCount(0);
        PatientDrugDao patientDrugDao = new PatientDrugDao();
        
        List<PatientBuy> patientBuyList = patientDrugDao.getPatientBuy(id);
        double sum = 0;
        for(int i = 0; i < patientBuyList.size(); i++){
            PatientBuy patientBuy = (PatientBuy) patientBuyList.get(i);
            model2.addRow(new Object[]{patientBuy.getDrugName(),patientBuy.getDrugPrice(),patientBuy.getDrugNum()});
            sum =  sum + (patientBuy.getDrugPrice() * patientBuy.getDrugNum());
                 //  PatientTotalDao patientTotalDao = new PatientTotalDao();
            //double patientCheckList = patientTotalDao.getPatientTotal(id);
    
        }
         jtSum.setText(sum+"");
    }//GEN-LAST:event_jTable1MouseReleased

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
      
       
      
       
    }//GEN-LAST:event_jTable2MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        int patientID = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
        String patientName = jTable1.getValueAt(row, 1).toString();
        double total = Double.parseDouble(jtSum.getText());
        
        PatientCheck patientCheck = new PatientCheck();
        patientCheck.setPatientID(patientID);
        patientCheck.setPatientName(patientName);
        patientCheck.setTotal(total);
        
        CheckDao checkDao = new CheckDao();
        int row2 = checkDao.addCheck(patientCheck, patientID, total, patientName);
        if(row2==1){
            JOptionPane.showMessageDialog(null, "添加成功");

        }else{
            JOptionPane.showMessageDialog(null, "添加失败");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtSumActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jtSumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jtSum;
    // End of variables declaration//GEN-END:variables
}
