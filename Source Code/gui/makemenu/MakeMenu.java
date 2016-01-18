package gui.makemenu;

import auxiliary.Auxiliary;
import gui.resultcomponent.ResultComponent;
import gui.specialcomponent.SpecialComponent;
import gui.specialcomponent.SpecialLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MakeMenu{

	public JMenuItem newGame;
	public JMenuItem help;
	public JMenuItem about;
	public JMenuItem quitGame;
	
	public JMenu menu;
	
	public JMenuBar menuBar;

	public MakeMenu(final SpecialComponent specialComponent, final JLayeredPane layeredPane, final ResultComponent resultComponent, final Auxiliary aux){
		newGame = new JMenuItem("New Game");
		help = new JMenuItem("Help");
		about = new JMenuItem("About Game");
		quitGame = new JMenuItem("Quit Game");
		menu = new JMenu("Menu");
		menuBar = new JMenuBar();
		newGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent){
				aux.flag = 0;
				for(int i = 0; i < 50; i++){
					if(specialComponent.arrayLabel[i].color != 0)
						layeredPane.remove(specialComponent.arrayLabel[i].label);
					specialComponent.arrayLabel[i] = null;
					specialComponent.arrayLabel[i] = new SpecialLabel();
				}

				resultComponent.resultLabel1.setText("x0");
				resultComponent.resultLabel2.setText("x0");
				resultComponent.resultLabel3.setText("x0");
				resultComponent.resultLabel4.setText("x0");
				resultComponent.scoreField.setText("0");
			}
		});
		help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent)
			{
				ImageIcon imageicon = new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/float.png");
				String s = "AirFlashGame simulated conveyor systems used in industrial plants, airports, or other delivery companies. Diagram game include:\nA single delivery point (eg a factory), there will be items from the conveyor belt being transported\nto the receiving endpoint thereby transporting the equipment taken away.\nThere are corresponding receiving endpoint waiting in the vehicle which is different transport: airplanes, cars and ships.\n- It was a period when a shipment is coming - there is a certain color,\nand it must be the player to control the conveyor belt to reach the correct location receive the same color.\nAfter receiving the finished package as lost on the conveyor belt and colored lights at the receiving point\ncan be changed to other packages wait.\n- Conveyor as a directed graph contains multiple nodes. At each node players can click to change the direction to scroll\nleft, right, up, down to divert cargo to the next line.\nWhen customers are generating more and more, players will have to react quickly to turn all the parcels to the correct destination.\nEach time the goods are delivered to the right place players will get some points.\n- Players can choose the level of play: easy, normal, hard.";
				JOptionPane.showMessageDialog(null, s, "Help Of AirFlashGame", 1, imageicon);
			}
		});
		about.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent)
			{
				ImageIcon imageicon = new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/airflashgame.jpg");
				String s = "This Is AirFlashGame, Designed By Java Language\nWritten By AnhTT - HUST\nCopyright (c) 2015\nContact Me At :tuananhhedspibk@gmail.com For More Details";
				JOptionPane.showMessageDialog(null, s, "Information Of AirFlashGame", 1, imageicon);
			}
		});
		quitGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent){
				System.exit(0);
			}
		});

		menu.add(newGame);
		menu.add(help);
		menu.add(about);
		menu.add(quitGame);
		menuBar.add(menu);
	}
}
