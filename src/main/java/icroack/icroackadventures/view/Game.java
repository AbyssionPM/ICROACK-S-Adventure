/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package icroack.icroackadventures.view;

import icroack.icroackadventures.model.Audio;
import icroack.icroackadventures.model.Character;
import icroack.icroackadventures.controler.TimerTime;
import icroack.icroackadventures.model.FroggCursor;
import icroack.icroackadventures.model.RollDice;
import icroack.icroackadventures.model.Player;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

/**
 * @author FroggyTeam
 */
public class Game extends javax.swing.JFrame {

    /*
     * Création d'une JFrame Game => Coeur principal de l'app
     * Attributs de la classe :
     *      - int counter : entier qui compte le nombre de lancer de dé
     *      - ViewTimer vt : objet vt de type ViewTimer
     *      - TimerTime tt : objet tt de type TimerTime (la classe modèle du timer)
     *      - Character ch : objet ch de type Character (la grenouille)
     *      - ViewBoard vb : objet vb de type ViewBoard (le plateau de jeu)
     *      - FroggCursor fc : objet fc de type FroggCursor (modification du pointeur de la souris)
     *      - Player player : objet player de type Player
     */
    private int counter;
    public static ViewTimer vt;
    public static TimerTime tt;
    public Character ch;
    public ViewBoard vb;
    private FroggCursor fc;
    private Player player;

