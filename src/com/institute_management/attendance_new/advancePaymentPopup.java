/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.institute_management.attendance_new;

import com.institute_management.payment_mgt.paymentBean;
import com.institute_management.util.CommonMethods;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

/**
 *
 * @author malindad
 */
public class advancePaymentPopup extends javax.swing.JFrame {

    dbConnection a = new dbConnection();
    CommonMethods cmMethds = new CommonMethods();

    String s_id;
    String Course_id;
    String last_Pmonth;
    int last_Pyear;
    String curMonth;
    int curYear;
    String cardType;
    double courseFee;
    ArrayList<paymentBean> paymentArray;
    JTextPane current_bill_pane_local;
    JTextField textTotalFee_local;
    
    public advancePaymentPopup() {
        initComponents();
        
    }

    public advancePaymentPopup(String s_id, String Course_id, String last_Pmonth, int last_Pyear, String curMonth, int curYear, String cardType,double courseFee,ArrayList<paymentBean> paymentArray,JTextPane current_bill_pane,JTextField textTotalFee,boolean isFirstMonth) throws SQLException {
        initComponents();
        cmMethds.setMonthMap();
        HashMap<Integer, Object[]> tblData = a.get_given_class_due_payments(last_Pmonth, last_Pyear, curMonth, curYear, cmMethds.monthMap,isFirstMonth);
        DefaultTableModel model = (DefaultTableModel) popupTable.getModel();
        model.setRowCount(0);
        for (int i = 1; i <= tblData.size(); i++) {
            model.addRow(tblData.get(i));
        }
        this.s_id = s_id;
        this.Course_id = Course_id;
        this.last_Pmonth = last_Pmonth;
        this.last_Pyear = last_Pyear;
        this.curMonth = curMonth;
        this.curYear = curYear;
        this.cardType = cardType;
        this.courseFee = courseFee;
        this.paymentArray = paymentArray;
        this.current_bill_pane_local = current_bill_pane;
        this.textTotalFee_local = textTotalFee;
        
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
        popupTable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        popupTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Month", "Full Payment", "Half Payment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(popupTable);

        jLabel1.setText("Total");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // confirm the payment
        for(int i=0;i<popupTable.getRowCount();i++){   
            paymentBean pBean = new paymentBean();
            if(Boolean.valueOf(popupTable.getValueAt(i, 1).toString())){   
                
                pBean.setAmount(courseFee);
                pBean.setCardType(cardType);
                pBean.setCourseID(Course_id);
                pBean.setComment("Full Payment");// this is not actual card type. they should have to get the half payments also
                pBean.setMonthYear(popupTable.getValueAt(i, 0).toString());
                pBean.setS_id(s_id);
                pBean.setDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()).toLowerCase());
                pBean.setPayment_initiate_interface("Attendance_interface");
                paymentArray.add(pBean);
            }
            else if(Boolean.valueOf(popupTable.getValueAt(i, 2).toString())){                
                pBean.setAmount(courseFee/2);
                pBean.setCardType(cardType);
                pBean.setCourseID(Course_id);
                pBean.setComment("Half Payment");// this is not actual card type. they should have to get the half payments also
                pBean.setMonthYear(popupTable.getValueAt(i, 0).toString());
                pBean.setS_id(s_id);
                pBean.setDate(new SimpleDateFormat("YYYY-MM-DD").format(Calendar.getInstance().getTime()).toLowerCase());
                pBean.setPayment_initiate_interface("Attendance_interface");
                paymentArray.add(pBean);
            }
            
        }
        //load current bill pane
        current_bill_pane_local.setText(null);
        double x=0.0;
        for (int i = 0; i < paymentArray.size(); i++) {
            appendToPane(current_bill_pane_local, paymentArray.get(i).getCourseID()+" --> "+ paymentArray.get(i).getMonthYear()+" --> "+paymentArray.get(i).getComment());
            x=x+paymentArray.get(i).getAmount();
        }
        textTotalFee_local.setText(x+"");
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void appendToPane(JTextPane tp, String msg) {

        Color c;
        if (msg.contains("not")) {
            c = Color.RED;
        } else {
            c = Color.BLUE;
        }
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        int len = tp.getDocument().getLength();
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(msg + System.lineSeparator());
    }
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
            java.util.logging.Logger.getLogger(advancePaymentPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(advancePaymentPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(advancePaymentPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(advancePaymentPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new advancePaymentPopup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable popupTable;
    // End of variables declaration//GEN-END:variables
}
