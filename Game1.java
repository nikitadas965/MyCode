import java.util.Scanner;

public class Game1 {
/*Your program must compute the value of a linear function at the given points.

A linear function is of the form f(x) = a * x + b, with a and b, two constant values. You are given the values a, b and a set of N values of x. You must compute the value of f(x) for each of the N values of x.

INPUT:
Line 1 : two space-separated integers a and b
Line 2 : an integer N
N next lines : an integer x on each line

OUTPUT:
N lines : the value of f(x) for each x value given as input

CONSTRAINTS:
-100 < a, b < 100
-100 < x < 100

EXAMPLE:
Input
5 -2
3
3
8
-1
Output
13
38
-7
 **/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
		  System.out.println("give a");
	        int a = in.nextInt();
	        System.out.println("give b");
	        int b = in.nextInt();
	        System.out.println("give n");
	        int n = in.nextInt();
	        int result=0;
	        for (int i = 0; i < n; i++) {
	        	System.out.println("give x");
	            int x = in.nextInt();
	            
	             result = (a*x)+b;
	             System.out.println("the result is :" +result);
	           
	        }
System.out.println(result);
	        // Write an action using System.out.println()
	        // To debug: System.err.println("Debug messages...");
	       
	       
	    }
	}


