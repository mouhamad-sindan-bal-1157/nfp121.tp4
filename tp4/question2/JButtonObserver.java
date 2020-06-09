package question2;

import java.awt.event.ActionListener ;// � compl�ter
import java.awt.event.ActionEvent; // � compl�ter
import java.awt.TextArea;

/**
 * D�crivez votre classe JButtonObserver ici.
 * Button click ovbserver
 * @author Anthony Trad
 * @version 1.0
 */
public class JButtonObserver implements ActionListener{ // � compl�ter

    private String nom;
    private TextArea contenu;

    /**
     * Constructeur d'objets de classe JButtonObserver
     * 
     * @param nom
     *            le nom du bouton, jbo1, jbo2, jbo3, jmo1, jmo2, jmo3
     * @param contenu
     *            la zone de texte de l'applette
     */
    public JButtonObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }

    /**
     * affichage d'un message dans la zone de texte ce message est de la forme
     * observateur this.nom : clic du bouton nom_du_bouton exemple : observateur
     * jbo1 : clic du bouton A, voir la m�thode getActionCommand()
     * 
     * @param ActionEvent e
     */
    public void actionPerformed(ActionEvent e) {
        String message = "observeur ".concat(this.nom).concat(" : clic du bouton ").concat(e.getActionCommand()); // � compl�ter, inspirez-vous de l'applette de l'�nonc�
        contenu.append(message + "\n");
    }

}