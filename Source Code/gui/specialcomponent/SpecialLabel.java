package gui.specialcomponent;

import javax.swing.JLabel;

public class SpecialLabel{
	public JLabel label = new JLabel();
	public int x;
	public int y;
	public int flag;			// --- Store direction of motion of component {0 : component has been deleted, 1 : right, 2 : left, 3 : up, 4 : down}---
	public int color;			// --- Color value  of component ---

	public SpecialLabel(){
		x = 230;				// --- Initial position ---
		y = 380;				// --- Initial position ---
		flag = 0;
		color = 0;
	}
}
