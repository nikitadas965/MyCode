package Stacks;

/** Linked list implementation of stacks in nothing but insert and delete from the beginning**/
public class StackImpUSingLinkedList {
	static Node top = null; // head here is top
	
	static class Node{
		Node next ; int data;
		
		Node(int data)
	
	{
			this.data=data; Node next=null;}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void push(int data)
	{
		Node newNode = new Node(data);
		newNode.next=top;
		top=newNode;
		
	}
	
	void pop()
	{
		if(top==null)
		{
		return;
		}
		Node temp = top; 
		top=top.next;
		
		
	}
	

}
