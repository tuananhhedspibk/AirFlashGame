package gui.specialcomponent;

public class SpecialComponent{

	public SpecialLabel arrayLabel[];

	public SpecialComponent(){
		arrayLabel = new SpecialLabel[50];
		for(int i = 0; i < arrayLabel.length; i++){
			arrayLabel[i] = new SpecialLabel();
		}
	}
}