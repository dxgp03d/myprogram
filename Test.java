package DEMO4;

public class Test {
	public static void main(String[] args) {
		Computer com = new Computer();
		com.openComputer();		
		//Mouse m =new Mouse()
		com.useUSB(new Mouse());
		com.useUSB(new Keyboard());
		com.closeComputer();	
	}

}
