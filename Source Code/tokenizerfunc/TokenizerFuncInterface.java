package tokenizerfunc;

import java.awt.Container;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public interface TokenizerFuncInterface{
	public void makeIcon(JLayeredPane layeredpane, JLabel label, int x, int y, int k, int l, String s);
	public int getRandom(int ai[]);
	public JLabel getComponentAt(Container container, Point point);
	public int getBulbColorValue(JLabel bulb);
	public String setTextForResultLabel(JLabel resultlabel);
	public void writeToFile(String s);
	public StringBuffer readFile(String s);
	public void deleteAfterExecute();
}
