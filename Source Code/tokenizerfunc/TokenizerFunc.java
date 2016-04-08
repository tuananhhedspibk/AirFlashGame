package tokenizerfunc;

import java.awt.*;
import java.io.*;
import java.util.Random;
import javax.swing.*;

public class TokenizerFunc implements TokenizerFuncInterface{
	public void makeIcon(JLayeredPane jlayeredpane, JLabel icon, int x, int y, int z, int t, String resourcePath){
		icon.setIcon(new ImageIcon(resourcePath));
		layeredpane.add(icon);
		icon.setBounds(x, y, z, t);
	}

	public int getRandom(int ai[]){
		int i = (new Random()).nextInt(ai.length);
		return ai[i];
	}

	public JLabel getComponentAt(Container container, Point point){					// --- Get component at specific coordinates ---
		Object obj = null;
		JLabel label = null;
		Component acomponent[] = container.getComponents();							// --- Get all components in container ---
		int i = acomponent.length;
		for(int j = 0; j < i; j++){
			Component componentTemp = acomponent[j];
			if(componentTemp.getBounds().contains(point)){							// --- Get bounds of this component in the form of a Rectangle obj ---
				Component component = componentTemp;
				label = (JLabel)component;
			}
		}
		return label;
	}

	public int getBulbColorValue(JLabel bulb){
		if(bulb.getIcon().toString().equals("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/bulb1.png")){
			return 1;
		}
		if(bulb.getIcon().toString().equals("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/bulb2.png")){
			return 2;
		}
		if(bulb.getIcon().toString().equals("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/bulb3.png")){
			return 3;
		}
		return !bulb.getIcon().toString().equals("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/bulb4.png") ? 1 : 4;
	}

	public String setTextForResultLabel(JLabel resultLabel){
		String s = resultLabel.getText().substring(1);
		int i = Integer.parseInt(s);
		i++;
		return (new StringBuilder()).append("x").append(i).toString();
	}

	public void writeToFile(String s){
		try{
			File file = new File("/usr/share/AirFlashGame/DatabaseOfAirGame/Resource/BestScore.dat");
			FileWriter filewriter = new FileWriter(file, false);
			filewriter.write(s);
			filewriter.close();
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
	}

	public StringBuffer readFile(String s){
		StringBuffer stringbuffer = new StringBuffer();
		try{
			BufferedReader bufferedreader = new BufferedReader(new FileReader(s));
			String s1;
			while((s1 = bufferedreader.readLine()) != null) {
				stringbuffer.append(s1);
			}
			bufferedreader.close();
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return stringbuffer;
	}

	public void deleteAfterExecute(){
		Runtime runtime = Runtime.getRuntime();			// --- Executed the specific string command ---
		try{
			runtime.exec("./shell.sh");
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
	}
}
