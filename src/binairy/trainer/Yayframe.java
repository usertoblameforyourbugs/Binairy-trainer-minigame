/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binairy.trainer;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author Tycho
 */
public class Yayframe extends javax.swing.JFrame {

    /**
     * Creates new form Jframe
     */
    public Yayframe() {
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

        but_1 = new javax.swing.JToggleButton();
        but_2 = new javax.swing.JToggleButton();
        but_4 = new javax.swing.JToggleButton();
        but_8 = new javax.swing.JToggleButton();
        but_16 = new javax.swing.JToggleButton();
        but_32 = new javax.swing.JToggleButton();
        but_64 = new javax.swing.JToggleButton();
        but_128 = new javax.swing.JToggleButton();
        tf_goal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf_current = new javax.swing.JTextField();
        tf_clicks = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_128 = new javax.swing.JLabel();
        lbl_64 = new javax.swing.JLabel();
        lbl_32 = new javax.swing.JLabel();
        lbl_16 = new javax.swing.JLabel();
        lbl_8 = new javax.swing.JLabel();
        lbl_4 = new javax.swing.JLabel();
        lbl_2 = new javax.swing.JLabel();
        lbl_1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Binary minigame");
        setResizable(false);

        but_1.setText("1");
        but_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_1ActionPerformed(evt);
            }
        });

        but_2.setText("2");
        but_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_2ActionPerformed(evt);
            }
        });

        but_4.setText("4");
        but_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_4ActionPerformed(evt);
            }
        });

        but_8.setText("8");
        but_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_8ActionPerformed(evt);
            }
        });

        but_16.setText("16");
        but_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_16ActionPerformed(evt);
            }
        });

        but_32.setText("32");
        but_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_32ActionPerformed(evt);
            }
        });

        but_64.setText("64");
        but_64.setToolTipText("");
        but_64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_64ActionPerformed(evt);
            }
        });

        but_128.setText("128");
        but_128.setToolTipText("");
        but_128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_128ActionPerformed(evt);
            }
        });

        tf_goal.setEditable(false);
        tf_goal.setText("0");

        jLabel1.setText("Current number:");

        jLabel2.setText("Goal:");

        jButton1.setText("Next Challange");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Clicks:");

        tf_current.setEditable(false);
        tf_current.setText("0");

        tf_clicks.setEditable(false);
        tf_clicks.setText("0");

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Made by Tycho Scholtze, 2015");

        jLabel5.setText("Binairy:");

        lbl_128.setText("0");

        lbl_64.setText("0");

        lbl_32.setText("0");

        lbl_16.setText("0");

        lbl_8.setText("0");

        lbl_4.setText("0");

        lbl_2.setText("0");

        lbl_1.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_current, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_128)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_goal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_clicks, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(but_128)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but_64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but_32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but_16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(but_8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but_4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but_1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(137, 137, 137))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_current, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_128)
                    .addComponent(lbl_64)
                    .addComponent(lbl_32)
                    .addComponent(lbl_16)
                    .addComponent(lbl_8)
                    .addComponent(lbl_4)
                    .addComponent(lbl_2)
                    .addComponent(lbl_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(tf_goal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_clicks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(but_1)
                    .addComponent(but_2)
                    .addComponent(but_4)
                    .addComponent(but_8)
                    .addComponent(but_16)
                    .addComponent(but_32)
                    .addComponent(but_64)
                    .addComponent(but_128))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void but_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_1ActionPerformed
     tf_clicks.setText(Integer.toString(Integer.parseInt(tf_clicks.getText())+1));  
        if (but_1.isSelected())
        {
            lbl_1.setText("1");
            tf_current.setText(Integer.toString(Integer.parseInt(tf_current.getText())+1));
        }
    else
        {
            lbl_1.setText("0");
            tf_current.setText(Integer.toString(Integer.parseInt(tf_current.getText())-1));
        }
    }//GEN-LAST:event_but_1ActionPerformed

    private void but_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_2ActionPerformed
     tf_clicks.setText(Integer.toString(Integer.parseInt(tf_clicks.getText())+1));
        if (but_2.isSelected())
        {
            lbl_2.setText("1");
            tf_current.setText(Integer.toString(Integer.parseInt(tf_current.getText())+2));
        }
    else
        {
            lbl_2.setText("0");
            tf_current.setText(Integer.toString(Integer.parseInt(tf_current.getText())-2));
        }
    }//GEN-LAST:event_but_2ActionPerformed

    private void but_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_4ActionPerformed
     tf_clicks.setText(Integer.toString(Integer.parseInt(tf_clicks.getText())+1));
        if (but_4.isSelected())
        {
            lbl_4.setText("1");
            tf_current.setText(Integer.toString(Integer.parseInt(tf_current.getText())+4));
        }
    else
        {
            lbl_4.setText("0");
            tf_current.setText(Integer.toString(Integer.parseInt(tf_current.getText())-4));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_but_4ActionPerformed

    private void but_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_8ActionPerformed
    tf_clicks.setText(Integer.toString(Integer.parseInt(tf_clicks.getText())+1)); 
        if (but_8.isSelected())
        {
            lbl_8.setText("1");
            tf_current.setText(Integer.toString(Integer.parseInt(tf_current.getText())+8));
        }
    else
        {
            lbl_8.setText("0");
            tf_current.setText(Integer.toString(Integer.parseInt(tf_current.getText())-8));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_but_8ActionPerformed

    private void but_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_16ActionPerformed
     tf_clicks.setText(Integer.toString(Integer.parseInt(tf_clicks.getText())+1));
        if (but_16.isSelected())
        {
            lbl_16.setText("1");
            tf_current.setText(Integer.toString(Integer.parseInt(tf_current.getText())+16));
        }
    else
        {
            lbl_16.setText("0");
            tf_current.setText(Integer.toString(Integer.parseInt(tf_current.getText())-16));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_but_16ActionPerformed

    private void but_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_32ActionPerformed
     tf_clicks.setText(Integer.toString(Integer.parseInt(tf_clicks.getText())+1));
        if (but_32.isSelected())
        {
            lbl_32.setText("1");
            tf_current.setText(Integer.toString(Integer.parseInt(tf_current.getText())+32));
        }
    else
        {
            lbl_32.setText("0");
            tf_current.setText(Integer.toString(Integer.parseInt(tf_current.getText())-32));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_but_32ActionPerformed

    private void but_64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_64ActionPerformed
     tf_clicks.setText(Integer.toString(Integer.parseInt(tf_clicks.getText())+1));
        if (but_64.isSelected())
        {
            lbl_64.setText("1");
            tf_current.setText(Integer.toString(Integer.parseInt(tf_current.getText())+64));
        }
    else
        {
            lbl_64.setText("0");
            tf_current.setText(Integer.toString(Integer.parseInt(tf_current.getText())-64));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_but_64ActionPerformed

    private void but_128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_128ActionPerformed
    tf_clicks.setText(Integer.toString(Integer.parseInt(tf_clicks.getText())+1));
        if (but_128.isSelected())
        {
            lbl_128.setText("1");
            tf_current.setText(Integer.toString(Integer.parseInt(tf_current.getText())+128));
        }
    else
        {
            lbl_128.setText("0");
            tf_current.setText(Integer.toString(Integer.parseInt(tf_current.getText())-128));
        }
    }//GEN-LAST:event_but_128ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

            tf_clicks.setText("0");
            tf_current.setText("0");
            but_1.setSelected(false);
            but_2.setSelected(false);
            but_4.setSelected(false);
            but_8.setSelected(false);
            but_16.setSelected(false);
            but_32.setSelected(false);
            but_64.setSelected(false);
            but_128.setSelected(false);
            lbl_1.setText("0");
            lbl_2.setText("0");
            lbl_4.setText("0");
            lbl_8.setText("0");
            lbl_16.setText("0");
            lbl_32.setText("0");
            lbl_64.setText("0");
            lbl_128.setText("0");
            tf_goal.setText(Integer.toString(ThreadLocalRandom.current().nextInt(0, 256)));

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Yayframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Yayframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Yayframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Yayframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Yayframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton but_1;
    private javax.swing.JToggleButton but_128;
    private javax.swing.JToggleButton but_16;
    private javax.swing.JToggleButton but_2;
    private javax.swing.JToggleButton but_32;
    private javax.swing.JToggleButton but_4;
    private javax.swing.JToggleButton but_64;
    private javax.swing.JToggleButton but_8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_128;
    private javax.swing.JLabel lbl_16;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_32;
    private javax.swing.JLabel lbl_4;
    private javax.swing.JLabel lbl_64;
    private javax.swing.JLabel lbl_8;
    private javax.swing.JTextField tf_clicks;
    private javax.swing.JTextField tf_current;
    private javax.swing.JTextField tf_goal;
    // End of variables declaration//GEN-END:variables
}
