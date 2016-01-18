package gui.transportation;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import tokenizerfunc.TokenizerFunc;

public class Transportation{

	public transportTruck1 = new JLabel();
	public transportTruck2 = new JLabel();
	public transportShip = new JLabel();
	public transportPlane = new JLabel();

	public Transportation(JLayeredPane layeredpane, TokenizerFunc tokenizerfunc){		
		tokenizerfunc.makeIcon(layeredpane, transportTruck1, 50, 0, 90, 61, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/truck.png");
		tokenizerfunc.makeIcon(layeredpane, transportTruck2, 210, 0, 90, 61, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/truck.png");
		tokenizerfunc.makeIcon(layeredpane, transportShip, 930, 310, 110, 50, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/ship.png");
		tokenizerfunc.makeIcon(layeredpane, transportPlane, 960, 40, 90, 47, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/plane.png");
	}
}