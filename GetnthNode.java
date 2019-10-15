package linkedListImplementation;



public class GetnthNode {

	static Node head;
	
	static class Node
	{
		int data; Node next;
		
		Node(int data)
		{
			this.data=data; next = null;
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetnthNode llist = new GetnthNode();
		llist.insertNode(2);
		llist.insertNode(3);
		llist.insertNode(4);
		llist.insertNode(5);
		llist.insertNode(6);
		
		llist.printList();
		  System.out.println("Element at index 3 is "+llist.GetNth(3)); 

	}
	
	public void printList()
	{
		Node node= head;
		while(node!=null)
		{
			
			System.out.print(node.data+" ");
			node = node.next;
		}
		

		
		
	}


	public int GetNth(int index) {
		// TODO Auto-generated method stub
		int count = 0;
		Node temp = head;
		while (temp!=null)
		{
			if(count==index)
			
				return temp.data;
				count++;
				temp=temp.next;
			
		}
		
		if(count==0)
			System.out.println("empty list");
			
		return 0;
	}
	
	public void insertNode(int data)
	{
		
		Node newNode= new Node(data);
		newNode.next=head;
		head=newNode;
		
		
	}

}
