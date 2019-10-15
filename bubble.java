package Sorting;

public class bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 bubble b = new bubble();
		 int arr[]= {1,2,3,4,5};
		 b.sort(arr);
		 b.print(arr);
	

	}

	private void print(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
