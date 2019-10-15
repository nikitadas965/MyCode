package UserInput;

import java.util.Scanner;

public class Scaner {

	public static void main(String[] args) {



		// Scanner Class //

		Scanner input = new Scanner(System.in);
		// Scanner obj created
		
		int num = input.nextInt();
		
		// reading user values
		
		while ( num-- > 0)
		{
			
			int a; 
			float b;
			double c;
			String s;
			
			 a= input.nextInt();
			 b=input.nextFloat();
			 c=input.nextDouble();
			 s=input.nextLine();
			 
			 
			 System.out.println(a);
			 
			 System.out.println(b);
			 
			 System.out.println(c);
			 
			 System.out.println(s);
			 
			 
		}
			
		
		
		 
		 
		
	

		


	


	}

}

