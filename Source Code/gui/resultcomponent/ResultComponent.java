package gui.resultcomponent;

import gui.fontcomponent.FontComponent;
import javax.swing.*;
import tokenizerfunc.TokenizerFunc;

public class ResultComponent{

	public resultBoxRed = new JLabel();
	public resultBoxGreen = new JLabel();
	public resultBoxYellow = new JLabel();
	public resultBoxBlue = new JLabel();
	
	public resultLabelRed = new JLabel();
	public resultLabelGreen = new JLabel();
	public resultLabelYellow = new JLabel();
	public resultLabelBlue = new JLabel();
	
	public pointLabel = new JLabel();

	public scoreField = new JTextField();


	public ResultComponent(JLayeredPane layeredpane, FontComponent fontcomponent, TokenizerFunc tokenizerfunc){
		tokenizerfunc.makeIcon(jlayeredpane, resultBoxRed, 600, 0, 40, 32, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/box1.png");
		tokenizerfunc.makeIcon(jlayeredpane, resultBoxGreen, 670, 0, 40, 32, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/box2.png");
		tokenizerfunc.makeIcon(jlayeredpane, resultBoxYellow, 740, 0, 40, 32, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/box3.png");
		tokenizerfunc.makeIcon(jlayeredpane, resultBoxBlue, 810, 0, 40, 32, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/box4.png");
		
		resultLabelRed.setText("x0");
		layeredpane.add(resultLabelRed);
		resultLabelRed.setBounds(640, 10, 30, 17);
		
		resultLabelGreen.setText("x0");
		layeredpane.add(resultLabelGreen);
		resultLabelGreen.setBounds(710, 10, 30, 17);
		
		resultLabelYellow.setText("x0");
		layeredpane.add(resultLabelYellow);
		resultLabelYellow.setBounds(780, 10, 30, 17);
		
		resultLabelBlue.setText("x0");
		layeredpane.add(resultLabel4);
		resultLabel4.setBounds(850, 10, 30, 17);
		
		pointLabel.setText("SCORE");
		layeredpane.add(pointLabel);
		pointLabel.setBounds(410, 0, 50, 30);
		
		layeredpane.add(scoreField);
		
		scoreField.setText("0");
		scoreField.setBounds(460, 0, 120, 27);
		scoreField.setEditable(false);
		scoreField.setFont(fontcomponent.fontNormal);
	}
}
