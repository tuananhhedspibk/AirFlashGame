package animation;

import auxiliary.Auxiliary;
import gui.fontcomponent.FontComponent;
import gui.mainframe.MainFrame;
import gui.makepane.MakePane;
import gui.resultcomponent.ResultComponent;
import gui.specialcomponent.SpecialComponent;
import gui.specialcomponent.SpecialLabel;

import java.awt.*;
import java.awt.event.*;
import java.io.PrintStream;
import java.util.TimerTask;
import javax.swing.*;
import tokenizerfunc.TokenizerFunc;

public class MakeAnimation extends TimerTask{
	public MainFrame copyMainFrame;
	public JFrame scoreFrame;

	public JPanel panel;
	
	public JLabel congrate = new JLabel();
	public JLabel scoreText = new JLabel();
	public JLabel scoreValue = new JLabel();
	public JLabel emo1 = new JLabel();
	public JLabel emo2 = new JLabel();
	public JLabel wantToSay = new JLabel();
	
	private ActionListener updateTask;
	public Timer timer;

	public MakeAnimation(final MainFrame mainFrame){
		scoreFrame = new JFrame("STATISTICS");
		panel = new JPanel();
		updateTask = new ActionListener() {
			public void actionPerformed(ActionEvent actionevent){
				if(MainFrame.aux.flag == 0){
					int i = 0;
					for(int j = 0; j < 50; j++){
						if(MainFrame.specialComponent.arrayLabel[j].color == 5){
							i++;
						}
					}
					if(i == 50){
						MainFrame.aux.flag = 1;
						makeScoreFrame();
					}
				}
				deletePackageAndChangeBulb();
				getDirection();
				update();
				MainFrame.frame.repaint();
			}
		};
		
		timer = new Timer(MainFrame.aux.delay, updateTask);
		copyMainFrame = mainFrame;
		
		MainFrame.aux.flag = 0;
		MainFrame.aux.flagTimer = 1;
		
		SwingWorker swingworker = new SwingWorker() {
			protected String doInBackground() throws Exception{
				for(int i = 0; i < 50; i++){
					if(MainFrame.specialComponent.arrayLabel[i].color != 0){
						if(MainFrame.specialComponent.arrayLabel[i].color != 5){
							MainFrame.makePane.pane.remove(MainFrame.specialComponent.arrayLabel[i].label);
						}
					}
					MainFrame.specialComponent.arrayLabel[i] = new SpecialLabel();
				}
				return "";
			}
		};
		swingworker.execute();
		
		MainFrame.resultComponent.resultLabelRed.setText("x0");
		MainFrame.resultComponent.resultLabelGreen.setText("x0");
		MainFrame.resultComponent.resultLabelYellow.setText("x0");
		MainFrame.resultComponent.resultLabelBlue.setText("x0");
		MainFrame.resultComponent.scoreField.setText("0");
		MainFrame.frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowevent){
				timer.stop();
				MainFrame.aux.flagTimer = 0;
				cancel();
			}
		});
	}

	public void deletePackageAndChangeBulb(){
		Point point = new Point();
		SwingWorker swingworker = new SwingWorker() {

			protected String doInBackground() throws Exception{
				int l = Integer.parseInt(MainFrame.resultComponent.scoreField.getText());
				l += 10;
				MainFrame.resultComponent.scoreField.setText((new StringBuilder()).append(l).append("").toString());
				
				return (new StringBuilder()).append(l).append("").toString();
			}
		};

		for(int j = 0; j < 50; j++){
			if(MainFrame.specialComponent.arrayLabel[j].color == 0){
				continue;
			}
			if(MainFrame.specialComponent.arrayLabel[j].color == 5){
				continue;
			}
			
			Point point1 = MainFrame.specialComponent.arrayLabel[j].label.getLocation();
			if((point1.getX() != 930 || point1.getY() != 380) && (point1.getX() != 970 || point1.getY() != 300) && (point1.getX() != 970 || point1.getY() != 110) && (point1.getX() != 930 || point1.getY() != 110) && (point1.getX() != 60 || point1.getY() != 60) && (point1.getX() != 230 || point1.getY() != 60)){
				continue;
			}
			
			Point point2;
			if(point1.getX() == 60 && point1.getY() == 60){
				point2 = new Point(60, 70);
			}
			else if(point1.getX() == 230 && point1.getY() == 60){
				point2 = new Point(230, 67);
			}
			else if(point1.getX() == 970 && point1.getY() == 110 || point1.getX() == 930 && point1.getY() == 110){
				point2 = new Point(980, 90);
			}
			else{
				point2 = new Point(950, 370);
			}
			
			JLabel component = MainFrame.tkf.getComponentAt(MainFrame.makePane.pane, point2);
			int i = MainFrame.tkf.getBulbColorValue(component);

			if(i == MainFrame.specialComponent.arrayLabel[j].color){
				swingworker.execute();
				if(i == 1){
					MainFrame.resultComponent.resultLabel1.setText(MainFrame.tkf.setTextForResultLabel(MainFrame.resultComponent.resultLabel1));
				} else
				if(i == 2){
					MainFrame.resultComponent.resultLabel2.setText(MainFrame.tkf.setTextForResultLabel(MainFrame.resultComponent.resultLabel2));
				} else
				if(i == 3){
					MainFrame.resultComponent.resultLabel3.setText(MainFrame.tkf.setTextForResultLabel(MainFrame.resultComponent.resultLabel3));
				} 
				else{
					MainFrame.resultComponent.resultLabel4.setText(MainFrame.tkf.setTextForResultLabel(MainFrame.resultComponent.resultLabel4));
				}
			}

			int k;
			do
			{
				k = MainFrame.tkf.getRandom(MainFrame.aux.arrayColor);
			} 
			while(k == i);	
			setNewIconForBulb(jlabel, k);
			MainFrame.makePane.pane.remove(MainFrame.specialComponent.arrayLabel[j].label);
			MainFrame.specialComponent.arrayLabel[j].color = 5;
			MainFrame.specialComponent.arrayLabel[j].flag = 0;
		}
	}

	public void setNewIconForBulb(JLabel bulb, int i){
		if(i == 1){
			bulb.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/bulb1.png"));
		}
		else if(i == 2){
			bulb.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/bulb2.png"));
		}
		else if(i == 3){
			bulb.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/bulb3.png"));
		}
		else if(i == 4){
			bulb.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/bulb4.png"));
		}
	}

	public void getDirection(){
		Point point = new Point();
		for(int i = 0; i < 50; i++)
		{
			if(MainFrame.specialComponent.arrayLabel[i].color == 0)
				continue;
			if(MainFrame.specialComponent.arrayLabel[i].color == 5)
				continue;
			Point point = MainFrame.specialComponent.arrayLabel[i].label.getLocation();
			if((point.getX() != 230 || point.getY() != 300) && (point.getX() != 60 || point.getY() != 300) && (point.getX() != 60 || point.getY() != 110) && (point.getX() != 230 || point.getY() != 110) && (point.getX() != 480 || point.getY() != 110) && (point.getX() != 480 || point.getY() != 380) && (point.getX() != 780 || point.getY() != 380) && (point.getX() != 780 || point.getY() != 210) && (point.getX() != 780 || point.getY() != 110) && (point.getX() != 970 || point.getY() != 210)){
				continue;
			}
			JLabel component = MainFrame.tkf.getComponentAt(MainFrame.makePane.pane, point);
			if(component.getIcon().toString().equals("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/right.png")){
				MainFrame.specialComponent.arrayLabel[i].flag = 1;
				continue;
			}
			if(component.getIcon().toString().equals("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/left.png")){
				MainFrame.specialComponent.arrayLabel[i].flag = 2;
				continue;
			}
			if(component.getIcon().toString().equals("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/up.png")){
				MainFrame.specialComponent.arrayLabel[i].flag = 3;
				continue;
			}
			if(component.getIcon().toString().equals("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/down.png")){
				MainFrame.specialComponent.arrayLabel[i].flag = 4;
			}
		}

	}

	public void run(){
		int i = 0;
		do{
			if(i >= 50){
				break;
			}
			if(MainFrame.specialComponent.arrayLabel[i].color == 0){
				MainFrame.specialComponent.arrayLabel[i].flag = MainFrame.tkf.getRandom(MainFrame.aux.arrayFlag);
				MainFrame.specialComponent.arrayLabel[i].color = MainFrame.tkf.getRandom(MainFrame.aux.arrayColor);
				if(MainFrame.specialComponent.arrayLabel[i].color == 1){
					MainFrame.tkf.makeIcon(MainFrame.makePane.pane, MainFrame.specialComponent.arrayLabel[i].label, MainFrame.specialComponent.arrayLabel[i].x, MainFrame.specialComponent.arrayLabel[i].y, 40, 32, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/box1.png");
				} 
				else{
					if(MainFrame.specialComponent.arrayLabel[i].color == 2)	{

						MainFrame.tkf.makeIcon(MainFrame.makePane.pane, MainFrame.specialComponent.arrayLabel[i].label, MainFrame.specialComponent.arrayLabel[i].x, MainFrame.specialComponent.arrayLabel[i].y, 40, 32, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/box2.png");
					}
					else{
						if(MainFrame.specialComponent.arrayLabel[i].color == 3){
							MainFrame.tkf.makeIcon(MainFrame.makePane.pane, MainFrame.specialComponent.arrayLabel[i].label, MainFrame.specialComponent.arrayLabel[i].x, MainFrame.specialComponent.arrayLabel[i].y, 40, 32, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/box3.png");
						} 
						else{
							if(MainFrame.specialComponent.arrayLabel[i].color == 4)
							{
								MainFrame.tkf.makeIcon(MainFrame.makePane.pane, MainFrame.specialComponent.arrayLabel[i].label, MainFrame.specialComponent.arrayLabel[i].x, MainFrame.specialComponent.arrayLabel[i].y, 40, 32, "/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/box4.png");
							}
						}
					}
				}
				MainFrame.makePane.pane.moveToFront(MainFrame.specialComponent.arrayLabel[i].label);
				break;
			}
			i++;
		} while(true);
		timer.start();
	}

	public void update(){
		try{
			for(int i = 0; i < 50; i++){
				if(MainFrame.specialComponent.arrayLabel[i].flag == 1){
					MainFrame.specialComponent.arrayLabel[i].x++;
					MainFrame.specialComponent.arrayLabel[i].label.setBounds(MainFrame.specialComponent.arrayLabel[i].x, MainFrame.specialComponent.arrayLabel[i].y, 40, 32);
				} 
				else{
					if(MainFrame.specialComponent.arrayLabel[i].flag == 2){
						MainFrame.specialComponent.arrayLabel[i].x--;
						MainFrame.specialComponent.arrayLabel[i].label.setBounds(MainFrame.specialComponent.arrayLabel[i].x, MainFrame.specialComponent.arrayLabel[i].y, 40, 32);
					} 
					else{
						if(MainFrame.specialComponent.arrayLabel[i].flag == 3){
							MainFrame.specialComponent.arrayLabel[i].y--;
							MainFrame.specialComponent.arrayLabel[i].label.setBounds(MainFrame.specialComponent.arrayLabel[i].x, MainFrame.specialComponent.arrayLabel[i].y, 40, 32);
						} 
						else{
							if(MainFrame.specialComponent.arrayLabel[i].flag == 4){
								MainFrame.specialComponent.arrayLabel[i].y++;
								MainFrame.specialComponent.arrayLabel[i].label.setBounds(MainFrame.specialComponent.arrayLabel[i].x, MainFrame.specialComponent.arrayLabel[i].y, 40, 32);
							}
						}
					}
				}
			}
		}
		catch(Exception exception){
			System.out.println(exception.getMessage());
		}
	}

	public void makeScoreFrame(){
		String s = new String("");
		congrate.setText("");
		scoreText.setText("");
		scoreValue.setText("");
		wantToSay.setText("");
		
		try{
			
			s = MainFrame.tkf.readFile("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/BestScore.dat").toString();
			String s1 = MainFrame.resultComponent.scoreField.getText();
			if(s.equals("")){
				scoreText = new JLabel("HIGH SCORE", 0);
				emo1.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/winner.png"));
				emo2.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/winner.png"));
				congrate = new JLabel("CONGRATULATION YOU HAVE A TROPHY !!!", 0);
				wantToSay = new JLabel("BEST TRY !!!", 0);
				MainFrame.tkf.writeToFile(s1);
				s = s1;
			} 
			else{
				int j = Integer.parseInt(s1);
				int i = Integer.parseInt(s);
				if(j > i){
					scoreText = new JLabel("HIGH SCORE", 0);
					emo1.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/winner.png"));
					emo2.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/winner.png"));
					congrate = new JLabel("CONGRATULATION YOU HAVE A TROPHY !!!", 0);
					wantToSay = new JLabel("BEST TRY !!!", 0);
					MainFrame.tkf.writeToFile(s1);
					s = s1;
				} 
				else{
					scoreText = new JLabel("BEST SCORE", 0);
					emo1.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/fighting.png"));
					emo2.setIcon(new ImageIcon("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/fighting.png"));
					congrate = new JLabel("GAME OVER - YOU LOSE", 0);
					wantToSay = new JLabel("TRY HARD TO WIN THIS GAME !!!", 0);
				}
			}
		}
		catch(Exception exception){
			System.out.println(exception.getMessage());
		}
		
		scoreValue = new JLabel(s, 0);
		scoreFrame.setSize(450, 450);
		scoreFrame.setLocationRelativeTo(null);
		scoreFrame.getContentPane().setLayout(null);
		scoreFrame.setBackground(new Color(253, 251, 251));
		scoreFrame.add(wantToSay);
		
		wantToSay.setBounds(60, 360, 340, 40);
		wantToSay.setFont(MainFrame.fontComponent.fontBigger);
		
		scoreFrame.add(scoreText);
		
		scoreText.setBounds(110, 120, 230, 50);
		scoreText.setFont(MainFrame.fontComponent.fontBiggest);
		scoreFrame.add(congrate);
		
		congrate.setBounds(59, 40, 340, 40);
		congrate.setFont(MainFrame.fontComponent.fontNormal);
		
		scoreFrame.add(emo1);
		emo1.setBounds(20, 160, 80, 80);
		scoreFrame.add(emo2);
		emo2.setBounds(360, 160, 80, 80);
		scoreFrame.add(scoreValue);
		scoreValue.setBounds(109, 210, 230, 70);
		scoreValue.setFont(MainFrame.fontComponent.fontBiggest);
		scoreFrame.setVisible(true);
	}
}