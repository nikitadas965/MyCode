package linkedListImplementation;

/**********Deletion using a key*********/
public class DeleteNode {
	
	
	 static Node head;
	 
	 static class Node{
		 Node next;
		 int data;
		 
		 Node(int d)
		 {
			 data=d;
			 next=null;
		 }
		 
		 public static void main(String[] args) {
			 
			 DeleteNode llist= new DeleteNode();
			 
			 llist.insert(2);
			 llist.insert(4);
			 llist.insert(6);
			 llist.insert(8);
			 llist.insert(9);
			 
			 System.out.println("list is :");
			 llist.printList();
			 
			 llist.delete(6);
			 
			 System.out.println("list is :");
			 llist.printList();
			 
			 
			 
			 
			
		}
		 
		 
	 }

	public void insert(int newData) {
		// TODO Auto-generated method stub
		
		Node newNode = new Node(newData);
		newNode.next=head;
		head=newNode;
		
		
	}

	public void delete(int key) {
		// TODO Auto-generated method stub
		Node temp  = head; // head s value in temp , points the frst node
		Node prev = null;
		
		if(temp.next!=null && temp.data == key) // first node
		{
			head=temp.next;  // breaking the link and joining it from another node
			return;
		}
		
		while(temp.next != null && temp.data != key)
		{
			prev = temp;
			temp = temp.next;
			
		}
		if(temp == null) // if the key is not present in the list
		
			return;
				
		prev.next = temp.next;
		
		
		
	}

	public void printList() {
		// TODO Auto-generated method stub
		Node node = head;
		while(node  != null)
		{
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	

}
