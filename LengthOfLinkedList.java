package linkedListImplementation;

import linkedListImplementation.PrintLinkedList.Node;

public class LengthOfLinkedList {

	static Node head;

	static class Node
	{
		int data;
		Node next;

		Node (int d)
		{
			data=d;
			next=null;
		}



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LengthOfLinkedList llist = new LengthOfLinkedList();

			for(int i=8;i>0;i--)
			{
				llist.insert(i);}
			llist.printlist();
			System.out.println("Count of nodes is " + 
					llist.getCount());


		}

	}


	public int getCount()
	{
		int count = 0;
		Node temp = head;
		while(temp.next!=null)
		{

			temp=temp.next;
			count++;
		}
		return count;

	}



	public void insert(int data) {
		// TODO Auto-generated method stub
		Node newNode= new Node(data);

		newNode.next=head;
		head=newNode;

	}

	public void printlist() {
		// TODO Auto-generated method stub

		Node n=head;
		while(n != null)
		{
			System.out.print(n.data+" ");
			n = n.next;//checking the address
		}


	}
}
