import java.util.Scanner;

/**LOGIC is that first convert the str to char array then create a new char array. Then traverse the 
 * str from both ends. If it is special character, move forwd if not swap the two alphabets*/
public class ReversalStringWithoutMovingSpChar {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		char[] charArray = str.toCharArray(); 

		System.out.println("Input string: " + str); 
		reverse(charArray); 
		String revStr = new String(charArray); 

		System.out.println("Output string: " + revStr);
	}

	public static void reverse(char[] strchararr)
	{
		int r = strchararr.length - 1, l = 0; 

		// Traverse string from both ends until 
		// 'l' and 'r' 
		while (l < r) 
		{ 
			// Ignore special characters 
			if (!Character.isAlphabetic(strchararr[l])) 
				l++; 
			else if(!Character.isAlphabetic(strchararr[r])) 
				r--; 

			// Both str[l] and str[r] are not spacial 
			else 
			{ 
				char tmp = strchararr[l]; 
				strchararr[l] = strchararr[r]; 
				strchararr[r] = tmp; 
				l++; 
				r--; 
			}
		}
	}
}
