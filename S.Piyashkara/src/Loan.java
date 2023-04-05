


import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;


public class Loan extends javax.swing.JFrame {

    double loan;
    double interest;
    double month;
    double payment;
    double MonthlyPayment;
    String name;
    String Item;

  
    public Loan() {
        initComponents();
        setLocationRelativeTo(this);
        dt();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtName = new javax.swing.JTextField();
        jtxtItemType = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtLoan = new javax.swing.JTextField();
        jtxtinterest = new javax.swing.JTextField();
        jNumberOfPayments = new javax.swing.JTextField();
        jtxtMonthlyPayment = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_Loan_Balance = new javax.swing.JTextField();
        Txt_Payment = new javax.swing.JTextField();
        DueAmount = new javax.swing.JTextField();
        Due_Btn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        Save_Btn = new javax.swing.JButton();
        Reset_Btn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLoanReport = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Timerr = new javax.swing.JTextField();
        datess = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        down_payment_txt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        item_price_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtCus_Name = new javax.swing.JTextField();
        jtxtItem_Type = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLoanCalculator = new javax.swing.JButton();
        jReset = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loan Management System");
        setBackground(new java.awt.Color(0, 51, 51));
        setForeground(new java.awt.Color(153, 153, 153));
        setName("Loan Management System"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 102, 255));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 64)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Loan Management System");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 790, 90));

        jExit.setBackground(new java.awt.Color(0, 255, 204));
        jExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jExit.setForeground(new java.awt.Color(0, 0, 51));
        jExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_48px.png"))); // NOI18N
        jExit.setBorderPainted(false);
        jExit.setContentAreaFilled(false);
        jExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jExit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_50px.png"))); // NOI18N
        jExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_50px.png"))); // NOI18N
        jExit.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_50px.png"))); // NOI18N
        jExit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Cancel_50px.png"))); // NOI18N
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jPanel1.add(jExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 10, 50, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Subtract2_50px.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Subtract_50px.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Subtract_50px.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Subtract_50px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1163, 0, 50, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1490, 90));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 80, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Item Type");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jtxtName.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jPanel3.add(jtxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 340, -1));

        jtxtItemType.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jPanel3.add(jtxtItemType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 340, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 540, 130));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Amount of Loan");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Interest Rate");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Number of Payments");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Payment Per Month");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jtxtLoan.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jPanel4.add(jtxtLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 260, 30));

        jtxtinterest.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jPanel4.add(jtxtinterest, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 58, 260, 30));

        jNumberOfPayments.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jPanel4.add(jNumberOfPayments, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 260, -1));

        jtxtMonthlyPayment.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jPanel4.add(jtxtMonthlyPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 260, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 540, 190));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Loan Balance");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, -1, -1));

        jLabel12.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Last Payment");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 92, -1, 30));

        txt_Loan_Balance.setBackground(new java.awt.Color(0, 0, 0));
        txt_Loan_Balance.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        txt_Loan_Balance.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(txt_Loan_Balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 270, 30));

        Txt_Payment.setBackground(new java.awt.Color(0, 0, 0));
        Txt_Payment.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Txt_Payment.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(Txt_Payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 90, 270, 30));

        DueAmount.setEditable(false);
        DueAmount.setBackground(new java.awt.Color(0, 0, 0));
        DueAmount.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        DueAmount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(DueAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, 270, 30));

        Due_Btn.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Due_Btn.setText("Due");
        Due_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Due_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Due_BtnActionPerformed(evt);
            }
        });
        jPanel5.add(Due_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 180, -1, 30));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Save_Btn.setBackground(new java.awt.Color(0, 0, 0));
        Save_Btn.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Save_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Save_Btn.setText("Save");
        Save_Btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Save_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_BtnActionPerformed(evt);
            }
        });
        jPanel7.add(Save_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Reset_Btn.setBackground(new java.awt.Color(0, 0, 0));
        Reset_Btn.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Reset_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Reset_Btn.setText("Reset");
        Reset_Btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reset_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reset_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_BtnActionPerformed(evt);
            }
        });
        jPanel7.add(Reset_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, 150, 50));

        jLabel14.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Due Amount");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 142, -1, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLoanReport.setEditable(false);
        jLoanReport.setBackground(new java.awt.Color(255, 255, 255));
        jLoanReport.setColumns(20);
        jLoanReport.setRows(5);
        jLoanReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jLoanReport);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 690, 240));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 710, 260));

        jButton3.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jButton3.setText("VIEW CUSTOMER DETAILS");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 240, 170, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 1260, 370));

        jLabel13.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel13.setText("Time");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        Timerr.setEditable(false);
        Timerr.setBackground(new java.awt.Color(255, 255, 255));
        Timerr.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        getContentPane().add(Timerr, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 270, 30));

        datess.setEditable(false);
        datess.setBackground(new java.awt.Color(255, 255, 255));
        datess.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        getContentPane().add(datess, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 150, 30));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setText("Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 30));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton2.setText("Cal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        down_payment_txt.setBackground(new java.awt.Color(0, 0, 0));
        down_payment_txt.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        down_payment_txt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(down_payment_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 190, 30));

        jLabel16.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel16.setText("Down Payment");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 140, 30));

        item_price_txt.setBackground(new java.awt.Color(0, 0, 0));
        item_price_txt.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        item_price_txt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(item_price_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 190, 30));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel7.setText("Item Price");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 90, 30));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 700, 70));

        jLabel15.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel15.setText("Customer Name");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setText("Item Type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 320, -1, -1));

        jtxtCus_Name.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        getContentPane().add(jtxtCus_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 240, 270, 30));

        jtxtItem_Type.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        getContentPane().add(jtxtItem_Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 350, 270, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLoanCalculator.setBackground(new java.awt.Color(0, 0, 0));
        jLoanCalculator.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLoanCalculator.setForeground(new java.awt.Color(255, 255, 255));
        jLoanCalculator.setText("Loan Calculate");
        jLoanCalculator.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLoanCalculator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLoanCalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoanCalculatorActionPerformed(evt);
            }
        });
        jPanel6.add(jLoanCalculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jReset.setBackground(new java.awt.Color(0, 0, 0));
        jReset.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jReset.setForeground(new java.awt.Color(255, 255, 255));
        jReset.setText("Reset");
        jReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });
        jPanel6.add(jReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 710, 50));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel17.setText("USER NAME");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 110, 380, 40));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        //Exit Button Code
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jExitActionPerformed

    private void jLoanCalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoanCalculatorActionPerformed

        // Loan Calculator
        String iMonthPayment = String.format(jtxtMonthlyPayment.getText());

        if (jtxtLoan.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You must enter amount of loan to borrow", "Loan System", JOptionPane.INFORMATION_MESSAGE);
        } else {
            loan = Double.parseDouble(jtxtLoan.getText());
            String Balance = String.format(jtxtLoan.getText());
        }
     

        if (jtxtinterest.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You must enter Interest rate", "Loan System", JOptionPane.INFORMATION_MESSAGE);
        } else {
            interest = Double.parseDouble(jtxtinterest.getText());
            String iInterest = String.format(jtxtinterest.getText());
        }

      
        if (jNumberOfPayments.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You must enter Number Of Payment", "Loan System", JOptionPane.INFORMATION_MESSAGE);
        } else {
            month = Double.parseDouble(jNumberOfPayments.getText());
            String iMonth = String.format(jNumberOfPayments.getText());
        }

        payment = (loan + ((loan * interest) / 100));

        MonthlyPayment = payment / month;
        String PayMonth = String.format("%.2f", MonthlyPayment);
        jtxtMonthlyPayment.setText(PayMonth);
        
        name = String.format(jtxtName.getText());
        Item = String.format(jtxtItemType.getText());

        jLoanReport.append("\n\t***********\tLoan Management System\t***********\n\n"
                + "Customer's Name:\t\t " + name
                + "\nItem Type:\t\t\t " + Item
                + "\nAmount of Loan:\t\t\t Rs. " + loan
                + "\nInterest Rate:\t\t\t Rs. " + interest
                + "\nNumber Of Payment Months:\t Rs. " + month
                + "\nPayment per Month:\t\t Rs. " + MonthlyPayment
                + "\nTotal Loan Payment:\t\t Rs. " + payment
                + "\n\nThanks for choosing our Loan System");

    }//GEN-LAST:event_jLoanCalculatorActionPerformed

    private void jtxtLoanAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtLoanAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtLoanAmountActionPerformed

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        //Reset Button Code here
        jtxtName.setText("");
        jtxtItemType.setText("");
        jtxtLoan.setText("");
        jtxtinterest.setText("");
        jNumberOfPayments.setText("");
        jtxtMonthlyPayment.setText("");
        jLoanReport.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // This Minimize button codde
        setState(Frame.ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Due_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Due_BtnActionPerformed
        dueamount();
        // TODO add your handling code here:
    }//GEN-LAST:event_Due_BtnActionPerformed

    private void Reset_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_BtnActionPerformed
        
        jtxtCus_Name.setText("");
        jtxtItem_Type.setText("");
        item_price_txt.setText("");
        down_payment_txt.setText("");
        txt_Loan_Balance.setText("");
        Txt_Payment.setText("");
        DueAmount.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_Reset_BtnActionPerformed

    private void Save_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_BtnActionPerformed

        //Save Button Code
        try {
            String Time = Timerr.getText();
            String Customer_Name = jtxtCus_Name.getText();
            String Item_Type = jtxtItem_Type.getText();
            String Item_Price = item_price_txt.getText();
            String Down_Payment = down_payment_txt.getText();
            String Loan_Balance = txt_Loan_Balance.getText();
            String Payment = Txt_Payment.getText();
            String Due_Amount = DueAmount.getText();
            String Datess = datess.getText();

            if (Time.isEmpty() || Customer_Name.isEmpty() || Item_Type.isEmpty() ||Item_Price.isEmpty() ||Down_Payment.isEmpty() || Loan_Balance.isEmpty() || Payment.isEmpty() || Due_Amount.isEmpty()|| Datess.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Fill All Fields");
            } else {

                int i = JOptionPane.showConfirmDialog(this, "Are you sure save..?", "SAVE", JOptionPane.YES_NO_OPTION);

                if (i == 0) {
                    db.iud("insert into details value('" + Time + "','" + Customer_Name + "','" + Item_Type + "','" + Item_Price + "','" + Down_Payment + "','" + Loan_Balance + "','" + Payment + "','" + Due_Amount + "','" + Datess + "')");
                    JOptionPane.showMessageDialog(this, "Save success..!");

                  

                    dueamount();

                }
            }          
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Save_BtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // TODO add your handling code here:
        
        calloanamount();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     load mf = new  load();
      mf.setVisible(true);
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JTextField DueAmount;
    javax.swing.JButton Due_Btn;
    javax.swing.JButton Reset_Btn;
    javax.swing.JButton Save_Btn;
    javax.swing.JTextField Timerr;
    javax.swing.JTextField Txt_Payment;
    javax.swing.JTextField datess;
    javax.swing.JTextField down_payment_txt;
    javax.swing.JTextField item_price_txt;
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JButton jButton3;
    javax.swing.JButton jExit;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel10;
    javax.swing.JLabel jLabel11;
    javax.swing.JLabel jLabel12;
    javax.swing.JLabel jLabel13;
    javax.swing.JLabel jLabel14;
    javax.swing.JLabel jLabel15;
    javax.swing.JLabel jLabel16;
    javax.swing.JLabel jLabel17;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JButton jLoanCalculator;
    javax.swing.JTextArea jLoanReport;
    javax.swing.JTextField jNumberOfPayments;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JPanel jPanel4;
    javax.swing.JPanel jPanel5;
    javax.swing.JPanel jPanel6;
    javax.swing.JPanel jPanel7;
    javax.swing.JPanel jPanel8;
    javax.swing.JButton jReset;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTextField jtxtCus_Name;
    javax.swing.JTextField jtxtItemType;
    javax.swing.JTextField jtxtItem_Type;
    javax.swing.JTextField jtxtLoan;
    javax.swing.JTextField jtxtMonthlyPayment;
    javax.swing.JTextField jtxtName;
    javax.swing.JTextField jtxtinterest;
    javax.swing.JTextField txt_Loan_Balance;
    // End of variables declaration//GEN-END:variables

    private void dueamount() {

        try {
            int Loan_Balance = Integer.parseInt(txt_Loan_Balance.getText());
            int Payment = Integer.parseInt(Txt_Payment.getText());

            int answer = Loan_Balance - Payment;

            DueAmount.setText(answer + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please Enter Valid Number");
        }

    }
    
        private void calloanamount() {

        try {
            int Item_Price = Integer.parseInt(item_price_txt.getText());
            int Down_Payment = Integer.parseInt(down_payment_txt.getText());

            int answer = Item_Price - Down_Payment;

            jtxtLoan.setText(answer + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please Enter Valid Number");
        }

    }

  
    
        private void dt() {
        Timer t = new Timer(1000, new ActionListener() {
            Date d;
            SimpleDateFormat sdf;

            @Override
            public void actionPerformed(ActionEvent e) {
                d = new Date();
                sdf = new SimpleDateFormat("yyyy-MM-dd");
                datess.setText("" + sdf.format(d));
                sdf = new SimpleDateFormat("HH:mm:ss");
                Timerr.setText(sdf.format(d));
            }
        });
        t.start();
    }

}
