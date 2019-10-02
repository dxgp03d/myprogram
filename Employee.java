package DEMO2;

public abstract class Employee {


		
		private String name;
		
		private String ID;
		
		public abstract void work();
		
		
		public void setName(String name){
			this.name=name;
						
		}
		
		public void setID(String ID){
			this.ID=ID;
						
		}
		
		public String getName(){
			return name;
						
		}
		
		public String getID(){
			return ID;
						
		}
		


}
