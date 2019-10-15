package linkedListImplementation;

public class MidOfLinkedList {
	
	static Node head;
	
	static class Node
	{
		Node next ; int data;
		
		Node(int data){
			this.data=data;  next = null;
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MidOfLinkedList llist = new MidOfLinkedList();
		/*
		llist.insert(2);
		llist.insert(4);
		llist.insert(6);
		llist.insert(8);
		llist.insert(10);
		
		llist.printList();

		llist.getMidNode();*/
		/*for(int i=10;i>0;--i)
		{
			llist.insert(i);
			llist.printList();
			llist.getMidNode();
		}*/
		
		   for (int i=5; i>0; i--) 
	        { 
	            llist.insert(i); 
	            llist.printList(); 
	            llist.getMidNode(); 
	        } 

	}
	
	
	/****** traverse with fastptr which takes 2 steps at a time and a slow ptr which takes 1 step at  a
	time , when fast will reach the end , slow will reach mid.. print slow.data ***/
	
	public void getMidNode()
	{
		Node fastPtr = head;
		Node slowPtr = head;
		
		if(head!=null)
		{
		
		while(fastPtr!=null && fastPtr.next!=null)
		{
			fastPtr= fastPtr.next.next;
			slowPtr=slowPtr.next;
		}
		
		System.out.println(slowPtr.data);
	}
	}

	
	public void insert(int data)
	{
       Node newNode = new Node(data);
       newNode.next=head;
       head=newNode;
		
		
	}
	
	public void printList()
	{
		Node node= head;
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
		
	}

}
