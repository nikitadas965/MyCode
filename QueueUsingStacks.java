package Important;


import java.util.Queue;
import java.util.Stack;

// implement FIFO  using stacks (LIFO)

/** putting all data from s1 to s2, then putting x data in s1, so x is in top
 * then all the data is copied from s2 to s1 .
 *
 *
 */
/*public class QueueUsingStacks {
	
	static class Queue{
		
		static Stack<Integer> s1 = new Stack<Integer>(); 
		static Stack<Integer> s2 =new Stack<Integer>();
		
		static void enqueue(int data)
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop()); // move all elements from s1 to s2
			}
			
			s1.push(data); // put the data in s1 when it is empty
			
			while(!s2.isEmpty()) //  moving all the data from s2 to s1
			{
				s1.push(s2.pop());
			}
		
		
		
			
	}
		// Dequeue an item from the queue
		static int dequeue()
		{
			// first check if s1 is empty
			if (s1.isEmpty())
			{
				System.out.println("Queue is empty");
				System.exit(0);
			}
			
			// getting the value in variable data  and running pop function
			 int data = s1.peek();
			 s1.pop();
			 return data;
			
		}
	};	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q = new Queue();  
	    q.enqueue(1);  
	    q.enqueue(2);  
	    q.enqueue(3);  
	  
	    System.out.println(q.dequeue());  
	    System.out.println(q.dequeue()); 
	    System.out.println(q.dequeue()); 

	}
	}*/

/***METHOD 2-> BY MAKING DEQUEUE OPERATION COSTLY****/

/*** in this we add x to s1. Then if s2 is empty we will push all the elements from s1 to s2 
 * and pop the element which is at the top ****/

public class QueueUsingStacks{
	
	static class Queue
	{
	
	static Stack<Integer> s1 ;
	static Stack<Integer> s2;
	
	public static void main(String args[]) 
    { 
        /* Create a queue with items 1 2 3*/
        Queue q = new Queue(); 
        q.s1 = new Stack<>(); 
        q.s2 = new Stack<>(); 
        enqueue(q, 1); 
        enqueue(q, 2); 
        enqueue(q, 3); 
  
        /* Dequeue items */
        System.out.print(dequeue(q) + " "); 
        System.out.print(dequeue(q) + " "); 
        System.out.println(dequeue(q) + " "); 
    } 
	
	/* function to push to stack*/
	
	static void push(Stack<Integer> top, int new_data)
	{
		top.push(new_data);
	}
	
	static int pop(Stack<Integer> top)
	{
		if(top.isEmpty())
		{
			System.out.println("Stack underflow");
			System.exit(0);
		}
		//pop data from stack
		return top.pop();
		
		}
	
	static void enqueue(Queue q,int data)
	{
		push(q.s1,data); // push data to s1..
	}
	
	static int dequeue(Queue q)
	{
		int x;
		
		/*  if both the stacks are empty , then error*/
		if(q.s1.isEmpty() && q.s2.isEmpty())
		{
			System.out.println("error");
			System.exit(0);
		}
		
		/* move elements from s1 to s2 only if s1 is not empty and s2 is empty*/
		if(q.s2.isEmpty())
		{
			while(!q.s1.isEmpty())
			{
				x = pop(q.s1); // pop out elements from s1
				push(q.s2,x);/// push to s2
			}
		}
		x = pop(q.s2); // then after all the elements are moved out of the s1 to s2, pop the element at top of s2
		return x;
	
	}
	
	
}
};

