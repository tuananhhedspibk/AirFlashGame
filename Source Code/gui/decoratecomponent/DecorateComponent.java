package gui.decoratecomponent;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import tokenizerfunc.TokenizerFunc;

public class DecorateComponent{

	public JLabel tree1 = new JLabel();
	public JLabel tree2 = new JLabel();
	public JLabel tree3 = new JLabel();
	public JLabel tree4 = new JLabel();
	public JLabel tree5 = new JLabel();
	public JLabel tree6 = new JLabel();
	public JLabel tree7 = new JLabel();
	public JLabel tree8 = new JLabel();
	public JLabel tree9 = new JLabel();
	public JLabel tree10 = new JLabel();
	public JLabel tree11 = new JLabel();
	public JLabel tree12 = new JLabel();
	public JLabel package1 = new JLabel();
	public JLabel package2 = new JLabel();
	public JLabel package3 = new JLabel();
	public JLabel package4 = new JLabel();
	public JLabel factory = new JLabel();

	public DecorateComponent(JLayeredPane jlayeredpane, TokenizerFunc tokenizerfunc){
		
		tokenizerfunc.makeIcon(jlayeredpane, tree1, 620, 420, 36, 40, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/tree.png");
		tokenizerfunc.makeIcon(jlayeredpane, tree2, 620, 470, 36, 40, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/tree.png");
		tokenizerfunc.makeIcon(jlayeredpane, tree3, 660, 420, 36, 40, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/tree.png");
		tokenizerfunc.makeIcon(jlayeredpane, tree4, 660, 470, 36, 40, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/tree.png");
		tokenizerfunc.makeIcon(jlayeredpane, tree5, 350, 240, 32, 40, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/tree.png");
		tokenizerfunc.makeIcon(jlayeredpane, tree6, 390, 190, 32, 40, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/tree.png");
		tokenizerfunc.makeIcon(jlayeredpane, tree7, 630, 190, 32, 40, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/tree.png");
		tokenizerfunc.makeIcon(jlayeredpane, tree8, 390, 240, 32, 40, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/tree.png");
		tokenizerfunc.makeIcon(jlayeredpane, tree9, 350, 190, 32, 40, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/tree.png");
		tokenizerfunc.makeIcon(jlayeredpane, tree10, 590, 190, 32, 40, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/tree.png");
		tokenizerfunc.makeIcon(jlayeredpane, tree11, 590, 240, 32, 40, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/tree.png");
		tokenizerfunc.makeIcon(jlayeredpane, tree12, 630, 240, 32, 40, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/tree.png");
		tokenizerfunc.makeIcon(jlayeredpane, package1, 410, 470, 40, 30, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/package.png");
		tokenizerfunc.makeIcon(jlayeredpane, package2, 410, 510, 40, 30, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/package.png");
		tokenizerfunc.makeIcon(jlayeredpane, package3, 360, 510, 40, 30, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/package.png");
		tokenizerfunc.makeIcon(jlayeredpane, package4, 360, 470, 40, 30, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/package.png");
		tokenizerfunc.makeIcon(jlayeredpane, factory, 0, 380, 300, 170, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/factory.png");
	}
}
