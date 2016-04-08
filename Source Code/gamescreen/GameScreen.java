package gamescreen;

import animation.MakeAnimation;
import auxiliary.Auxiliary;
import gui.mainframe.MainFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import javax.swing.*;
import tokenizerfunc.TokenizerFunc;

public class GameScreen implements GameScreenInterface{
	TokenizerFunc tkf = new TokenizerFunc();
	
	public GameScreen(){
		screenFrame.setDefaultCloseOperation(3);
		screenFrame.getContentPane().setLayout(null);
		screenFrame.setSize(655, 560);
		screenFrame.setVisible(true);
		screenFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowevent){
				tkf.deleteAfterExecute();
				System.exit(0);
			}
		});
		
		setLevelLabel.setFont(new Font("Ubuntu", 1, 18));
		setLevelLabel.setForeground(new Color(234, 41, 21));
		setLevelLabel.setHorizontalAlignment(0);
		setLevelLabel.setBounds(38, 280, 110, 30);
		
		menuLabel.setFont(new Font("Ubuntu", 1, 18));
		menuLabel.setForeground(new Color(234, 41, 21));
		menuLabel.setHorizontalAlignment(0);
		menuLabel.setBounds(528, 290, 90, 30);
		
		nameOfGameLabel.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/nameOfGame.png"));
		nameOfGameLabel.setBounds(-10, 0, 350, 50);
		
		buttonEasy.setBounds(50, 320, 85, 30);
		buttonNormal.setBounds(50, 360, 85, 30);
		buttonHard.setBounds(50, 400, 85, 30);
		buttonAbout.setBounds(530, 330, 85, 30);
		buttonExit.setBounds(530, 370, 85, 30);
		
		buttonEasy.setBackground(Color.WHITE);
		buttonNormal.setBackground(Color.WHITE);
		buttonHard.setBackground(Color.WHITE);
		buttonAbout.setBackground(Color.WHITE);
		buttonExit.setBackground(Color.WHITE);
		
		buttonEasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent){
				MainFrame mainframe = new MainFrame(5);
				// --- Use Timer to schedule for TimerTask ---
				Timer timer = new Timer();
				timer.schedule(new MakeAnimation(mainframe), 0L, 550L);				// --- Schedule for timerTask will be executed repeatly period and start after delay ---
				MainFrame _tmp = mainframe;
				if(MainFrame.aux.flagTimer == 0)
				{
					timer.cancel();					// --- Cancel task ---
					timer.purge();					// --- Remove all cancelled task ---
				}
			}
		});

		buttonNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent){
				MainFrame mainframe = new MainFrame(4);
				// --- Use Timer to schedule for TimerTask ---
				Timer timer = new Timer();
				timer.schedule(new MakeAnimation(mainframe), 0L, 600L);				// --- Schedule for timerTask will be executed repeatly period and start after delay ---
				MainFrame _tmp = mainframe;
				if(MainFrame.aux.flagTimer == 0)
				{
					timer.cancel();					// --- Cancel task ---
					timer.purge();					// --- Remove all cancelled task ---
				}
			}
		});

		buttonHard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent){
				MainFrame mainframe = new MainFrame(3);
				// --- Use Timer to schedule for TimerTask ---
				Timer timer = new Timer();
				timer.schedule(new MakeAnimation(mainframe), 0L, 650L);				// --- Schedule for timerTask will be executed repeatly period and start after delay ---
				MainFrame _tmp = mainframe;
				if(MainFrame.aux.flagTimer == 0)
				{
					timer.cancel();					// --- Cancel task ---
					timer.purge();					// --- Remove all cancelled task ---
				}
			}
		});

		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent){
				tkf.deleteAfterExecute();
				System.exit(0);
			}
		});

		buttonAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionevent){
				ImageIcon imageicon = new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/airflashgame.jpg");
				String s = "This Is AirFlashGame, Designed By Java Language\nWritten By AnhTT - HUST\nCopyright (c) 2015\nContact Me At :tuananhhedspibk@gmail.com For More Details";
				JOptionPane.showMessageDialog(null, s, "Information Of AirFlashGame", 1, imageicon);
			}
		});
		
		backgroundLabel.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/background.jpg"));
		backgroundLabel.setBounds(0, 0, 655, 555);
		
		panel.setBounds(0, 0, 655, 555);
		panel.add(setLevelLabel);
		panel.add(nameOfGameLabel);
		panel.add(menuLabel);
		panel.add(buttonEasy);
		panel.add(buttonNormal);
		panel.add(buttonHard);
		panel.add(buttonAbout);
		panel.add(buttonExit);
		panel.add(backgroundLabel);
		panel.setLayout(null);
		
		screenFrame.getContentPane().add(panel);
	}
}