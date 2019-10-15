import java.util.Scanner;

/*Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.*/


public class EndOfFile {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); ///scanner reads the input and stores it in sc object
		int count= 1;
		 while(sc.hasNext())
		 {
			String str= sc.nextLine();
			System.out.println(count+" "+str);
			count++ ;
			
		 }
	}
	
}
