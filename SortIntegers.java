import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		/*	ArrayList<Integer> arr = new ArrayList<>();
		while(sc.hasNext())
		{
			int inputs = sc.nextInt();
			arr.add(inputs);
		}
		int count=0;

		int l=0; int r=arr.size();
		while(l<r)
		{
			if(arr.get(l)%2!=0 && l<r)
			{
				l++;
				count++;
			}

			if(arr.get(r)%2==0 && l<r)
			{
				r--;
			}

			//swap

			if(l<r)
			{
				Collections.swap(arr, arr.get(l), arr.get(r));

			}
		}

		Collections.sort(arr);
		System.out.println(arr);
	}
		 */
		
		Integer arr[] = {13, 5, 1, 20}; 
		 twoWaySort(arr, arr.length); 
         
	        System.out.println(Arrays.toString(arr)); 



	}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	public static void twoWaySort(Integer[] arr, int n) {
		// TODO Auto-generated method stub
		
		int l = 0, r = n-1; 
	       
        // Count of odd numbers 
        int k = 0; 
       
        while (l < r) 
        { 
            // Find first odd number from left side. 
            while (arr[l]%2 != 0) 
            { 
                l++; 
                k++; 
            } 
       
            // Find first even number from right side. 
            while (arr[r]%2 == 0  && l<r) 
                r--; 
       
            // Swap odd number present on left and even 
            // number right. 
            if (l < r) 
            { 
                //  swap arr[l] arr[r] 
                int temp = arr[l]; 
                arr[l] = arr[r]; 
                arr[r] = temp; 
                  
            } 
		}
		
        Arrays.sort(arr, 0, k); 
        
        // Sort even number in ascending order 
        Arrays.sort(arr, k, n,Collections.reverseOrder()); 
		
		
		
		
		
		
		
	}

}