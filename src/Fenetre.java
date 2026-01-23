import javax.swing.*;
import java.awt.*;


public class Fenetre{
	protected JFrame window;
	private String nom_fenetre = "genshin planer";
	private int hauteur = 600, largeur = 600, hauteur_min = 400, largeur_min = 400;
	public Fenetre(){
		window = new JFrame(nom_fenetre);
		window.setSize(largeur, hauteur);
		window.setMinimumSize(new Dimension(largeur_min, hauteur_min));
		window.setResizable(true);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
