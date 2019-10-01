package DEMO1;

import java.util.ArrayList;
import java.util.Random;

public class CallName {
	public static void main(String[] args) {
		System.out.println("The people of random extraction:\n");
	
		ArrayList<Student> array = new ArrayList<Student>();
		addStudent(array);
		printStudent(array);
		randomStudent(array);
		
	}

	public static void randomStudent(ArrayList<Student> array){
		Random r = new Random();
		int index = r.nextInt(array.size());
		Student s = array.get(index);
		
		System.out.println("The person chosed by extraction:");
		System.out.println("name: "+s.getName()+" age: "+s.getAge()+" sex: "+s.getSex());
	}
	

	public static void printStudent(ArrayList<Student> array){
		for(int i = 0 ; i < array.size();i++){
			Student s = array.get(i);
			System.out.println("name: "+s.getName()+"age: "+s.getAge()+" sex: "+s.getSex());
		}
	}
	

	public static void addStudent(ArrayList<Student> array){
		Student s1 = new Student();
		s1.setName("Alice");
		s1.setAge(29);
		s1.setSex("famale");
		
		Student s2 = new Student();
		s2.setName("Boy");
		s2.setAge(30);
		s2.setSex("male");
		
		Student s3 = new Student();
		s3.setName("Hock");
		s3.setAge(23);
		s3.setSex("male");
		
		Student s4 = new Student();
		s4.setName("Jimmy");
		s4.setAge(26);
		s4.setSex("male");
		
		Student s5 = new Student();
		s5.setName("Linda");
		s5.setAge(27);
		s5.setSex("famale\n");
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		
	}
}
