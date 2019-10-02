package DEMO2;

public class Test {

	public static void main(String[] args) {
		JavaEE ee=new JavaEE();
		Network net=new Network();

		
		ee.setName("Gey");
		ee.setID("Develop001");
		
		net.setName("Alice");
		net.setID("Network001");
		
		//System.out.println(ee.getName()+ee.getID());
		//System.out.println(net.getName()+net.getID());
				

		
		ee.work();
		net.work();

	}

}
