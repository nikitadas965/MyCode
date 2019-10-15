import java.io.*;
	import java.util.*;
public class StringInputs {

	
	

	

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();

	      
	        System.out.println(A.length()+B.length());

	     System.out.println(A.compareTo(B)>0?"Yes":"No");
	        
	      
	        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1, B.length())); 

	       
	       /*compareTo compares 2 strings lexicographically(i.e length of the string. it converts the string s characters into unicode and then it compares.
	        * Better than comparing 2 strings using .length() since ASCII values for a capital letter and small letter is different. */
	        
	        /*s.substring(startIndex,endIndex) ==  inclusive strtn index and exclusive end index.
	         */
	      


	        
	        
	    }
	}





