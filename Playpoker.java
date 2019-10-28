package TEST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Playpoker {
	public static void main(String[] args) {
		HashMap<Integer, String> poker = new HashMap<Integer, String>();

		ArrayList<Integer> pokernumber = new ArrayList<Integer>();

		String[] numbers = { "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3" };

		String[] colors = { "♠", "♥", "♣", "♦" };

		int index = 2;
		for (String number : numbers) {
			for (String color : colors) {
				poker.put(index, color + number);
				pokernumber.add(index);
				index++;
			}
		}
		poker.put(0, "RJoker");
		pokernumber.add(0);
		poker.put(1, "BJoker");
		pokernumber.add(1);

		Collections.shuffle(pokernumber);

		ArrayList<Integer> player1 = new ArrayList<Integer>();
		ArrayList<Integer> player2 = new ArrayList<Integer>();
		ArrayList<Integer> player3 = new ArrayList<Integer>();
		ArrayList<Integer> bottom = new ArrayList<Integer>();

		for (int i = 0; i < pokernumber.size(); i++) {
			if (i < 3) {
				bottom.add(pokernumber.get(i));
			}

			else if (i % 3 == 0) {
				player1.add(pokernumber.get(i));
			}

			else if (i % 3 == 1) {
				player2.add(pokernumber.get(i));
			}

			else if (i % 3 == 2) {
				player3.add(pokernumber.get(i));
			}
		}
		
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);	
		look("Alice",player1,poker);
		look("Bob",player2,poker);
		look("Grace",player3,poker);
		look("Bottom",bottom,poker);
		
	}
	
	 public static void look(String name, ArrayList<Integer> player, HashMap<Integer,String> poker){
		 System.out.println(name+" ");
		 for (Integer key:player){
			  String value=poker.get(key);
			  System.out.print(value+" ");			  
		 }
		 System.out.println();
	 }	
}
