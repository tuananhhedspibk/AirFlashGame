package gamescreen;

import javax.swing.*;

public interface GameScreenInterface{

	public static final JFrame screenFrame = new JFrame("AirFlashGame");
	public static final JPanel panel = new JPanel();
	public static final JButton buttonEasy = new JButton("Easy");
	public static final JButton buttonNormal = new JButton("Normal");
	public static final JButton buttonHard = new JButton("Hard");
	public static final JButton buttonAbout = new JButton("About");
	public static final JButton buttonExit = new JButton("Quit");
	public static final JLabel nameOfGameLabel = new JLabel();
	public static final JLabel backgroundLabel = new JLabel();
	public static final JLabel setLevelLabel = new JLabel("SET LEVEL");
	public static final JLabel menuLabel = new JLabel("MENU");
}