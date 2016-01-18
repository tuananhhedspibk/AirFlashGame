package gui.line;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import tokenizerfunc.TokenizerFunc;

public class Line{

	public horizontal1 = new JLabel();
	public horizontal2 = new JLabel();
	public horizontal3 = new JLabel();
	public horizontal4 = new JLabel();
	public horizontal5 = new JLabel();
	public horizontal6 = new JLabel();
	public horizontal7 = new JLabel();
	public horizontal8 = new JLabel();
	public horizontal9 = new JLabel();
	public vertical1 = new JLabel();
	public vertical2 = new JLabel();
	public vertical3 = new JLabel();
	public vertical4 = new JLabel();
	public vertical5 = new JLabel();
	public vertical6 = new JLabel();
	public vertical7 = new JLabel();
	public vertical8 = new JLabel();
	public vertical9 = new JLabel();
	public vertical10 = new JLabel();

	public Line(JLayeredPane jlayeredpane, TokenizerFunc tokenizerfunc){

		tokenizerfunc.makeIcon(jlayeredpane, horizontal1, 510, 120, 270, 10, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/horizontal.png");
		tokenizerfunc.makeIcon(jlayeredpane, horizontal2, 810, 120, 160, 10, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/horizontal.png");
		tokenizerfunc.makeIcon(jlayeredpane, horizontal3, 90, 310, 140, 10, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/horizontal.png");
		tokenizerfunc.makeIcon(jlayeredpane, horizontal4, 90, 120, 140, 10, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/horizontal.png");
		tokenizerfunc.makeIcon(jlayeredpane, horizontal5, 260, 120, 220, 10, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/horizontal.png");
		tokenizerfunc.makeIcon(jlayeredpane, horizontal6, 240, 390, 240, 10, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/horizontal.png");
		tokenizerfunc.makeIcon(jlayeredpane, horizontal7, 810, 220, 160, 10, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/horizontal.png");
		tokenizerfunc.makeIcon(jlayeredpane, horizontal8, 810, 390, 120, 10, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/horizontal.png");
		tokenizerfunc.makeIcon(jlayeredpane, horizontal9, 517, 390, 260, 10, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/horizontal.png");
		tokenizerfunc.makeIcon(jlayeredpane, vertical1, 980, 240, 10, 80, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/vertical.png");
		tokenizerfunc.makeIcon(jlayeredpane, vertical2, 980, 140, 10, 70, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/vertical.png");
		tokenizerfunc.makeIcon(jlayeredpane, vertical3, 490, 140, 10, 240, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/vertical.png");
		tokenizerfunc.makeIcon(jlayeredpane, vertical4, 240, 330, 10, 70, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/vertical.png");
		tokenizerfunc.makeIcon(jlayeredpane, vertical5, 790, 240, 10, 140, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/vertical.png");
		tokenizerfunc.makeIcon(jlayeredpane, vertical6, 790, 140, 10, 70, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/vertical.png");
		tokenizerfunc.makeIcon(jlayeredpane, vertical7, 70, 140, 10, 160, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/vertical.png");
		tokenizerfunc.makeIcon(jlayeredpane, vertical8, 240, 140, 10, 160, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/vertical.png");
		tokenizerfunc.makeIcon(jlayeredpane, vertical9, 70, 60, 10, 50, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/vertical.png");
		tokenizerfunc.makeIcon(jlayeredpane, vertical10, 240, 60, 10, 50, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/vertical.png");
	}
}
