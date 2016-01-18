package auxiliary;

public class Auxiliary{
	public int count[];
	public int arrayFlag[] = {
		1, 3
	};
	public int arrayColor[] = {
		1, 2, 3, 4
	};
	public int flag;
	public int delay;
	public int flagTimer;

	public Auxiliary(){
		count = new int[10];
		flag = 0;
		delay = 3;
		flagTimer = 1;
	}
}
