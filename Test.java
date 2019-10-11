package DEMO14;

public class Test {
	 public static void main(String[] args){
		 Manger Ma=new Manger("Alice","M001",123456);
		 Ma.work();
		 
		 Waiter f1=new Waiter("Bod","W345");
		 Waiter f2=new Waiter("DED","W345");
		 
		 f1.work();
		 f1.services();
		 
		 
		 f2.work();
		 f2.services();
		 
		 Chef c1=new Chef("DSD","C345");
		 Chef c2=new Chef("ESD","C345");
		 
		 c1.work();
		 c1.services();
		 
		 
		 c2.work();
		 c2.services();
		 
		 
	 }

}
