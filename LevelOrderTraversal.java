package Important;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	//creates nodes of the tree
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
			
		}
	}
// application
	static class BinaryTree
	{
		Node root;
		
		void printLevelorder() {
		Queue<Node> queue = new LinkedList<Node>(); 
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node tempNode = queue.poll(); // poll() removes the current head
			System.out.println(tempNode.data);
			
			// enqueue left child
			if(tempNode.left != null)
			{
				queue.add(tempNode.left);
				
		}
		
			if(tempNode.right!= null)
			{
				queue.add(tempNode.right);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* creating a binary tree and entering  
        the nodes */
       BinaryTree tree_level = new BinaryTree(); 
       tree_level.root = new Node(1); 
       tree_level.root.left = new Node(2); 
       tree_level.root.right = new Node(3); 
       tree_level.root.left.left = new Node(4); 
       tree_level.root.left.right = new Node(5); 
 
       System.out.println("Level order traversal of binary tree is - "); 
       tree_level.printLevelorder(); 

	}

}
}