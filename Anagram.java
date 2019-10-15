import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

	static boolean areAnagram(String a, String b)  
	{
		
	    /*// If two strings have different length  
	    if (str1.length() != str2.length())  
	    {  
	        return false;  
	    }  
	  
	    // To store the xor value  
	    int value = 0;  
	  
	    for (int i = 0; i < str1.length(); i++)  
	    {  
	        value = value ^ (int) str1.charAt(i);  
	        value = value ^ (int) str2.charAt(i);  
	    }  
	  
	    return value == 0;  
	  */
		
		
		a=a.replace(" ","").toLowerCase();
        b=b.replace(" ","").toLowerCase();

       
        char arr[]=a.toCharArray();
        char brr[]=b.toCharArray();

        Arrays.sort(arr);
 Arrays.sort(brr);
 

        if(Arrays.equals(arr,brr))
        {
            return true;
        }
        else
        return false;
        
      
		
	}  
	  
	// Driver code  
	public static void main(String[] args)  
	{ 
	    String a = "geeksforgeeks";  
	    String b = "forgeeksgeeks";  
	    if (areAnagram(a, b))  
	        System.out.println("The two strings are anagram of each other");  
	    else
	        System.out.println("The two strings are not anagram of each other");  
	  
	} 
	} 

