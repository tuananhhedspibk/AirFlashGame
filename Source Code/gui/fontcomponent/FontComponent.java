package gui.fontcomponent;

import java.awt.Font;

public class FontComponent{
	public Font fontNormal;
	public Font fontBigger;
	public Font fontBiggest;
	
	public FontComponent(){
		fontNormal = new Font("Times new Roman", 1, 14);
		fontBigger = new Font("Times new Roman", 1, 18);
		fontBiggest = new Font("Times new Roman", 1, 24);
	}
}
