import gamescreen.GameScreen;
import javax.swing.SwingUtilities;

public class Main{
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable() {				// --- This function use to execute AWT event in separate process ---
			public void run(){
				GameScreen gamescreen = new GameScreen();
			}
		});
	}
}