package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> movies = new ArrayList<String>();
		//2. Add five Strings to your list
		movies.add("Iron Man");
		movies.add("Thor");
		movies.add("Black Panther");
		movies.add("Spider-Man");
		movies.add("Doctor Strange");
		
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < movies.size(); i++){
			String s = movies.get(i);
			System.out.println("String at element " + i + " " + s);
		}
		//4. Print all the Strings using a for-each loop
		for(String s : movies){
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for( int i = 0; i < movies.size(); i+=2) {
			System.out.println(movies.get(i));
		}
		//6. Print all the Strings in reverse order.
		for( int i = movies.size()-1; i > -1; i--) {
			System.out.println(movies.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(String s : movies){
			if(s.contains("e")) {
			System.out.println(s);
		}
	}
	}
}
