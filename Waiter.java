package DEMO14;

public class Waiter extends Employee implements VIP{
	
	public Waiter(){}
	
	public Waiter(String name, String id){
         super(name,id);
		
	}
	
	public void work(){
		System.out.println("the Waiter is doing the order");
	}
	
	public void services(){
		System.out.println("the Waiter is pouring the wine");
	}

}