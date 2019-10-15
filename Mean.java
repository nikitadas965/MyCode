package UserInput;

import java.util.Scanner;

public class Mean {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int sum=0 ,count=0;
		
		//checking whether int value is available
		 while(sc.hasNextInt())
		 {
			 int num = sc.nextInt();
			sum = sum+num;
			System.out.println(sum);
			count++;
			System.out.println(count);
			
			
		 }
		 int mean = sum/count;
		 System.out.println("mean is : " + mean);
		 
		 sc.close();
		
		
	}

}
