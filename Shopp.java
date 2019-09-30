import java.util.ArrayList;
import java.util.Scanner;

public class Shopp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<FruitItem> array = new ArrayList<FruitItem>();
		init(array);
		//System.out.println(array);
		

		while (true) {
			mainMenu();
			int choose = ChooseFunction();

			switch (choose) {
			case 1:
				showFruitList(array);

				break;

			case 2:
				
				addFruitItem(array);

				break;

			case 3:
				
				deleteFruitItem(array);

				break;

			case 4:
				
				updateFruitItem(array);

				break;

			default:
				System.out.println("Please input the correct number again");
				break;

			}

		}

	}

	public static void showFruitList(ArrayList<FruitItem> array){
		System.out.println();
		System.out.println("============Goods List===========");
		System.out.println("Goods id   Goods name     Goods price");
		
		for(int i=0;i<array.size();i++){
			FruitItem item= array.get(i);
			System.out.println(item.ID+"       "+item.name+"         "+item.price);		
						
		}
				
	}
	
	public static void addFruitItem (ArrayList<FruitItem> array){
		System.out.println("chosed the function of adding goods");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("input the id of the goods");
		int ID=sc.nextInt();
		
		System.out.println("input the name of the goods");
		String name=sc.next();
		
		System.out.println("input the price of the goods");
		double price=sc.nextDouble();
		
		FruitItem item=new FruitItem();
		item.ID=ID;
		item.name=name;
		item.price=price;
		array.add(item);	
	}
	
	public static void deleteFruitItem (ArrayList<FruitItem> array){
		System.out.println("chosed the function of deleting goods");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("input the id of the goods");
		int ID=sc.nextInt();
		
		for(int i=0;i<array.size();i++){
			FruitItem item= array.get(i);
			if(item.ID==ID){
				array.remove(i);
				System.out.println("deleted succussfully");
				return;
				
			}				
		}
		System.out.println("the id you input does not exist");		
	}
	
	public static void updateFruitItem (ArrayList<FruitItem> array){
		System.out.println("chosed the function of updating goods");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("input the id of the goods");
		int ID=sc.nextInt();
		
		for(int i=0;i<array.size();i++){
			FruitItem item= array.get(i);
			if(item.ID==ID){
				System.out.println("input new id ");
				item.ID=sc.nextInt();
				
				System.out.println("input new name");
				item.name=sc.next();
				
				System.out.println("input new price");
				item.price=sc.nextDouble();
				System.out.println("updated succussfully");
				return;
				
			}				
		}
		System.out.println("the id you input does not exist");		
	}
	

	public static void mainMenu() {
		System.out.println("=========Welcome to the IT Supermarket=========");
		System.out.println("1:Main menu  2:Add goods  3:Delete goods  4:Update goods");
		System.out.println("Please input the process number you want");
	}

	private static int ChooseFunction() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();

	}

	public static void init(ArrayList<FruitItem> array) {

		FruitItem f1 = new FruitItem();
		f1.ID = 9527;
		f1.name = "noodle";
		f1.price = 12.7;

		FruitItem f2 = new FruitItem();
		f2.ID = 9528;
		f2.name = "tissue";
		f2.price = 15.0;

		FruitItem f3 = new FruitItem();
		f3.ID = 9529;
		f3.name = "table";
		f3.price = 18.0;

		array.add(f1);
		array.add(f2);
		array.add(f3);

	}

}
