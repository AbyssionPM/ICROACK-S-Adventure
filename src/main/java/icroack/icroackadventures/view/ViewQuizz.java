/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icroack.icroackadventures.view;

import icroack.icroackadventures.controler.ControlerQuizz;
import icroack.icroackadventures.model.Question;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Pierre
 */
public class ViewQuizz extends JFrame{

    private JPanel panelMain;
    private JButton btn_true;
    private JButton btn_false;
    private JLabel txtQuestion;
    public JLabel count;
    private JLabel jLabel2;
    static private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    public ViewQuizz(ControlerQuizz cq) {
        // Instance des différents composants :
        //this.panelMain = new JPanel();
        this.txtQuestion = new JLabel();
        this.count = new JLabel();
        this.btn_true = new JButton("VRAI");
        this.btn_false = new JButton("FAUX"); 
        this.jLabel2 = new JLabel("Temps restant : ");
        
        // Design des différents composants : 
        // Frame :
        this.setTitle("Icroak");
        this.setSize(400,300);
        this.setLayout(null);
        
        // Boutons : 
        btn_false.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); 
        btn_false.setForeground(new java.awt.Color(255, 255, 255));
        btn_false.setText("Faux");
        btn_false.setBounds(180,-200,100,30);
        btn_false.setOpaque(true);
        
        btn_true.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); 
        btn_true.setForeground(new java.awt.Color(255, 255, 255));
        btn_true.setText("Vrai");
        btn_true.setBounds(50, -200, 100, 30);
        btn_false.setOpaque(true);

        //pack();

        
        // Ajout au panel principal (panelMain)
        this.add(txtQuestion);
        this.add(btn_true);
        this.add(btn_false);
        this.add(count);
        
        //this.getContentPane().add(this.panelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // ActionListener pour les deux boutons :

        btn_true.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int answer_true = 1;
                try {
                    cq.verify_answers(answer_true);
                } catch (SQLException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                }

            }
        });
        btn_false.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int answer_false = 0;
                try {
                    cq.verify_answers(answer_false);
                } catch (SQLException | ClassNotFoundException ex) {
                    ex.printStackTrace();
                }

            }
        });
        
        
         this.setVisible(true);

    }

    public JPanel getPanelMain() {
        return panelMain;
    }

    public void setPanelMain(JPanel panelMain) {
        this.panelMain = panelMain;
    }

    public JLabel getTxtQuestion() {
        return txtQuestion;
    }

    public static void main(String[] args){
        ControlerQuizz cq = new ControlerQuizz();
        cq.start();
    }

}
