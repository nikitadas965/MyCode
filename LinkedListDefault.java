package linkedListImplementation;


/*****creation of a linked list ***/
public class LinkedListDefault {
	
	Node head;
	
	/***node of linked list***/
	class Node
	{
		int data;
		Node next; // by default initialized as null
		
		/****constructor to create a new node **/
		Node(int d)
		{
			data=d;
			//next=null;
		}
		
	}

}
