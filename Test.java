package UserInput;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  N=sc.nextInt();
	
		while(sc.hasNext())
		{
			
		
		switch(N)
		{
		case 1:
			if(N%3==0 && N%5!=0)
			{
				System.out.println("Fork");
				continue;
			}
			
		case 2:
			if(N%5==0 && N%3!=0)
			{
				System.out.println("Java");
				continue;
			}
		case 3:
			if(N%3==0 && N%5==0)
			{
				System.out.println("Fork Java");
				continue;
			}
			default:
				System.out.println(" ");
				break;
			
		}
		}
		
}
}


