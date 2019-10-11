package DEMO14;

public class Chef extends Employee implements VIP{
	
	public Chef(){}
	
	public Chef(String name, String id){
         super(name,id);
		
	}
	
	public void work(){
		System.out.println("the Chef is doing the cooking");
	}
	
	public void services(){
		System.out.println("the Chef is adding the dishes");
	}

}
