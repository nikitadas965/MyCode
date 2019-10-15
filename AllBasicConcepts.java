package linkedListImplementation;

import linkedListImplementation.Insertion.Node;

/**** insertion, deletion(key and position), length of list, search element, get nth node , get mid node ,****/
public class AllBasicConcepts {

	static Node head;

	static class Node
	{
		Node next; int data;

		Node(int data)
		{
			this.data=data;  next= null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllBasicConcepts llist=new AllBasicConcepts();



		llist.insertAtstart(20);
		llist.insertAtEnd(10);
		llist.insertAtEnd(30);
		llist.insertAfterANode(llist.head.next, 40);
		llist.insertAfterANode(llist.head.next.next, 40);
		llist.insertAfterANode(llist.head.next.next.next, 50);
		llist.insertAfterANode(llist.head.next.next.next.next, 60);
		llist.insertAfterANode(llist.head.next.next.next.next.next, 70);

		llist.deleteNodeUsingKey(40);
		llist.DeleteUsingAPosition(6);

		System.out.println(llist.getLength());
		//llist.getLength();

		if(llist.search(llist.head, 70))
			System.out.println("found");
		else
			System.out.println("not found");
		//	llist.search(100);
		System.out.println(llist.getNthNode(4));

		llist.getMidNode();


		llist.printList();




	}
	public void insertAtEnd(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
			head=newNode;
		else {
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;}

			temp.next=newNode;
			newNode.next=null;
		}
	}



	public void insertAtstart(int data)
	{
		Node newNode = new Node(data);
		if (head==null) {
			head=newNode;
			return;
		}
		newNode.next= head;
		head=newNode;
		return;
	}


	public void insertAfterANode(Node prev,int data)
	{
		Node newNode = new Node(data);
		if(prev==null) {
			System.out.println("error");
		}

		Node temp = prev.next;
		prev.next=newNode;
		newNode.next=temp;

	}


	public void printList()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}


	public void deleteNodeUsingKey(int key)
	{
		Node temp = head;
		Node prev=null;
		if(temp.next!=null && temp.data==key) // 1st node to be deleted
		{
			head=temp.next;
		}
		while(temp.next!=null && temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		prev.next=temp.next;
	}

	public void DeleteUsingAPosition(int pos)
	{
		Node temp = head;
		if(pos==1)
		{
			head=temp.next;
		}
		while(temp.next!=null)
		{
			for(int i=0;i<pos-1;i++)
			{

				temp=temp.next;
			}

			Node node = temp.next.next;
			temp.next=node;
		}
	}

	public int getLength()
	{
		Node temp = head;
		int count =0;
		while(temp!=null)
		{
			temp =  temp.next;
			count++;
		}
		return count;
	}
	public boolean search(Node head,int key)
	{
		Node temp = head;
		while(temp!=null)
		{

			if(temp.data==key)
				return true;

			temp =  temp.next;}

		return false;

	}

	public int getNthNode(int index)
	{
		int count =0;
		Node temp=head;
		while(temp!=null)
		{
			if(count==index)
			{
				return temp.data;
			}
			count++;
			temp = temp.next;
		}

		return count;
	}
	public void getMidNode()
	{
		Node fastPtr=head;
		Node slowPtr=head;
		if(head!=null)
		{
			while(fastPtr!=null&&fastPtr.next!=null)
			{
				fastPtr=fastPtr.next.next;
				slowPtr=slowPtr.next;
			}

			System.out.println(slowPtr.data);
		}
	}



	/*
	 * 		







	 */

}
