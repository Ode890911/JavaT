package training;

import java.util.HashMap;

public class HashMapPractice {
	
	public static HashMap<Integer, String> monthYear(){
		HashMap<Integer, String>Months = new HashMap<Integer, String>();
		
		Months.put(1, "January");
		Months.put(2, "febraury");
		Months.put(2, "march");
		Months.put(4, "April");
		Months.put(5, "May");
		
		Months.replace(4, "September");
		return Months;
		
		
	}

	public static void main(String[] args) {
	System.out.println(monthYear().get(2));

	

	}

}
