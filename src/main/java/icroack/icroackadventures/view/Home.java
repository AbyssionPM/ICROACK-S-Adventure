/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package icroack.icroackadventures.view;

import icroack.icroackadventures.controler.ControlerConnection;
import icroack.icroackadventures.controler.ControlerScoreBoard;
import icroack.icroackadventures.model.FroggCursor;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;

/**
 *
 * @author Pierre
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    ControlerConnection cq;
    FroggCursor fg;
    public Home() throws IOException {
        this.setUndecorated(true);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0,0,0)));
        initComponents();
        this.setSize(1200, 800);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.fg = new FroggCursor(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        NewGame = new javax.swing.JButton();
        ScoreButton = new javax.swing.JButton();
        Disconnect = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Title.setIcon(new javax.swing.ImageIcon("resource/Title.png")); // NOI18N
        getContentPane().add(Title);
        Title.setBounds(390, 20, 450, 230);

        NewGame.setBackground(new java.awt.Color(23, 112, 201));
        NewGame.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        NewGame.setForeground(new java.awt.Color(255, 255, 255));
        NewGame.setText("Nouvelle Partie");
        NewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameActionPerformed(evt);
            }
        });
        getContentPane().add(NewGame);
        NewGame.setBounds(520, 360, 180, 70);

        ScoreButton.setBackground(new java.awt.Color(23, 112, 201));
        ScoreButton.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        ScoreButton.setForeground(new java.awt.Color(255, 255, 255));
        ScoreButton.setText("Scores");
        ScoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoreButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ScoreButton);
        ScoreButton.setBounds(520, 450, 180, 70);

        Disconnect.setBackground(new java.awt.Color(23, 112, 201));
        Disconnect.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        Disconnect.setForeground(new java.awt.Color(255, 255, 255));
        Disconnect.setText("Deconnexion");
        Disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisconnectActionPerformed(evt);
            }
        });
        getContentPane().add(Disconnect);
        Disconnect.setBounds(520, 540, 180, 70);

        btnAdmin.setBackground(new java.awt.Color(23, 112, 201));
        btnAdmin.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin.setText("Administration");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdmin);
        btnAdmin.setBounds(520, 630, 180, 70);

        BackGround.setIcon(new javax.swing.ImageIcon("resource/BGAccueil_redim_2.png")); // NOI18N
        getContentPane().add(BackGround);
        BackGround.setBounds(0, 0, 1200, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisconnectActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DisconnectActionPerformed

    private void NewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameActionPerformed

            // TODO add your handling code here:
            Game g;
        try {
            g = new Game();
            g.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
            this.dispose();
    }//GEN-LAST:event_NewGameActionPerformed

    private void ScoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoreButtonActionPerformed
        LeaderBoard lb;
        try {
            lb = new LeaderBoard();
            lb.setVisible(true);
            ControlerScoreBoard csb = new ControlerScoreBoard(lb);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }//GEN-LAST:event_ScoreButtonActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        try {
            
            AdminView adV = new AdminView();
            adV.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdminActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Home().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JButton Disconnect;
    private javax.swing.JButton NewGame;
    private javax.swing.JButton ScoreButton;
    private javax.swing.JLabel Title;
    public static javax.swing.JButton btnAdmin;
    // End of variables declaration//GEN-END:variables
}
