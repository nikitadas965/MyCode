import java.util.Scanner;


public class FindMissingNumberInArray {
	public static void main(String args[]) {
		/*LOGIC : TO CONVERT STRING TO INT ARRAY
		 * 1. CONVERT STRING TO STRING ARRAY
		 * 2. RUN A LOOP AND PARSE THE STRING ARRAY TO INT ARRAY**/
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String line = in.next();
           String str[] = line.split("");
           int arr[] = new int[str.length];
           int length = arr.length;
           for(int i1=0;i1<length;i1++)
           {
        	 arr[i1]=Integer.parseInt(str[i1]);
           }
           
           int missingnum = getmissingnum(arr,arr.length);
           System.out.println();
           System.out.println(missingnum);
            
        }
	}
	/*LOGIC : TAKE THE TOTAL OF THE SUM[(N*N+1)/2], SUBTRACT ALL THE NUMBERS FROM THE TOTAL*/
	private static int getmissingnum(int[] arr, int length) {
		
		int total = ((length*(length+1))/2);
		for(int i =0;i<length;i++)
		{
			total = total-arr[i];
		}
		
		return total;
	}

	
}
