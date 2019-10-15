package linkedListImplementation;

public class Deletion {

	static Node head;
	Insertion insert = new Insertion();

	static class Node
	{
		int data;
		Node next;

		Node(int d)
		{
			data=d;
			next=null;
		}


		/* Drier program to test above functions. Ideally this function 
	    should be in a separate user class. It is kept here to keep 
	    code compact */
		public static void main(String[] args) 
		{ 
			Deletion llist = new Deletion(); 

			llist.push(7); 
			llist.push(1); 
			llist.push(3); 
			llist.push(2); 

			System.out.println("\nCreated Linked list is:"); 
			llist.printList(); 

			llist.deleteNode(1); // Delete node at position 4 

			System.out.println("\nLinked List after Deletion at position 4:"); 
			llist.printList(); 
		} 

	}
	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		// TODO Auto-generated method stub
		Node new_node = new Node(new_data); 
		new_node.next = head; 
		head = new_node; 
	}
	/* Given a key, deletes the first occurrence of key in linked list */

	public void deleteNode(int key) {
		// TODO Auto-generated method stub
		// Store head node 
		Node temp = head, prev = null; 

		// If head node itself holds the key to be deleted 
		if (temp != null && temp.data == key) 
		{ 
			head = temp.next; // Changed head 
			return; 
		} 

		// Search for the key to be deleted, keep track of the 
		// previous node as we need to change temp.next 
		while (temp != null && temp.data != key) 
		{ 
			prev = temp; 
			temp = temp.next; 
		}     

		// If key was not present in linked list 
		if (temp == null) return; 

		// Unlink the node from linked list 
		prev.next = temp.next; 
	}


	/* This function prints contents of linked list starting from 
        the given node */
	public void printList() {
		// TODO Auto-generated method stub
		Node tnode = head; 
		while (tnode != null) 
		{ 
			System.out.print(tnode.data+" "); 
			tnode = tnode.next; 
		} 
	} 

}
