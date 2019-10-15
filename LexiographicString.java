import java.util.Scanner;

public class LexiographicString {
	 public static String getSmallestAndLargest(String s, int k) {

	        if(s==" ")
	        {
	            System.out.println("error");
	        }

	        String curr=s.substring(0,k);

	        String smallest = curr;
	        String largest = curr;
	        
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'



	        for(int i=k;i<s.length();i++)
	        {

	            curr=curr.substring(1,k)+s.charAt(i);
	            if(largest.compareTo(curr)<0)
	            {
	                largest=curr;
	            }
	            if(smallest.compareTo(curr)>0)
	            {
	                smallest=curr;
	            }

	        }

	       
	        
	        
	        return smallest + "\n" + largest;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
	}

}
