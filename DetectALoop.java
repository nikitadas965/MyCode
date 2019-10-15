package linkedListImplementation;

import linkedListImplementation.ReverseLinkedList.Node;

public class DetectALoop {
	
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
		DetectALoop llist= new DetectALoop();

        llist.insert(20); 
        llist.insert(4); 
        llist.insert(15); 
        llist.insert(10); 
        
        llist.head.next.next.next.next= llist.head; // create a loop for testing.... 
        /*    20   ,4,15,10,20  -> 20  = 20  [created a loop]        */
        
        System.out.println(llist.detectloop());
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
	
	public void printList() // Node node=head
	{
		Node node = head;
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
	
	public boolean detectloop()
	{
		Node  fast=head; Node slow=head;
		while(slow != null && fast != null && fast.next != null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				return true;
			}
		}
		return false;
		
	}

}
