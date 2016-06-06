
package Calculationz;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author XY
 */
public class Calculator extends javax.swing.JFrame {
    
    double num1;
    double num2;
    double result;
    String operationz;

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        super ("BSC");
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

        screen = new javax.swing.JTextField();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn10 = new javax.swing.JButton();
        jbtn11 = new javax.swing.JButton();
        jbtn12 = new javax.swing.JButton();
        jbtn13 = new javax.swing.JButton();
        jbtn14 = new javax.swing.JButton();
        jbtn15 = new javax.swing.JButton();
        jbtn16 = new javax.swing.JButton();
        jbtn17 = new javax.swing.JButton();
        jbtn18 = new javax.swing.JButton();
        jbtn19 = new javax.swing.JButton();
        jbtn20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        screen.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        screen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        screen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screenActionPerformed(evt);
            }
        });
        getContentPane().add(screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 190, 47));

        jbtn1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 81, 42, 40));

        jbtn2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 81, 42, 40));

        jbtn3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 81, 42, 40));

        jbtn4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 81, 42, 40));

        jbtn5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, 42, 40));

        jbtn6.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 127, 42, 40));

        jbtn7.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 127, 42, 40));

        jbtn8.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 127, 42, 40));

        jbtn9.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 178, 42, 40));

        jbtn10.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn10.setText("0");
        jbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn10ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 178, 42, 40));

        jbtn11.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn11.setText("+");
        jbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn11ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 178, 42, 40));

        jbtn12.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn12.setText("-");
        jbtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn12ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 178, 42, 40));

        jbtn13.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn13.setText("/");
        jbtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn13ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 231, 42, 40));

        jbtn14.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn14.setText("*");
        jbtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn14ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 231, 42, 40));

        jbtn15.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jbtn15.setText("%");
        jbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn15ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 232, -1, 40));

        jbtn16.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn16.setText(".");
        jbtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn16ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 231, 42, 40));

        jbtn17.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn17.setText("^");
        jbtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn17ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 284, 42, 40));

        jbtn18.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn18.setText("+/-");
        jbtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn18ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 284, -1, 40));

        jbtn19.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn19.setText("=");
        jbtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn19ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 334, 90, 40));

        jbtn20.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jbtn20.setText("C");
        jbtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn20ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 334, 90, 41));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void screenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_screenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_screenActionPerformed

    private void jbtn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn18ActionPerformed
        double opz = Double.parseDouble(String.valueOf(screen.getText()));
        opz = opz * (-1);
        screen.setText(String.valueOf(opz));
    }//GEN-LAST:event_jbtn18ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        String EnterNumber = screen.getText() + jbtn1.getText();
        screen.setText(EnterNumber);
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        String EnterNumber = screen.getText() + jbtn2.getText();
        screen.setText(EnterNumber);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        String EnterNumber = screen.getText() + jbtn3.getText();
        screen.setText(EnterNumber);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        String EnterNumber = screen.getText() + jbtn4.getText();
        screen.setText(EnterNumber);
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        String EnterNumber = screen.getText() + jbtn5.getText();
        screen.setText(EnterNumber);
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        String EnterNumber = screen.getText() + jbtn6.getText();
        screen.setText(EnterNumber);
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        String EnterNumber = screen.getText() + jbtn7.getText();
        screen.setText(EnterNumber);
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        String EnterNumber = screen.getText() + jbtn8.getText();
        screen.setText(EnterNumber);
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        String EnterNumber = screen.getText() + jbtn9.getText();
        screen.setText(EnterNumber);
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn20ActionPerformed
        screen.setText("");
    }//GEN-LAST:event_jbtn20ActionPerformed

    private void jbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn11ActionPerformed
        num1 = Double.parseDouble(screen.getText());
        screen.setText("");
        operationz="+";
    }//GEN-LAST:event_jbtn11ActionPerformed

    private void jbtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn12ActionPerformed
        num1 = Double.parseDouble(screen.getText());
        screen.setText("");
        operationz="-";
    }//GEN-LAST:event_jbtn12ActionPerformed

    private void jbtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn13ActionPerformed
        num1 = Double.parseDouble(screen.getText());
        screen.setText("");
        operationz="/";
    }//GEN-LAST:event_jbtn13ActionPerformed

    private void jbtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn14ActionPerformed
        num1 = Double.parseDouble(screen.getText());
        screen.setText("");
        operationz="*";
    }//GEN-LAST:event_jbtn14ActionPerformed

    private void jbtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn15ActionPerformed
        num1 = Double.parseDouble(screen.getText());
        screen.setText("");
        operationz="%";
    }//GEN-LAST:event_jbtn15ActionPerformed

    private void jbtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn16ActionPerformed
        String EnterNumber = screen.getText() + jbtn16.getText();
        screen.setText(EnterNumber);
    }//GEN-LAST:event_jbtn16ActionPerformed

    private void jbtn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn19ActionPerformed
        String answer;
        num2 = Double.parseDouble(screen.getText());
        if(operationz == "+")
        {
            result = num1+num2;
            answer = String.format("%.0f", result);
            screen.setText(answer);
        }
        else if(operationz == "-")
        {
            result = num1-num2;
            answer = String.format("%.0f", result);
            screen.setText(answer);
        }
        else if(operationz == "/")
        {
            result = num1/num2;
            answer = String.format("%.0f", result);
            screen.setText(answer);
        }
        else if(operationz == "*")
        {
            result = num1*num2;
            answer = String.format("%.0f", result);
            screen.setText(answer);
        }
        else if(operationz == "%")
        {
            result = num1%num2;
            answer = String.format("%.0f", result);
            screen.setText(answer);
        }
        else if(operationz == "^")
        {
            result = Math.pow(num1, num2);
            answer = String.format("%.0f", result);
            screen.setText(answer);
        }
    }//GEN-LAST:event_jbtn19ActionPerformed

    private void jbtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn17ActionPerformed
        num1 = Double.parseDouble(screen.getText());
        screen.setText("");
        operationz="^";
    }//GEN-LAST:event_jbtn17ActionPerformed

    private void jbtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn10ActionPerformed
        String EnterNumber = screen.getText() + jbtn10.getText();
        screen.setText(EnterNumber);
    }//GEN-LAST:event_jbtn10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            // Set System L&F
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
    } 
    catch (UnsupportedLookAndFeelException e) {
       // handle exception
    }
    catch (ClassNotFoundException e) {
       // handle exception
    }
    catch (InstantiationException e) {
       // handle exception
    }
    catch (IllegalAccessException e) {
       // handle exception
    }
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn10;
    private javax.swing.JButton jbtn11;
    private javax.swing.JButton jbtn12;
    private javax.swing.JButton jbtn13;
    private javax.swing.JButton jbtn14;
    private javax.swing.JButton jbtn15;
    private javax.swing.JButton jbtn16;
    private javax.swing.JButton jbtn17;
    private javax.swing.JButton jbtn18;
    private javax.swing.JButton jbtn19;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn20;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JTextField screen;
    // End of variables declaration//GEN-END:variables
}
