package loops;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {

	//	int value = 0;
	/*********while loop*****/	
		/*while (value<5)
		{
			System.out.println("till loop exits1" + value);
			value = value +1;
		}*/

	/*****for loop ****/
	/*	for(int i=0; i<5;i++)
		{
			System.out.println("till loop exits2" + value);
			System.out.printf("value of i is + %d" , i);
		}
		*/
/*********do while******/
	/*	int val=0;
		do {
			Scanner sc= new Scanner(System.in); //declare
			System.out.println("number??"+val); //prompt
			val= sc.nextInt(); //getting input value from user
			
			
		}
		while(val !=5); // checking condition
		System.out.println("end" +val); //executing 
	}
	
	// it will check the condition, if true, it will execute odrwise it will enter do 
*/
		/************switch*************/
		
		Scanner sc=  new Scanner(System.in);
		System.out.println("enter a command");
		String text = sc.nextLine();
		
		switch(text) {
		case"start" :
			System.out.println("H");
			break;
		case"stop" :
			System.out.println("I");
			break;
		default:
			System.out.println("end");
		}
		
		//switch s input is mostly string or int. if you dont add break , all the sysout will execute
		
}
}
