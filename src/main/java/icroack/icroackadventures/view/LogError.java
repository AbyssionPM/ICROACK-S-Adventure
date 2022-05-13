/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package icroack.icroackadventures.view;

import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author FroggyTeam
 */
public class LogError extends javax.swing.JFrame {

    /**
     * Creation d'une nouvelle JFrame LogError,
     * cette JFrame ne sert qu'à signifier à l'utilisateur
     * qu'il existe une erreur dans un de ses identifiants;
     */
    public LogError() {
        this.setUndecorated(true);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0,0,0)));
        initComponents();
        this.setSize(300, 230);
        this.setBackground(new Color(13,94,13));
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        Errortext = new javax.swing.JLabel();
        ErrorLogo = new javax.swing.JLabel();
        OsCourt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BackGroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Errortext.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        Errortext.setForeground(new java.awt.Color(255, 255, 255));
        Errortext.setText("Erreur de connexion ");
        getContentPane().add(Errortext);
        Errortext.setBounds(70, 60, 190, 30);

        ErrorLogo.setIcon(new javax.swing.ImageIcon("resource/error.png")); // NOI18N
        getContentPane().add(ErrorLogo);
        ErrorLogo.setBounds(120, 10, 60, 50);

        OsCourt.setIcon(new javax.swing.ImageIcon("resource/PepeAngry.png")); // NOI18N
        getContentPane().add(OsCourt);
        OsCourt.setBounds(-10, 90, 150, 160);

        jButton1.setBackground(new java.awt.Color(8, 60, 8));
        jButton1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("OK!");
        jButton1.setToolTipText("");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 150, 100, 40);

        BackGroundLabel.setBackground(new java.awt.Color(9, 71, 9));
        BackGroundLabel.setOpaque(true);
        getContentPane().add(BackGroundLabel);
        BackGroundLabel.setBounds(0, 0, 300, 230);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {this.dispose();}

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
            java.util.logging.Logger.getLogger(LogError.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogError.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogError.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogError.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogError().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGroundLabel;
    private javax.swing.JLabel ErrorLogo;
    private javax.swing.JLabel Errortext;
    private javax.swing.JLabel OsCourt;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
