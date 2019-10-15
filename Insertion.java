package linkedListImplementation;

/***insert in beginning,middle and end ***/
public class Insertion {

	Node head;

	static class Node
	{
		int data;
		Node next;

		Node (int d)
		{
			data=d;
			next=null;
		}


//driver function..it will call all the methods 
		public static void main(String[] args) {
			
					Insertion list=new Insertion(); //creating a new linked list
		
			
			list.insertAtEnd(10);
			list.insertAtStart(20);
			list.insertAtStart(30); // 30 20 10
			
			list.insertAfterANode(list.head.next, 40); //30 20 40 10 
			list.insertBeforeANode(list.head.next, 50);// 30 50 20 40 10 
			list.insertAfterANode(list.head.next.next, 60); //30 50 20 60 40 10 
			list.insertAfterANode(list.head.next.next.next.next, 80); //30 50 20 60 40 80 10 
			list.insertAtEnd(90);//30 50 20 60 40 80 10 90 
			list.insertBeforeANode(list.head.next.next, 70);//30 70 50 20 60 40 80 10 90 .... will not affect as in method it is pointing to head s next
		
			System.out.println("The list is:");
	
			list.printList();
		}

	}

	public void insertAtEnd(int data) {
		// TODO Auto-generated method stub
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
		

		}
		else
		{
			Node temp=head;
			while(temp.next!=null) //traversing
			{
				temp=temp.next;

			}
			temp.next=newNode;
			newNode.next=null;
		//	return;
		}
	}
	
	public void insertAtStart(int data)
	{
		//allocate the node and put in the data
		Node newNode= new Node(data);

		newNode.next=head;
		head=newNode;
		return;

	}

	public void insertAfterANode(Node previousNode,int data)

	{
		//allocate the node and put in the data
		Node newNode =new Node(data);
		if(previousNode==null)
		{
			System.out.println("error");
		}
		else
		{
			//previous node s next in new node s next
			newNode.next=previousNode.next;
			previousNode.next=newNode; // new node s address in prev node s next 
			
		}
	}
	
	public void insertBeforeANode(Node node,int data)
	{
		Node newNode =new Node(data);
		if(node==null)
		{
			System.out.println("error");
		}
		else
		{
			newNode.next=head.next;
			head.next=newNode;
		}
	}

	public void printList()
	{
		Node tempVar=head;
		while(tempVar!=null)
		{
			System.out.print(tempVar.data+" ");
			tempVar=tempVar.next;
		}
		//System.out.print(tempVar.data);
	}

	
}
