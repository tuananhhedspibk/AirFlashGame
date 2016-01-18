package gui.makearrow;

import auxiliary.Auxiliary;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import tokenizerfunc.TokenizerFunc;

public class MakeArrow{
	public JLabel arrow1 = new JLabel();
	public JLabel arrow2 = new JLabel();
	public JLabel arrow3 = new JLabel();
	public JLabel arrow4 = new JLabel();
	public JLabel arrow5 = new JLabel();
	public JLabel arrow6 = new JLabel();
	public JLabel arrow7 = new JLabel();
	public JLabel arrow8 = new JLabel();
	public JLabel arrow9 = new JLabel();
	public JLabel arrow10 = new JLabel();

	public MakeArrow(JLayeredPane jlayeredpane, TokenizerFunc tokenizerfunc, final Auxiliary aux){
		tokenizerfunc.makeIcon(jlayeredpane, arrow1, 60, 300, 30, 30, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/up.png");
		tokenizerfunc.makeIcon(jlayeredpane, arrow2, 230, 300, 30, 30, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/up.png");
		tokenizerfunc.makeIcon(jlayeredpane, arrow3, 480, 110, 30, 30, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/right.png");
		tokenizerfunc.makeIcon(jlayeredpane, arrow4, 970, 210, 30, 30, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/up.png");
		tokenizerfunc.makeIcon(jlayeredpane, arrow5, 780, 110, 30, 30, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/right.png");
		tokenizerfunc.makeIcon(jlayeredpane, arrow6, 780, 210, 30, 30, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/up.png");
		tokenizerfunc.makeIcon(jlayeredpane, arrow7, 480, 380, 30, 30, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/right.png");
		tokenizerfunc.makeIcon(jlayeredpane, arrow8, 780, 380, 30, 30, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/right.png");
		tokenizerfunc.makeIcon(jlayeredpane, arrow9, 60, 110, 30, 40, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/up.png");
		tokenizerfunc.makeIcon(jlayeredpane, arrow10, 230, 110, 30, 30, "//usr/share/AirFlashGame/DatabaseOfAirGame/Resource/up.png");
		arrow1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mouseevent){
				if(aux.count[0] == 0){
					arrow1.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/right.png"));
					aux.count[0]++;
				} 
				else if(aux.count[0] == 1){
					arrow1.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/up.png"));
					aux.count[0] = 0;
				}
			}
		});
		arrow2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mouseevent){
				if(aux.count[1] == 0){
					arrow2.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/left.png"));
					aux.count[1]++;
				} 
				else if(aux.count[1] == 1){
					arrow2.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/up.png"));
					aux.count[1] = 0;
				}
			}
		});
		arrow3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mouseevent){
				if(aux.count[2] == 0){
					arrow3.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/down.png"));
					aux.count[2]++;
				} 
				else if(aux.count[2] == 1){
					arrow3.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/left.png"));
					aux.count[2]++;
				} 
				else if(aux.count[2] == 2){
					arrow3.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/right.png"));
					aux.count[2] = 0;
				}
			}
		});
		arrow4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mouseevent){
				if(aux.count[3] == 0){
					arrow4.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/down.png"));
					aux.count[3]++;
				} 
				else if(aux.count[3] == 1){
					arrow4.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/left.png"));
					aux.count[3]++;
				} 
				else if(aux.count[3] == 2){
					arrow4.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/up.png"));
					aux.count[3] = 0;
				}
			}
		});
		arrow5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mouseevent){
				if(aux.count[4] == 0){
					arrow5.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/down.png"));
					aux.count[4]++;
				} 
				else if(aux.count[4] == 1){
					arrow5.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/left.png"));
					aux.count[4]++;
				} 
				else if(aux.count[4] == 2){
					arrow5.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/right.png"));
					aux.count[4] = 0;
				}
			}
		});
		arrow6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mouseevent){
				if(aux.count[5] == 0){
					arrow6.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/right.png"));
					aux.count[5]++;
				} 
				else if(aux.count[5] == 1){
					arrow6.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/down.png"));
					aux.count[5]++;
				} 
				else if(aux.count[5] == 2){
					arrow6.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/up.png"));
					aux.count[5] = 0;
				}
			}
		});
		arrow7.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent mouseevent){
				if(aux.count[6] == 0){
					arrow7.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/up.png"));
					aux.count[6]++;
				} 
				else if(aux.count[6] == 1){
					arrow7.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/right.png"));
					aux.count[6] = 0;
				}
			}
		});
		arrow8.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent mouseevent){
				if(aux.count[7] == 0){
					arrow8.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/left.png"));
					aux.count[7]++;
				} 
				else if(aux.count[7] == 1){
					arrow8.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/up.png"));
					aux.count[7]++;
				} 
				else if(aux.count[7] == 2){
					arrow8.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/right.png"));
					aux.count[7] = 0;
				}
			}
		});
		arrow9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mouseevent){
				if(aux.count[8] == 0){
					arrow9.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/right.png"));
					aux.count[8]++;
				} else
				if(aux.count[8] == 1){
					arrow9.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/down.png"));
					aux.count[8]++;
				} 
				else if(aux.count[8] == 2){
					arrow9.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/up.png"));
					aux.count[8] = 0;
				}
			}
		});
		arrow10.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mouseevent){
				if(aux.count[9] == 0){
					arrow10.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/right.png"));
					aux.count[9]++;
				} 
				else if(aux.count[9] == 1){
					arrow10.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/down.png"));
					aux.count[9]++;
				} 
				else if(aux.count[9] == 2){
					arrow10.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/left.png"));
					aux.count[9]++;
				} 
				else if(aux.count[9] == 3){
					arrow10.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/up.png"));
					aux.count[9] = 0;
				}
			}
		});
	}
}
