/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.institute_management.CreatePaymentMetaData;

import com.institute_management.DataSourse.DataSource;
import com.institute_management.attendance_new.dbConnection;
import com.institute_management.course_mgt.CourseDbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author malindad
 */
public class Main_int extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    dbConnection dbcon = new dbConnection();
 CourseDbConnection courseCon = new CourseDbConnection();
    public Main_int() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblmonth = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        lblsuccess = new javax.swing.JLabel();
        lblerror = new javax.swing.JLabel();
        lblstatus = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblerror1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblerror2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Payment Meta Data For New Month");

        jButton1.setText("START PROCESS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Selected Month");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Total Target Records ");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Success Records ");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Error Records ");

        jLabel6.setText("Status");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Future Payments");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("SMS Payment Records");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(91, 91, 91)
                        .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(lblmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(lblsuccess, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblerror, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(lblerror1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblerror2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblsuccess, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblerror, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lblerror1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lblerror2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        sw.execute();
        jButton1.hide();
    }//GEN-LAST:event_jButton1ActionPerformed
    SwingWorker sw = new SwingWorker() {
        @Override
        protected Object doInBackground() throws Exception {
            Process p = null;
            int processComplete = 10;
            String error_msg = null;
            int success_count = 0;
            int error_count = 0;

            //check eligibility of selected month
            Calendar cal = Calendar.getInstance();
            String curMonth = new SimpleDateFormat("MMMM").format(cal.getTime()).toLowerCase();
            String curYear = (new SimpleDateFormat("yyyy").format(cal.getTime())).toLowerCase();

            lblmonth.setText(curMonth);
            lblsuccess.setText("0");
            lblerror.setText("0");
            lblstatus.setText("Process Running..");

            PreparedStatement stmt1 = null;
            ResultSet result1 = null;
            PreparedStatement stmt = null;
            ResultSet result = null;
            DataSource d = null;
            Connection con = null;
            try {
                d = new DataSource();
                con = d.getConnection();
                con.setAutoCommit(false);

                // select * data from student_course and insert to the payment details table
                String query = "select sc.*,c.monthly_fee,case when sc.cardtype = '2' then c.monthly_fee when sc.cardtype = '1' then c.monthly_fee/2 when sc.cardtype = '0' then 0 end elegible_fee from `student-course` sc,`course` c where sc.status = 'ACT' and c.status = 'ACT' and sc.course_id = c.course_id order by course_id";
                stmt = con.prepareStatement(query);
                result = stmt.executeQuery();
                while (result.next()) {

                    String query1 = "select * from `payments_activation_details` where payment_year = ? and payment_month = ? and s_id = ? and course_id = ?";
                    stmt1 = con.prepareStatement(query1);
                    stmt1.setString(1, curYear);
                    stmt1.setString(2, curMonth);
                    stmt1.setString(3, result.getString("s_id"));
                    stmt1.setString(4, result.getString("course_id"));
                    result1 = stmt1.executeQuery();

                    if (result1.next()) {
                        System.out.println("123");
                    } else {
                        PreparedStatement stmt2 = null;
                        ResultSet result2 = null;
                        String query2 = "INSERT INTO `payments_activation_details`(`s_id`, `course_id`, `payment_month`, `payment_year`, `card_type`,`class_fee`,`elegible_fee`,`status`) VALUES (?,?,?,?,?,?,?,?)";
                        stmt2 = con.prepareStatement(query2);
                        stmt2.setString(1, result.getString("s_id"));
                        stmt2.setString(2, result.getString("course_id"));
                        stmt2.setString(3, curMonth);
                        stmt2.setString(4, curYear);
                        stmt2.setString(5, result.getString("cardType"));
                        stmt2.setDouble(6, result.getDouble("monthly_fee"));
                        stmt2.setDouble(7, result.getDouble("elegible_fee"));
                        stmt2.setString(8, "PENDING");
                        int status = stmt2.executeUpdate();
                        if (status == 1) {
                            success_count = success_count + 1;
                            lblsuccess.setText(success_count + "");

                            stmt2.close();

                        } else {
                            error_count = error_count + 1;
                            lblerror.setText(error_count + "");
                            con.rollback();
                            con.close();
                            break;
                        }

                    }
                }
                if (error_count == 0) {
                    boolean status3 =false;

                    ArrayList<String> attandance_history = new ArrayList<String>();
                    PreparedStatement stmt3 = null;
                    ResultSet result3 = null;
                    int tot = 0;
                    lblerror2.setText("0");
                    String a = "ALL-" + curYear;
                    String monthYear = curMonth+"-"+curYear;
                        
                        String query3 = "select distinct s_id from `student-course` where status = 'ACT' "
                                + "and s_id in (select s_id from sms_payments where expire_month_year = '" + monthYear + "' and record_status = 'ACT') "
                                + "and s_id not in (select s_id from sms_deact_students where status = 'ACT') order by s_id";
                        stmt3 = con.prepareStatement(query3);
                        result3 = stmt3.executeQuery();
                        int scount = 0;
                        status3 = true;
                        while (result3.next()) {
                            String s_id = result3.getString("s_id");
                            Double amount = courseCon.calculate_SMS_fee(s_id);
                            String query4 = "INSERT INTO `sms_payments` (`payment_month_year`,`expire_month_year`,`s_id`,`amount`,`payment_status`,`record_status`,`payment_date`) VALUES (?,?,?,?,?,?,?)";
                            stmt3 = con.prepareStatement(query4);
                            stmt3.setString(1, curMonth + "-" + curYear);
                            stmt3.setString(2, curMonth + "-" + (Integer.parseInt(curYear)+1));
                            stmt3.setString(3, s_id);
                            stmt3.setDouble(4, amount);
                            stmt3.setString(5, "PENDING");
                            stmt3.setString(6, "ACT");
                            stmt3.setString(7, "");
                            tot = stmt3.executeUpdate();
                            if (tot != 1) {
                                status3 = false;
                                break;
                            } else {
                                scount = scount+1;
                                lblerror2.setText(scount+"");
                                status3 = true;
                            }
                        }
                        if (status3) {
                            String query4 = "UPDATE  `sms_payments` SET  record_status = 'DACT' WHERE   expire_month_year = '" + monthYear +"' and record_status = 'ACT'" ;
                            stmt3 = con.prepareStatement(query4);
                            stmt3.executeUpdate();
                            con.commit();
                        } else {
                            con.rollback();
                        }
                        if (status3) {
                            lblstatus.setText("Process Completed");
                            con.commit();
                        } else {
                            lblstatus.setText("Process Error(SMS charge)");
                            con.rollback();
                        }

                    }else {
                    lblstatus.setText("Process Error. Please Retry");
                    con.rollback();
                }

//                         need to check future payments module
//                         when make feture paymanets it shows free card always.
//                         user can create future payments via only payment management module.
//                         when create payment accounts for new months. if there is any future payment records. system should automatically update the table
                }catch (Exception ex) {
                lblstatus.setText("ERROR");
            }

                return 0;
            }

            @Override
            public void done
            
            
        

        () {

        }
    };

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
                java.util.logging.Logger.getLogger(Main_int.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Main_int.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Main_int.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Main_int.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Main_int().setVisible(true);
                }
            });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblerror;
    private javax.swing.JLabel lblerror1;
    private javax.swing.JLabel lblerror2;
    private javax.swing.JLabel lblmonth;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JLabel lblsuccess;
    private javax.swing.JLabel lbltotal;
    // End of variables declaration//GEN-END:variables
}
