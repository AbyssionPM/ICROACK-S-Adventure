/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package icroack.icroackadventures.view;

import icroack.icroackadventures.controler.AdminControler;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * @author FroggyTeam
 */
public class AdminView extends javax.swing.JFrame {

    /**
     * Création d'une nouvelle JFrame permettant l'administration
     * des comptes utilisateurs.
     * Elle a pour attribut :
     * -> AdminControler adc : Objet de type AdminControler
     * -> String selectedOption : Définit le compte sélectionné
     * -> String listAccount : Définit le nombre de compte actif dans la BDD
     */

    private AdminControler adC;
    public String selectedOption;
    private String listAccount;

    /*
     * Constructeur de la classe :
     * -> Création d'un nouvel objet adC (nouvel AdminControler)
     * -> Set de la JFrame à undecorated
     * -> Appel de la méthode initComponent() : définit le design des composants
     * -> Ajout d'une bordure à la JFrame
     * -> Set de la couleur du ContentPane
     * -> Set de la String listAccount au retour de la méthode listAccount de l'objet adC
     * -> Définition du JLabel de la classe au résultat de listAccount
     * -> Appel de la méthode getAllLog afin de récupérer tous les logins
     * -> Set de la fenêtre OnTop => Toujours au dessus des autres applications
     */
    public AdminView() throws SQLException, ClassNotFoundException {
        this.adC = new AdminControler() ;
        this.setUndecorated(true);
        initComponents();
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0,0,0)));
        getContentPane().setBackground(new Color(27, 132, 44));
        this.setLocationRelativeTo(null);
        this.listAccount = adC.listAccount();
        labAccount.setText("Comptes : "+ listAccount);
        adC.getAllLog(this);
        this.setAlwaysOnTop(true);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        labTitleAdmin = new javax.swing.JLabel();
        jCBAccountList = new javax.swing.JComboBox<>();
        btnDeleteAccount = new javax.swing.JButton();
        btnExecSetPass = new javax.swing.JButton();
        btnExecRename = new javax.swing.JButton();
        jTextSetLog = new javax.swing.JTextField();
        jTextSetPass = new javax.swing.JTextField();
        labIconAdmin = new javax.swing.JLabel();
        labSetPass = new javax.swing.JLabel();
        labRename = new javax.swing.JLabel();
        btnExitAdmin = new javax.swing.JButton();
        labWelcome = new javax.swing.JLabel();
        labAccount = new javax.swing.JLabel();
        labelLeft = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        footer = new javax.swing.JLabel();
        labAccountSelected = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labTitleAdmin.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        labTitleAdmin.setForeground(new java.awt.Color(255, 255, 255));
        labTitleAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitleAdmin.setText("Administration des comptes :");
        getContentPane().add(labTitleAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 34, 504, 55));

        jCBAccountList.setBackground(new java.awt.Color(4, 99, 6));
        jCBAccountList.setEditable(true);
        jCBAccountList.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        jCBAccountList.setForeground(new java.awt.Color(255, 255, 255));
        jCBAccountList.setBorder(null);
        jCBAccountList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBAccountListItemStateChanged(evt);
            }
        });
        jCBAccountList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAccountListActionPerformed(evt);
            }
        });
        getContentPane().add(jCBAccountList, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 108, 336, 50));

        btnDeleteAccount.setBackground(new java.awt.Color(4, 99, 6));
        btnDeleteAccount.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        btnDeleteAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteAccount.setText("Supprimer");
        btnDeleteAccount.setBorder(null);
        btnDeleteAccount.setBorderPainted(false);
        btnDeleteAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteAccountMouseEntered(evt);
            }
        });
        btnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountActionPerformed();
            }
        });
        getContentPane().add(btnDeleteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 317, 163, 45));

        btnExecSetPass.setBackground(new java.awt.Color(4, 99, 6));
        btnExecSetPass.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        btnExecSetPass.setForeground(new java.awt.Color(255, 255, 255));
        btnExecSetPass.setText("Go !");
        btnExecSetPass.setBorder(null);
        btnExecSetPass.setBorderPainted(false);
        btnExecSetPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecSetPassActionPerformed(evt);
            }
        });
        getContentPane().add(btnExecSetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 245, 70, 45));

        jTextSetLog.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        jTextSetLog.setForeground(new java.awt.Color(0, 102, 0));
        jTextSetLog.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextSetLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 179, 248, 45));

        jTextSetPass.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        jTextSetPass.setForeground(new java.awt.Color(0, 102, 0));
        jTextSetPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextSetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 245, 248, 45));

        labIconAdmin.setIcon(new javax.swing.ImageIcon("resource/adminIcon.png")); // NOI18N
        getContentPane().add(labIconAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        labSetPass.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        labSetPass.setForeground(new java.awt.Color(255, 255, 255));
        labSetPass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labSetPass.setText("Modifier pass :");
        getContentPane().add(labSetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 245, -1, 44));

        labRename.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        labRename.setForeground(new java.awt.Color(255, 255, 255));
        labRename.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labRename.setText("Renommer :");
        getContentPane().add(labRename, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 176, 100, 51));

        btnExecRename.setBackground(new java.awt.Color(4, 99, 6));
        btnExecRename.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        btnExecRename.setForeground(new java.awt.Color(255, 255, 255));
        btnExecRename.setText("Go !");
        btnExecRename.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExecRename.setBorderPainted(false);
        btnExecRename.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExecRenameMouseEntered(evt);
            }
        });
        btnExecRename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent b) {
                btnExecRenameActionPerformed(b);
            }
        });
        getContentPane().add(btnExecRename, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 179, 70, 45));

        btnExitAdmin.setBackground(new java.awt.Color(4, 99, 6));
        btnExitAdmin.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        btnExitAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnExitAdmin.setText("Quitter");
        btnExitAdmin.setBorder(null);
        btnExitAdmin.setBorderPainted(false);
        btnExitAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnExitAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 374, 163, 45));

        labWelcome.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 14)); // NOI18N
        labWelcome.setForeground(new java.awt.Color(255, 255, 255));
        labWelcome.setText("Bienvenue Administrateur");
        getContentPane().add(labWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 240, 50));

        labAccount.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        labAccount.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(labAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 250, 160, 30));

        labelLeft.setBackground(new java.awt.Color(4, 99, 6));
        labelLeft.setOpaque(true);
        getContentPane().add(labelLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 273, 450));

        header.setBackground(new java.awt.Color(0, 79, 0));
        header.setOpaque(true);
        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 780, 28));

        footer.setBackground(new java.awt.Color(0, 79, 0));
        footer.setToolTipText("");
        footer.setOpaque(true);
        getContentPane().add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 780, 20));

        labAccountSelected.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        labAccountSelected.setForeground(new java.awt.Color(255, 255, 255));
        labAccountSelected.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labAccountSelected.setText("Compte : ");
        getContentPane().add(labAccountSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 100, 51));

        pack();
    }

    private void btnExecSetPassActionPerformed(java.awt.event.ActionEvent evt) {
        /*
        * Cette méthode est exécutée à l'appel du JButton btnExecSetPass :
        * -> Appel de la méthode defineNewPass de l'objet adC
        * -> Prend en paramètre :
        *       - Le compte sélectionné
        *       - Le nouveau mdp rentré par l'administrateur
        *       - l'AdminView
        */
        try {
            adC.defineNewPass(this.selectedOption,jTextSetPass.getText(),this);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void jCBAccountListActionPerformed(java.awt.event.ActionEvent evt) {
        /* Cette méthode sélectionne le nom utilisateur dans la liste déroulante
         * et le transmet à l'attribut selectedOption
         */
        this.selectedOption = jCBAccountList.getSelectedItem().toString();
    }

    private void jCBAccountListItemStateChanged(java.awt.event.ItemEvent evt) {}

    private void btnExitAdminActionPerformed(java.awt.event.ActionEvent evt) {
        // Dispose de la JFrame actuelle
        this.dispose();
    }

    private void btnExecRenameActionPerformed(java.awt.event.ActionEvent evt) {

        /*
         * Cette méthode est exécutée à l'appel du JButton btnExecRename :
         * -> Appel de la méthode renameUser de l'objet adC
         * -> Prend en paramètre :
         *       - Le compte sélectionné
         *       - Le nouveau nom utilisateur saisi par l'administrateur
         *       - l'AdminView
         */

        try {
            adC.renameUser(this.selectedOption,jTextSetLog.getText(),this);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void btnDeleteAccountActionPerformed() {
        /*
         * Cette méthode est exécutée à l'appel du JButton btnDeleteAccount :
         * -> Appel de la méthode deleteAccount de l'objet adC
         * -> Prend en paramètre :
         *       - Le compte sélectionné
         *       - l'AdminView
         */
        try {
            adC.deleteAccount(this.selectedOption, this);
            this.repaint();
            this.revalidate();
        } catch (SQLException ex) {
            Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnExecRenameMouseEntered(java.awt.event.MouseEvent evt){
        this.btnExecRename.setText("Go !");
    }
    private void btnDeleteAccountMouseEntered(java.awt.event.MouseEvent evt) {this.btnDeleteAccount.setText("Supprimer");}

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
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // GETTER & SETTER


    public JTextField getjTextSetLog() {return jTextSetLog;}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDeleteAccount;
    public javax.swing.JButton btnExecRename;
    public javax.swing.JButton btnExecSetPass;
    private javax.swing.JButton btnExitAdmin;
    private javax.swing.JLabel footer;
    private javax.swing.JLabel header;
    public javax.swing.JComboBox<String> jCBAccountList;
    public javax.swing.JTextField jTextSetLog;
    private javax.swing.JTextField jTextSetPass;
    public javax.swing.JLabel labAccount;
    private javax.swing.JLabel labAccountSelected;
    private javax.swing.JLabel labIconAdmin;
    private javax.swing.JLabel labRename;
    private javax.swing.JLabel labSetPass;
    private javax.swing.JLabel labTitleAdmin;
    private javax.swing.JLabel labWelcome;
    private javax.swing.JLabel labelLeft;

}
