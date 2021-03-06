
import java.sql.*;
import java.util.*;
public class Disease extends javax.swing.JFrame {

    
    public Disease() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cholestrol = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fhistory = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bmi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        answerField = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        back = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Heart Disease Prediction System");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gaurav\\Downloads\\heart-beat-icon.png")); // NOI18N

        bp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel3.setText("Enter Systolic Blood Pressure");

        cholestrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cholestrolActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel4.setText("Enter Cholestrol Level");

        fhistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fhistoryActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel5.setText("Enter whether Patient has a Family History: (1/0) ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel6.setText("Enter BMI");

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel7.setText("Enter Age");

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(218, 218, 218))))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(bmi)
                            .addComponent(fhistory)
                            .addComponent(cholestrol)
                            .addComponent(bp)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(back))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(submit)
                                .addGap(18, 18, 18)
                                .addComponent(answerField)))
                        .addGap(94, 94, 94)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cholestrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(fhistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(back))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void bpActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {
        
        String bpp = bp.getText();
        String cholestroll = cholestrol.getText();
        String fhistoryy = fhistory.getText();
        String bmii = bmi.getText();
        String agee = age.getText();
        NaiveBayes naive = new NaiveBayes();
        String result = naive.execute(bpp, cholestroll, fhistoryy, bmii, agee);  
       
       
        answerField.setText(result);
        
    }

    private void cholestrolActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void fhistoryActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {
        bp.setText("");
        cholestrol.setText("");
        fhistory.setText("");
        bmi.setText("");
        age.setText("");
        answerField.setText("");
    }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        User u= new User();
        u.setVisible(true);
        this.dispose();
        
    }
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Disease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Disease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Disease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Disease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Disease().setVisible(true);
            }
        });
    }
    private javax.swing.JTextField age;
    private javax.swing.JTextField answerField;
    private javax.swing.JButton back;
    private javax.swing.JTextField bmi;
    private javax.swing.JTextField bp;
    private javax.swing.JTextField cholestrol;
    private javax.swing.JTextField fhistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    
}
