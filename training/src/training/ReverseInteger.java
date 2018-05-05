package training;

public class ReverseInteger {
	
	public static void main(String[] args) {
		/*int num = 1972;
		//initialize the reverse integer to 0
		int rev =0;
		//check if the number is #0 
		while(num!=0){//1972/197/19/1
			rev= rev*10+num%10;//0+1972/10=2 rev= 2 /2*10=20+7 rev=27/ 27*10=270+9 rev= 279/279*10 +1
			num = num/10;//197/19/1
			System.out.println(rev);
		}
		//System.out.println(rev);
*/		//System.out.println(new StringBuffer(String.valueOf(num)).reverse());
		
				
		
				
		
		int distance= 124692;
		
	/*	while(distance!=0){
			revd= revd*10 +distance%10;
			distance= distance/10;
		System.out.println(revd);
			
			
		}*/
		
		//by using stringbuffer and valueOf(integer)
		
		String dist= String.valueOf(distance);
	StringBuffer sb=	new StringBuffer(dist);
		System.out.println(sb.reverse());
	}

	
}
