/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package icroack.icroackadventures.view;

import icroack.icroackadventures.controler.ControlerAccountCreation;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;

/**
 * @author FroggyTeam
 */
public class AccountCreation extends javax.swing.JFrame {

    /**
     * Cette classe crée une JFrame permettant de créer un
     * nouveau compte.
     * Elle possède des attributs déclarés au bas de la
     * classe propre aux composants de la JFrame.
     */

    /*
     * Constructeur de la classe :
     * -> On set la JFrame en undecorated
     * -> On appelle la méthode initComponent qui définit l'ensemble des composants (positions, couleur, etc)
     * -> On définit une bordure à la JFrame
     * -> On définit la taille de la JFrame
     * -> On centre la JFrame à l'écran
     * -> On set la couleur du ContentPane
     */
    public AccountCreation() {
        this.setUndecorated(true);
        initComponents();
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0,0,0)));
        this.setSize(394, 522);
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(13,94,13));
        
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        logAccountCreation = new javax.swing.JTextField();
        passAccountCreation = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JButton();
        btnExitCreate = new javax.swing.JButton();
        passValidation = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Icroack's Adventure : Nouveau compte");

        logAccountCreation.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        logAccountCreation.setForeground(new java.awt.Color(8, 60, 8));
        logAccountCreation.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        passAccountCreation.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        passAccountCreation.setForeground(new java.awt.Color(8, 60, 8));
        passAccountCreation.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon("resource/froglog.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("resource/logPass.png")); // NOI18N

        btnCreateAccount.setBackground(new java.awt.Color(8, 60, 8));
        btnCreateAccount.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        btnCreateAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateAccount.setText("Créer le compte");
        btnCreateAccount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateAccount.setBorderPainted(false);
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        btnExitCreate.setBackground(new java.awt.Color(8, 60, 8));
        btnExitCreate.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        btnExitCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnExitCreate.setText("Annuler");
        btnExitCreate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExitCreate.setBorderPainted(false);
        btnExitCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitCreateActionPerformed(evt);
            }
        });

        passValidation.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        passValidation.setForeground(new java.awt.Color(8, 60, 8));
        passValidation.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setIcon(new javax.swing.ImageIcon("resource/logPass.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExitCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(logAccountCreation, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                        .addComponent(passAccountCreation, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                        .addComponent(passValidation, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logAccountCreation, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passAccountCreation, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(passValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnExitCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {
        /*
        * Méthode appelée à l'appui de btnCreateAccount :
        *
        * -> Récupération des entrées utilisateurs + stockage dans des variables du scope
        * -> Envoi au ControlerAccountCreation qui se charge d'ajouter dans la BDD
        */
        String pseudo = logAccountCreation.getText();
        String pwd = passAccountCreation.getText().toString();
        String pwdConf = passValidation.getText();

        try {
            ControlerAccountCreation cac = new ControlerAccountCreation(pseudo, pwd, pwdConf, this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccountCreation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AccountCreation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnExitCreateActionPerformed(java.awt.event.ActionEvent evt) {
        /*
         * Méthode appelée à l'appui de btnExitCreate :
         *
         * -> Ferme la fenêtre de création du compte
         * -> Crée une nouvelle JFrame Login
         */
        this.dispose();
        Login l = null;
        try {
            l = new Login();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        l.setVisible(true);
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
            java.util.logging.Logger.getLogger(AccountCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountCreation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnExitCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField logAccountCreation;
    private javax.swing.JPasswordField passAccountCreation;
    private javax.swing.JPasswordField passValidation;
    // End of variables declaration//GEN-END:variables
}
