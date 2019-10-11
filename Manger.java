package DEMO14;

public class Manger extends Employee {
	
    private double money;
    
    public Manger(){}
    
    public Manger(String name,String id, double money){
    	super(name,id);
    	this.money=money;
    }
    
	
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void work(){
		System.out.println("the Manager is doing the management");
	}
	

}