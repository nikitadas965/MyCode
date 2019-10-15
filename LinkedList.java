package linkedListImplementation;

public class LinkedList {
	
	Node head; // head of the list
	
	static class Node // static inner class so that main() can access it
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
		
		/** creation of linked list with 3 nodes **/
		public static void main(String[] args) {
			
			LinkedList llist=new LinkedList(); // defining a linked list -> llist
			
			llist.head=new Node(1);
			Node second=new Node(2);
			Node third=new Node(3);
			
			
			//creation of 3 nodes is done
			
			llist.head.next=second;//linked first(head) node with second
			second.next=third; // linked second node with third
			third.next=null;
			
			
			System.out.println(second);
			System.out.println(third);
			
			
		}	}

	public void push(int i) {
		// TODO Auto-generated method stub
		
	}

}
