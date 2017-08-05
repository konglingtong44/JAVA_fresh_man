/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Administrator
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopFrame = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuRegister = new javax.swing.JMenu();
        jMenuRegisterForm = new javax.swing.JMenuItem();
        jMRegsiterListForm = new javax.swing.JMenuItem();
        jMRegsiterModifyForm = new javax.swing.JMenuItem();
        jMenuDoctor = new javax.swing.JMenu();
        jMenuItemDrugStock = new javax.swing.JMenuItem();
        jMenuItemPatientList = new javax.swing.JMenuItem();
        jMenuItemPatientTreat = new javax.swing.JMenuItem();
        jMenuBill = new javax.swing.JMenu();
        jMenuItemCheckForm = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuDrug = new javax.swing.JMenu();
        jMenuItem1GetDrugForm = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuDepartment = new javax.swing.JMenu();
        jMenuItemDoctorOperation = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1DurgStock = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopFrameLayout = new javax.swing.GroupLayout(jDesktopFrame);
        jDesktopFrame.setLayout(jDesktopFrameLayout);
        jDesktopFrameLayout.setHorizontalGroup(
            jDesktopFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1352, Short.MAX_VALUE)
        );
        jDesktopFrameLayout.setVerticalGroup(
            jDesktopFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jMenuRegister.setText("我是挂号处");

        jMenuRegisterForm.setText("挂号");
        jMenuRegisterForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegisterFormActionPerformed(evt);
            }
        });
        jMenuRegister.add(jMenuRegisterForm);

        jMRegsiterListForm.setText("汇总名单");
        jMRegsiterListForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRegsiterListFormActionPerformed(evt);
            }
        });
        jMenuRegister.add(jMRegsiterListForm);

        jMRegsiterModifyForm.setText("查询修改");
        jMRegsiterModifyForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRegsiterModifyFormActionPerformed(evt);
            }
        });
        jMenuRegister.add(jMRegsiterModifyForm);

        jMenuBar1.add(jMenuRegister);

        jMenuDoctor.setText("我是医生");

        jMenuItemDrugStock.setText("现有药品库存");
        jMenuItemDrugStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDrugStockActionPerformed(evt);
            }
        });
        jMenuDoctor.add(jMenuItemDrugStock);

        jMenuItemPatientList.setText("查看病人信息");
        jMenuItemPatientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPatientListActionPerformed(evt);
            }
        });
        jMenuDoctor.add(jMenuItemPatientList);

        jMenuItemPatientTreat.setText("治疗");
        jMenuItemPatientTreat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPatientTreatActionPerformed(evt);
            }
        });
        jMenuDoctor.add(jMenuItemPatientTreat);

        jMenuBar1.add(jMenuDoctor);

        jMenuBill.setText("我是结账处");

        jMenuItemCheckForm.setText("根据医生发来的药品进行结账");
        jMenuItemCheckForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCheckFormActionPerformed(evt);
            }
        });
        jMenuBill.add(jMenuItemCheckForm);

        jMenuItem10.setText("push");
        jMenuBill.add(jMenuItem10);

        jMenuBar1.add(jMenuBill);

        jMenuDrug.setText("我是拿药处");

        jMenuItem1GetDrugForm.setText("如果结账给药，没结账滚蛋");
        jMenuItem1GetDrugForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1GetDrugFormActionPerformed(evt);
            }
        });
        jMenuDrug.add(jMenuItem1GetDrugForm);

        jMenuItem14.setText("push");
        jMenuDrug.add(jMenuItem14);

        jMenuBar1.add(jMenuDrug);

        jMenuDepartment.setText("医生管理处");

        jMenuItemDoctorOperation.setText("总览医生信息/包括修改医生信息/删除医生信息/增加医生信息/单独查询医生信息");
        jMenuItemDoctorOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDoctorOperationActionPerformed(evt);
            }
        });
        jMenuDepartment.add(jMenuItemDoctorOperation);

        jMenuBar1.add(jMenuDepartment);

        jMenu1.setText("库房");

        jMenuItem1DurgStock.setText("药品库房");
        jMenuItem1DurgStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1DurgStockActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1DurgStock);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopFrame, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopFrame, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuRegisterFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegisterFormActionPerformed
        // TODO add your handling code here:
        RegsiterForm regsiterForm = new RegsiterForm();
        regsiterForm.setVisible(true);
        jDesktopFrame.add(regsiterForm);
        
    }//GEN-LAST:event_jMenuRegisterFormActionPerformed

    private void jMenuItemDoctorOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDoctorOperationActionPerformed
        // TODO add your handling code here:
        DoctorOperationForm doctorOperationForm = new DoctorOperationForm();
        doctorOperationForm.setVisible(true);
        jDesktopFrame.add(doctorOperationForm);
        
    }//GEN-LAST:event_jMenuItemDoctorOperationActionPerformed

    private void jMRegsiterListFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRegsiterListFormActionPerformed
        // TODO add your handling code here:
         RegsiterListForm regsiterListForm=new RegsiterListForm();
        regsiterListForm.setVisible(true);
        jDesktopFrame.add(regsiterListForm);
    }//GEN-LAST:event_jMRegsiterListFormActionPerformed

    private void jMRegsiterModifyFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRegsiterModifyFormActionPerformed
        RegsiterModifyForm regsiterModifyForm=new RegsiterModifyForm();
        regsiterModifyForm.setVisible(true);
        jDesktopFrame.add( regsiterModifyForm);        // TODO add your handling code here:
    }//GEN-LAST:event_jMRegsiterModifyFormActionPerformed

    private void jMenuItem1GetDrugFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1GetDrugFormActionPerformed
        // TODO add your handling code here:
        GetDrugForm getDrugForm = new GetDrugForm();
        getDrugForm.setVisible(true);
        jDesktopFrame.add(getDrugForm);
    }//GEN-LAST:event_jMenuItem1GetDrugFormActionPerformed

    private void jMenuItemDrugStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDrugStockActionPerformed
        // TODO add your handling code here:
        DrugStockForm drugStockForm = new DrugStockForm();
        drugStockForm.setVisible(true);
        jDesktopFrame.add(drugStockForm);
    }//GEN-LAST:event_jMenuItemDrugStockActionPerformed

    private void jMenuItemPatientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPatientListActionPerformed
        // TODO add your handling code here:
       PatientListForm patientListForm = new PatientListForm();
       patientListForm.setVisible(true);
       jDesktopFrame.add(patientListForm);
    }//GEN-LAST:event_jMenuItemPatientListActionPerformed

    private void jMenuItemPatientTreatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPatientTreatActionPerformed
        // TODO add your handling code here:
        PatientCaseForm patientCaseForm = new PatientCaseForm();
        patientCaseForm.setVisible(true);
        jDesktopFrame.add(patientCaseForm);
    }//GEN-LAST:event_jMenuItemPatientTreatActionPerformed

    private void jMenuItemCheckFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCheckFormActionPerformed
        // TODO add your handling code here:
         CheckForm checkForm = new CheckForm();
        checkForm.setVisible(true);
        jDesktopFrame.add(checkForm);
    }//GEN-LAST:event_jMenuItemCheckFormActionPerformed

    private void jMenuItem1DurgStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1DurgStockActionPerformed
        // TODO add your handling code here:
        DrugRoomForm drugRoom = new DrugRoomForm();
        drugRoom.setVisible(true);
        jDesktopFrame.add(drugRoom);
        
    }//GEN-LAST:event_jMenuItem1DurgStockActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopFrame;
    private javax.swing.JMenuItem jMRegsiterListForm;
    private javax.swing.JMenuItem jMRegsiterModifyForm;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuBill;
    private javax.swing.JMenu jMenuDepartment;
    private javax.swing.JMenu jMenuDoctor;
    private javax.swing.JMenu jMenuDrug;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem1DurgStock;
    private javax.swing.JMenuItem jMenuItem1GetDrugForm;
    private javax.swing.JMenuItem jMenuItemCheckForm;
    private javax.swing.JMenuItem jMenuItemDoctorOperation;
    private javax.swing.JMenuItem jMenuItemDrugStock;
    private javax.swing.JMenuItem jMenuItemPatientList;
    private javax.swing.JMenuItem jMenuItemPatientTreat;
    private javax.swing.JMenu jMenuRegister;
    private javax.swing.JMenuItem jMenuRegisterForm;
    // End of variables declaration//GEN-END:variables
}
