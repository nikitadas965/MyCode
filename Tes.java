package UserInput;

import java.util.Scanner;

public class Tes {
	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
   int count=sc.nextInt();
  // int count=0;
   
   while(count!= 0)
   {
	   int N = sc.nextInt();
	   
         if (N%3==0&&N%5!=0) {
             System.out.println("Fork");
         }
         else if(N%5==0 && N%3!=0)
             {
                  System.out.println("Java");
                  
                  
             }
           
         
        
         else if(N%3==0&&N%5==0)
         {
              System.out.println("Fork Java");
         }
         else
         {
               System.out.println(" ");
         }
         count--;
     }
     
	}
	
}
