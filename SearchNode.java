package linkedListImplementation;

public class SearchNode {
	
	 static Node head;
	 
	 static class Node
	 {
		 Node next;
		 int data;
		 
		 Node(int d)
		 {
			 data=d;
			 next=null;
		 }
	 }
	
	
	 
	 public void insert(int data)
	 {
		 Node newNode= new Node(data);
		 newNode.next=head;
		 head=newNode;
	 }
	 /***iterative****/
	 public boolean search(Node head,int key)
	 {
		 Node temp=head;
		 while(temp!=null)
		 {
			 if(temp.data==key) 
		
				 return true;
				 
				 temp=temp.next;
			 			 
				
		 }
		return false;// no data is equal to key
	 }
	 
	 
	 
	 /****recursive****/
	 public boolean search1(Node head,int x)
	 {
	  if (head == null) 
          return false; 

      // If key is present in current node, 
      // return true 
      if (head.data == x) 
          return true; 

      // Recur for remaining list 
      return search(head.next, x); 
	
	 }
	public static void main(String[] args) {
		
		SearchNode llist= new SearchNode();
		llist.insert(2);
		llist.insert(4);
		llist.insert(6);
		llist.insert(8);
		
	if(	llist.search1(llist.head, 6))
	{
		System.out.println("true");
	}
	else
		System.out.println("false");
		
		
		
		
	}

}