    /*
    * Constructeur de la classe :
    * -> Set de conter à 0
    * -> Set de la JFrame à undecorated
    * -> Ajout d'une bordure
    * -> Appel de la méthode initComponent();
    * -> Set de la taille de la JFrame
    * -> Positionnement de la JFrame au centre de la fenêtre
    * -> Création des nouveaux objets tt, vt, ch, player, fc
    * -> Ajout de son et début de la musique au lancement de la JFrame
    * */
    public Game() throws IOException{
        this.counter = 0;
        this.setUndecorated(true);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0,0,0)));
        initComponents();
        this.setSize(1197, 933);
        this.setLocationRelativeTo(null);
        this.tt = new TimerTime();
        this.vt = new ViewTimer();
        tt.start();
        this.ch = new Character();
        froggyIcon.setIcon(new ImageIcon("resource/froggyVictory.gif")); //image mv
        this.player = new Player();
        this.fc = new FroggCursor(this);
        String song = "resource/coffindance.wav";
        try {
            Audio.playSound(song);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // GETTERS & SETTERS
    public int getCounter() {
        return counter;
    }
    public JLabel getChronoLabel() {return chronoLabel;}
    public void setChronoLabel(JLabel chronoLabel) {this.chronoLabel = chronoLabel;}

    @SuppressWarnings("unchecked")
    private void initComponents() {

        froggyIcon = new javax.swing.JLabel();
        try {
            viewBoard2 = new icroack.icroackadventures.view.ViewBoard();
        } catch (java.io.IOException e1) {
            e1.printStackTrace();
        }
        chronoLabel = new javax.swing.JLabel();
        rolledDice = new javax.swing.JLabel();
        iconRolledDice = new javax.swing.JLabel();
        labScore = new javax.swing.JLabel();
        closeGame = new javax.swing.JLabel();
        iconChrono = new javax.swing.JLabel();
        lastRollIco = new javax.swing.JLabel();
        labTotalScore = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonRoll = new javax.swing.JLabel();
        transPan = new javax.swing.JLabel();
        bgGame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        froggyIcon.setIcon(new javax.swing.ImageIcon("resource/froggyVictory.gif")); // NOI18N
        getContentPane().add(froggyIcon);
        froggyIcon.setBounds(260, 30, 80, 80);

        viewBoard2.setOpaque(false);
        getContentPane().add(viewBoard2);
        viewBoard2.setBounds(260, 20, 710, 640);

        chronoLabel.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        chronoLabel.setForeground(new java.awt.Color(111, 178, 200));
        getContentPane().add(chronoLabel);
        chronoLabel.setBounds(180, 820, 150, 50);

        rolledDice.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 36)); // NOI18N
        rolledDice.setForeground(new java.awt.Color(111, 178, 198));
        rolledDice.setText("0");
        getContentPane().add(rolledDice);
        rolledDice.setBounds(940, 800, 80, 70);

        iconRolledDice.setIcon(new javax.swing.ImageIcon("resource/LabelDiceRolled[1].png")); // NOI18N
        getContentPane().add(iconRolledDice);
        iconRolledDice.setBounds(860, 710, 300, 200);

        labScore.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        labScore.setForeground(new java.awt.Color(0, 102, 0));
        labScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(labScore);
        labScore.setBounds(50, 240, 170, 110);

        closeGame.setIcon(new javax.swing.ImageIcon("resource/closeGame.png")); // NOI18N
        closeGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeGameMouseClicked(evt);
            }
        });
        getContentPane().add(closeGame);
        closeGame.setBounds(1090, 10, 91, 91);

        iconChrono.setIcon(new javax.swing.ImageIcon("resource/LabelChrono[2].png")); // NOI18N
        getContentPane().add(iconChrono);
        iconChrono.setBounds(60, 720, 300, 200);
        getContentPane().add(lastRollIco);
        lastRollIco.setBounds(100, 50, 80, 80);

        labTotalScore.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        labTotalScore.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(labTotalScore);
        labTotalScore.setBounds(50, 250, 170, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon("resource/lastRollLabel.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 210, 210);

        buttonRoll.setIcon(new javax.swing.ImageIcon("resource/buttonRoll_r.png")); // NOI18N
        buttonRoll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRollMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRollMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonRollMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonRollMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonRollMouseReleased(evt);
            }
        });
        buttonRoll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buttonRollKeyTyped(evt);
            }
        });
        getContentPane().add(buttonRoll);
        buttonRoll.setBounds(520, 710, 200, 200);

        transPan.setIcon(new javax.swing.ImageIcon("resource/TranparentLayer.png")); // NOI18N
        transPan.setToolTipText("");
        getContentPane().add(transPan);
        transPan.setBounds(260, 20, 710, 640);

        bgGame.setIcon(new javax.swing.ImageIcon("resource/backgroundGame.png")); // NOI18N
        bgGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bgGameMouseEntered(evt);
            }
        });
        getContentPane().add(bgGame);
        bgGame.setBounds(0, -20, 1200, 970);

        pack();
    }

    private void buttonRollMouseClicked(java.awt.event.MouseEvent evt) {
        // Ajout d'un son à l'appui du bouton
        String rollDiceSong = "resource/diceroll.wav";

        try {
            Audio.playSound(rollDiceSong);
        } catch (UnsupportedAudioFileException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            ex.printStackTrace();
        }
        /*
        * Création de l'objet :
        * RollDice rd => Permet le lancement du dès
        * Mise à jour de l'image du lancement à l'appui sur le bouton (qui est en
        * réalité un JLabel possédant un ActionEvent)
        *
        * Récupération du résultat de la méthode random() de l'objet rd
        * Augmentation du counter de +1 à chaque appui sur le bouton
        * Définition de l'image du JLabel iconRolledDice correspondant au résultat du dé
        */
        RollDice rd = new RollDice();
        ImageIcon btnClick = new ImageIcon("resource/rdb_press.gif");

        int result = rd.random();
        buttonRoll.setIcon(btnClick);
        this.counter++;
        rolledDice.setText(String.valueOf(counter));
        rd.SetIconDice(result);

        /*
         * Appel de la méthode moveCharacter de l'objet ch qui permet
         * de déplacer le personnage sur le plateau du jeu.
         * Elle prend en paramètre :
         *  -> Le résultat du dé
         *  -> L'objet tt de type TimerTime
         *  -> Le JLabel buttonRoll
         *  -> La JFrame Game
         */
        try {
                try {
                    ch.moveCharacter(result, tt, buttonRoll, this);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        /*
         * Appel de la méthode setBounds de l'objet froggyIcon (type : JLabel)
         *  -> Permet de positionner le personnage sur la grille aux positions
         *      X et Y donné par les getters de l'objet ch.
         * */
        froggyIcon.setBounds(ch.getxPosCharacter(), ch.getyPosCharacter(),80,80);
        player.defineScore();
        player.setLabelScore(this);
        froggyIcon.repaint();
        froggyIcon.revalidate();

    }

    private void buttonRollMouseEntered(java.awt.event.MouseEvent evt) {
        ImageIcon btnEnter = new ImageIcon("resource/rdb2.gif");
        buttonRoll.setIcon(btnEnter);
    }

    private void buttonRollMouseExited(java.awt.event.MouseEvent evt) {
        ImageIcon btnExited = new ImageIcon("resource/buttonRoll_r.png");
        buttonRoll.setIcon(btnExited);
    }

    private void buttonRollMousePressed(java.awt.event.MouseEvent evt) {}

    private void buttonRollMouseReleased(java.awt.event.MouseEvent evt) {
        ImageIcon btnExited = new ImageIcon("resource/buttonRoll_r.png");
        buttonRoll.setIcon(btnExited);
    }

    private void closeGameMouseClicked(java.awt.event.MouseEvent evt) {
        /*
        * A l'appui du bouton pause :
        *   -> nouvel objet mp de type MenuPause
        *   -> Appel de la méthode suspend() de l'objet tt (hérité de Thread)
        */
        MenuPause mp = new MenuPause(this);
        mp.setVisible(true);
        this.tt.suspend();
    }

    private void buttonRollKeyTyped(java.awt.event.KeyEvent evt) {}

    private void bgGameMouseEntered(java.awt.event.MouseEvent evt) {}

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Game().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private javax.swing.JLabel bgGame;
    private javax.swing.JLabel buttonRoll;
    public javax.swing.JLabel chronoLabel;
    private javax.swing.JLabel closeGame;
    public javax.swing.JLabel froggyIcon;
    private javax.swing.JLabel iconChrono;
    private javax.swing.JLabel iconRolledDice;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel labScore;
    public static javax.swing.JLabel labTotalScore;
    public static javax.swing.JLabel lastRollIco;
    private javax.swing.JLabel rolledDice;
    private javax.swing.JLabel transPan;
    private icroack.icroackadventures.view.ViewBoard viewBoard2;
}
