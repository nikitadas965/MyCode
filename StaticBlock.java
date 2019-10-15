import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
public class StaticBlock {
	

	    public static int B=0;
	    public static int H=0;
	    public static boolean flag = true;
	    static{
	        
	    Scanner sc = new Scanner(System.in);
	    B = sc.nextInt();
	    H = sc.nextInt();
	    
	        if(B<0 || H<0){
	            System.out.print("java.lang.Exception: Breadth and height must be positive");
	            flag = false;
	        }
	    }

	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}//end of main

	}//end of class



/*Static block runs before the main method. It is called when the class gets loaded.*/
