package training;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {
	
	public static void main(String[] args) {
		
		 List<Integer> linkedl= new LinkedList<Integer>();
		
		List<Integer>numbers = new ArrayList<Integer>(20);
		numbers.add(5);
		numbers.add(45);
		numbers.add(13);
		numbers.add(78);
		numbers.add(13);
		 System.out.println(numbers.get(2));
		 System.out.println("interation #1 /ln");
		List<String> animal= new ArrayList<String>(); 
		animal.add("fox");
		//animal.
		 for(int i=0; i<numbers.size(); i++){
			 System.out.println(numbers.get(i));
		 }
		 for(Integer values:numbers){
			 System.out.println(values);
		 }
			 
			
		
		
	}

}
