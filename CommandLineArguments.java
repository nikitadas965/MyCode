package misc;

import java.util.Scanner;

public class CommandLineArguments {
	
	Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		
	

		if(args.length>0)
		{
			System.out.println("command line arguments are : ");
		
		for(String val:args)
		{
			System.out.println(val);
		}
		}
		else
		{
			System.out.println("no commands found");
		}
		
		
	}

}
