package DEMO4;

public class Computer {
	public void openComputer(){
		System.out.println("open computer");	
	}
	
	public void closeComputer(){
		System.out.println("close computer");	
	}
	
	public void useUSB(USB usb){
		usb.open();
		usb.close();
	}

}
