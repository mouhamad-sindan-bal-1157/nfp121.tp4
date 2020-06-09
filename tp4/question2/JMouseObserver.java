package question2;

import java.awt.event.MouseListener;// �  compléter
import java.awt.event.MouseEvent;
import java.awt.TextArea;

/**
 * Décrivez votre classe JButtonObserver ici.
 * Mouse enter event listener
 * @author Anthony Trad
 * @version 1.0
 */
public class JMouseObserver implements MouseListener{ // �  compléter

    private String nom;
    private TextArea contenu;

    /**
     * Constructeur d'objets de classe JButtonObserver
     */
    public JMouseObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }

    public void mouseClicked(MouseEvent e) {
    }

    /**
     * affichage d'un message dans la zone de texte ce message est de la forme
     * observateur this.nom : souris entrée en (X,Y) exemple : observateur jmo1
     * : souris entrée en (15,20)
     * 
     * @param
     */
    public void mouseEntered(MouseEvent e) {
        String message = new StringBuilder().append("observeur ").append(this.nom).append(" : souris entr�e en (").append(e.getX()).append(",")
        .append(e.getY()).append(")").toString();
        contenu.append(message + "\n");
    }

    public void mouseExited(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

}