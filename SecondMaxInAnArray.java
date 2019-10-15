import java.util.Arrays;
import java.util.Scanner;

public class SecondMaxInAnArray {
	// second max int in array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int arr[] = {-2,-1,0,1,2};
		
		
		int second=0;
		int first=-2;
		 first=second=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second && arr[i]!=first)
			{
				second = arr[i];
			}
		}
		System.out.println(second);
		System.out.println(first);
		*/
		
		String s = "Lorem Ipsum Dice Deus Flavius" ;  // kb.nextLine(); // Read the whole line instead of word by word
	    System.out.println("Original line is  : ");
	    System.out.println(s);
	    String[] words = s.split("\\s+"); // Split on any whitespace

	    if (words.length > 1) { 
	                     
	    	// Swap first and last words  	
	     //   s = words[words.length-1] + " " +  s.substring(s.indexOf(words[1], words[0].length() -2 )) + " " + words[0].toLowerCase();
	        s=words[words.length-1]+" "+words[words.length-2]+" "+ words[1]+" "+words[0];

	      //  s = s.substring(0, 1).toUpperCase() + s.substring(1); // 

	    }

	    System.out.println("\n\n\nModified line is :");
	    System.out.println(s);
	
		
		
		

	}

}
