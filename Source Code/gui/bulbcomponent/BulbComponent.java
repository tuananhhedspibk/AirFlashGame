package gui.bulbcomponent;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import tokenizerfunc.TokenizerFunc;

public class BulbComponent {
    public JLabel bulb1 = new JLabel();
    public JLabel bulb2 = new JLabel();
    public JLabel bulb3 = new JLabel();
    public JLabel bulb4 = new JLabel();

    public BulbComponent(JLayeredPane layeredPane, TokenizerFunc tokenizerFunc) {
        tokenizerFunc.makeIcon(layeredPane, this.bulb1, 60, 70, 7, 10, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/bulb1.png");
        tokenizerFunc.makeIcon(layeredPane, this.bulb2, 230, 67, 7, 10, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/bulb2.png");
        tokenizerFunc.makeIcon(layeredPane, this.bulb3, 980, 90, 7, 10, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/bulb3.png");
        tokenizerFunc.makeIcon(layeredPane, this.bulb4, 950, 370, 7, 10, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/bulb4.png");
    }
}
