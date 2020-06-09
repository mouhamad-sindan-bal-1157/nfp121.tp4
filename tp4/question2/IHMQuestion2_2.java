package question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IHMQuestion2_2 extends JFrame {

    private JButton boutonA = new JButton("A");
    private JButton boutonB = new JButton("B");
    private JButton boutonC = new JButton("C");

    private TextArea contenu = new TextArea(30, 80);

 
    public IHMQuestion2_2() {
        super("IHM Question2_2");
        JPanel enHaut = new JPanel();
        enHaut.add(boutonA);
        enHaut.add(boutonB);
        enHaut.add(boutonC);
        setLayout(new BorderLayout(5, 5));
        add("North", enHaut);
        add("Center", contenu); // contenu sera transmis aux observateurs, voir
                                // la description des constructeurs
        setLocation(150,150);pack();show();
        enHaut.setBackground(Color.magenta);

        // à compléter
        String btn1="jbo1",btn2="jbo2",btn3="jbo3";
        // le bouton A a 3 observateurs jbo1, jbo2 et jbo3
        boutonA.addActionListener(new JButtonObserver(btn1, contenu));
        boutonA.addActionListener(new JButtonObserver(btn2, contenu));
        boutonA.addActionListener(new JButtonObserver(btn3, contenu));
        // le bouton B a 2 observateurs jbo1 et jbo2
        boutonB.addActionListener(new JButtonObserver(btn1, contenu));
        boutonB.addActionListener(new JButtonObserver(btn2, contenu));
        // le bouton C a 1 observateur jbo1
        boutonC.addActionListener(new JButtonObserver(btn1, contenu));
        
    }
    
     public static void main(String[] args){
        
        new IHMQuestion2_2();
    }
}


