package DEMO1;
/*
 *  学生类:
 *    属性: 姓名,年龄
 */
public class Student {
	private String name;
	private int age;
	private String sex;
	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	public void setSex(String sex){
		this.sex = sex;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}	
	
	public String getSex(){
		return sex;
	}
}
