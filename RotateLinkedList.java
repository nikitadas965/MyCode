package linkedListImplementation;

import linkedListImplementation.ReverseLinkedList.Node;

public class RotateLinkedList {
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
		RotateLinkedList llist= new RotateLinkedList();
		  for (int i = 60; i >= 10; i -= 10) // i -=10 is i=i-10
	            llist.insert(i); 
	  
	        System.out.println("Given list"); 
	        llist.printList(); 
	  
	        llist.rotate(4); 
	  
	        System.out.println("Rotated Linked List"); 
	        llist.printList(); 
	}
	
	public void rotate(int k)
	{
		if(k==0)
			return;
		Node current = head;
		int count=1;
		while(count<k && current!=null)
		{
			current=current.next;
			count++; // count bcz it needs to stop in kth node.
		}
		if(current==null) // if k is greater than the length of the linked list
			return;
		Node kthnode=current;
		
		while(current.next!=null)
		{
			current=current.next;
		}
		
		current.next=head; // last node to first node
		head=kthnode.next; // kthnode s next node to head
		kthnode.next=null; // kthnode s next as null
		
		
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
	
	
	
	/*********EXPLAINED CODE ********/
	
	// This function rotates a linked list counter-clockwise 
    // and updates the head. The function assumes that k is 
    // smaller than size of linked list. It doesn't modify 
    // the list if k is greater than or equal to size 
   /*** void rotate(int k) 
    { 
        if (k == 0) return; 
  
        // Let us understand the below code for example k = 4 
        // and list = 10->20->30->40->50->60. 
        Node current  = head; 
  
        // current will either point to kth or NULL after this 
        // loop. current will point to node 40 in the above example 
        int count = 1; 
        while (count < k && current !=  null) 
        { 
            current = current.next; 
            count++; 
        } 
  
        // If current is NULL, k is greater than or equal to count 
        // of nodes in linked list. Don't change the list in this case 
        if (current == null) 
            return; 
  
        // current points to kth node. Store it in a variable. 
        // kthNode points to node 40 in the above example 
        Node kthNode = current; 
  
        // current will point to last node after this loop 
        // current will point to node 60 in the above example 
        while (current.next != null) 
            current = current.next; 
  
        // Change next of last node to previous head 
        // Next of 60 is now changed to node 10 
  
        current.next = head; 
  
        // Change head to (k+1)th node 
        // head is now changed to node 50 
        head = kthNode.next; 
  
        // change next of kth node to null 
        kthNode.next = null; 
  
    } 
	
	*/
	
	

}
