package linkedListImplementation;

public class DetectAndRemoveALoop {
	
static Node head;
	
	static class Node{
		Node next;
		int data;
		
		
		Node(int data)
		{
			this.data=data;  next=null;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectAndRemoveALoop llist = new DetectAndRemoveALoop();
		llist.head = new Node(50); 
		llist.head.next = new Node(20); 
		llist.head.next.next = new Node(15); 
		llist.head.next.next.next = new Node(4); 
		llist.head.next.next.next.next = new Node(10); 
  
        // Creating a loop for testing  
        head.next.next.next.next.next = head.next.next; 
        llist.detectAndRemove(head); 
        System.out.println("Linked List after removing loop : "); 
        llist.printList(head); 
		

	}
	
	public void detectAndRemove(Node node)
	{
		if(node==null || node.next==null) // no node or only one node
			return;
		Node slow = head; Node fast= head;
		
		while(slow != null && fast != null && fast.next != null)
		{
			slow = slow.next; 
			fast=fast.next.next;
			
			if(slow==fast)
				break;
		}
		
		/*if loop exists*/
		if(slow==fast)
		{
			slow=node; // slow became head node
			while(slow.next != fast.next)
			{
				slow=slow.next;
				fast=fast.next;
			}
			fast.next=null;
		}
		
	}
	
	
	public void insert(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	public void printList(Node node) // Node node=head
	{
		
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
	}

}
