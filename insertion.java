package Sorting;

import java.util.Scanner;

public class insertion {
	
	public static void main(String[] args) {
		insertion i = new insertion();
		int arr[] = {64,25,12,22,11}; 
		i.sort(arr);
		i.printArray(arr);
		
	}

	public void printArray(int [] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
	}

	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		int length = arr.length;
		for(int i=0;i<length-1;i++)
		{
			int min_index=i;
			for(int j=i+1;j<length;j++)
			{
				if(arr[j]<arr[min_index])
				{
					min_index=j;
				}
				int temp= arr[min_index];
				arr[min_index]=arr[i];
				arr[i]=temp;;
				
			}
		}
		
	}

}
