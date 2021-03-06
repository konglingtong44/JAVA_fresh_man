/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.BookDao;
import dao.TypeDao;
import entity.Book;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import entity.BookType;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class AddBookForm extends javax.swing.JInternalFrame {
    public int bookNO;
    /**
     * Creates new form AddTypeForm
     */
    public AddBookForm() {
        initComponents();
        setLocation(50, 50);
        
        DefaultComboBoxModel model = (DefaultComboBoxModel)jComboBoxBookType.getModel();
        
        TypeDao typeDao = new TypeDao();
        List<BookType> typeList = typeDao.getTypes();
        for(int i= 0; i<typeList.size(); i++){
            BookType booktype = typeList.get(i);
            model.addElement(booktype);
            bookNO = booktype.getBookNo();
        }
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
        jLabel3 = new javax.swing.JLabel();
        jTBookID = new javax.swing.JTextField();
        jTBookName = new javax.swing.JTextField();
        jComboBoxBookType = new javax.swing.JComboBox<>();
        jBAddBook = new javax.swing.JButton();

        jLabel1.setText("id");

        jLabel2.setText("BookName");

        jLabel3.setText("BookType");

        jBAddBook.setText("Add");
        jBAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTBookID)
                                    .addComponent(jTBookName, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jComboBoxBookType, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jBAddBook)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxBookType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jBAddBook)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddBookActionPerformed
        // TODO add your handling code here:
        String bookID = jTBookID.getText();
        String bookName = jTBookName.getText();
        BookType booktype = (BookType)jComboBoxBookType.getSelectedItem();
        Book book = new Book();
        book.setBookID(Integer.parseInt(bookID));
        book.setBookName(bookName);
        book.setBookTypeID(booktype.getBookNo());
       
        
        BookDao bookDao = new BookDao();
         int row = bookDao.AddBook(book);
        
        if(row == 1){
            JOptionPane.showMessageDialog(null, "成功");
            
        }else{
            JOptionPane.showMessageDialog(null, "失败");
        }
    }//GEN-LAST:event_jBAddBookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAddBook;
    private javax.swing.JComboBox<String> jComboBoxBookType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTBookID;
    private javax.swing.JTextField jTBookName;
    // End of variables declaration//GEN-END:variables
}
