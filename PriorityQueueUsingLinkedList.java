package Important;

public class PriorityQueueUsingLinkedList {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		int priority; // lower values indicate higher priority
		
	
		
		Node(int data,int priority)
		{
			 this.data=data;
			 this.priority=priority;
			next=null;
		}
	

	
	

	public static void main(String[] args) {

		//create a priority queue
		Node node= new Node(4, 1);
		node=push(node,5,2);
		node=push(node, 6, 3);
		node=push(node, 7, 0);
		
		while(isEmpty(node)==0)
		{
			System.out.printf("%d", peek(node));
			node= pop(node);
		}
	}
	
	static int peek(Node head)
	{
		return head.data;
	}
	
	
	static Node pop(Node head)
	{
		//Node temp=head;
		head=head.next;
		return head;
	}
	
	static Node push(Node head,int data,int priority)
	{
		Node temp=head;
		Node newNode = new Node(data, priority);
		//if head s priority is lesser than the newNode s priority, node will be inserted in the beginning
		
		if(head.priority>priority)
		{
			newNode.next=head;
			head=newNode;
			
		}
		else
		{
			//traverse the list until u find a position where the priority of newNode is higher than the
			//succeeding node
			
			while(temp.next!=null && temp.next.priority<priority)
			{
			temp=temp.next;
			
			}
			// insert the newNode in the position
			newNode.next=temp.next;
			temp.next=newNode;
		}
		return head;
		
		
	}
	
	// Function to check is list is empty  
		static	int isEmpty(Node head)  
			{  
			    return ((head) == null)?1:0;  
			} 
			
	

}
}
