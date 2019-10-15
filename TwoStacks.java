package Important;

/** To implement two stacks using one array. storing data and popping out from one array*/

/** starting from 2 corners and moving towards each other. **/
public class TwoStacks {
	 int size;
	 int top1 , top2;
	 int array[];
	 
	 //Constructor
	 TwoStacks(int capacity) // capacity of the array (n)
	 {
		 array = new int[capacity];
		 size=capacity;
		 top1= -1;
		 top2=size;
		 
	 }
	 
	 void push1(int data) // pushing data in s1
	 {
		 if(top1<top2-1) // atleast 1 empty space between top 1 and top2 should be there
		 {
			 top1++; // going towards right
			 array[top1]=data;
		 }
		 else
	        { 
	            System.out.println("Stack Overflow"); 
	            System.exit(1); 
	        } 
	 }
	 
	 void push2(int data)
	 {
		 if(top1<top2-1)
		 {
			 top2--; // going towards left
			 array[top2]=data;
		 }
		 else
	        { 
	            System.out.println("Stack Overflow"); 
	            System.exit(1); 
	        } 
		 
		 
	 }
	 
	 int pop1()
	 {
		 if(top1>=0)
		 {
			 int value=array[top1]; // taking the value to be popped in the variable
			 top1--;
			 return value;
		 }
		 else
		 {
			  System.out.println("Stack Underflow"); 
	            System.exit(1); 
		 }
		 return 0;
	 }

	 int pop2()
	 {
		 if(top2<size) /// size -> total size of the array
		 {
		 int value=array[top2];
		 top2++;
		 return value;
		 }
		 else
		 {
			 System.out.println("Stack Underflow"); 
	            System.exit(1); 
		 }
		 return 0;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TwoStacks ts = new TwoStacks(5); 
	        ts.push1(5); 
	        ts.push2(10); 
	        ts.push2(15); 
	        ts.push1(11); 
	        ts.push2(7); 
	        System.out.println("Popped element from" + 
	                           " stack1 is " + ts.pop1()); 
	        ts.push2(6); 
	        System.out.println("Popped element from" + 
	                         " stack2 is " + ts.pop2()); 
	}

}
