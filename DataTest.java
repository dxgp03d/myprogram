package DEMO16;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class DataTest {
	
	public static void main(String[] args) throws Exception {
		function();
	}
	
   public static void function() throws Exception{
	   
	   System.out.println("Please input your birthday date (Format:yyyy-mm-dd)");
	   
	   String birthdayString=new Scanner(System.in).next();
	   
	   SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
	   
	   Date birthdayDate=sdf.parse(birthdayString);
	   
	   Date todayDate=new Date();
	   
	   long birthdaySecond=birthdayDate.getTime();
	   long todaySecond=todayDate.getTime();
	   long second=todaySecond-birthdaySecond;
	   
	   if(second<0){
		   System.out.println("You are not born yet");
	   }
	   	   
	   System.out.println(second/1000/60/60/24/365);
	  }   



}
