package training;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	      System.out.println("Enter last name string to swap");

		String a = in.nextLine();
	      System.out.println("Last name string to swap is : " + a);

	      System.out.println("Enter first name string to swap" );

		String b= in.nextLine();
	      System.out.println(" first name string to swap is : " + b);


		String c=a+b;//kouame/ode
		System.out.println("Name is : " + c);
		
		a = c.substring(a.length(),c.length());//
		
		System.out.println("Last Name after swap is : " + a  );//first name or b/ode
		
		b= c.substring(0, (c.length()-a.length()));//kouameode-ode=kouame
	
		System.out.println("First Name after swap is : " + b  );

	    


	}

}
