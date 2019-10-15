package linkedListImplementation;

public class ReverseLinkedList {

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
		ReverseLinkedList llist=new ReverseLinkedList();
		/*llist.head = new Node(85); 
		llist.head.next = new Node(15); 
		llist.head.next.next = new Node(4); 
		llist.head.next.next.next = new Node(20); 		
		llist.printList();
		head=llist.reverseNode(head);
		System.out.println("reversed linked list");
		llist.printList();*/
		
		/*llist.head = new Node(85); 
		llist.head.next = new Node(15); 
		llist.head.next.next = new Node(4); 
		llist.head.next.next.next = new Node(20); */
		
		
	          for(int i=5;i>0;i--)
	        	  llist.insert(i);
	        System.out.println("Given Linked list"); 
	        llist.printList(); 
	        head = llist.reverseNode();  // changing the value of head so that when it goes to printlist head is 5 
	        System.out.println(""); 
	        System.out.println("Reversed linked list "); 
	        llist.printList(); 
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
	
	/***storing the current s next value in nextnode,  changing the link of current to null, moving 1 step forward ***/
	public Node reverseNode()// Node node = head
	{
		Node node = head;
		Node current=node; 
		Node prev=null;
		Node nextnode=null;
		while(current!=null)
		{
			nextnode=current.next;
			current.next=prev;
			prev=current;
			current=nextnode;
		}
		node=prev;
		return node;
		
	
	}

}
