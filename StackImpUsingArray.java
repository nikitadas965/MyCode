package Stacks;

public class StackImpUsingArray {
	
	static final int MAX = 1000;
	int top;
	int A[] = new int[MAX]; // an array of max size of stack

	StackImpUsingArray()
	{
		top=-1;
	}
	
	boolean isEmpty()
	{
		return (top<0);
			
	}
boolean push(int data)
{
	if(top>= (MAX-1)) // topmost position
	{
		System.out.println("stack overflow");
		return false;
	}
	else {
		A[++top]=data; // pre increment then assignment
		System.out.println(data+ "pushed data");
	return true;
	}
		
}

int pop()
{
	if(top<0)
	{
		System.out.print("stack underflow");
		return 0;
	}
	else {
		int data = A[top--] ; // top decreasing by 1 and then returning the remaining data in array
		return data;
	}
}
	
	

	public static void main(String[] args) {
		StackImpUsingArray s= new StackImpUsingArray();
		
	        s.push(10); 
	        s.push(20); 
	        s.push(30); 
	        System.out.println(s.pop() + " Popped from stack"); 

	}

}
