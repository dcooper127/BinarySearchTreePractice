
public class BST
{
	class Node
	{
		
		int value;
		Node left;
		Node right;
		
		public Node(int data) 
		{
			this.value = data;
			this.left = null;
			this.right = null;
		}
	}
	
	Node root;
	
	public BST()
	{
		root = null;
	}
	
	public boolean search(int data)
	{
		return searchRec(this.root, data);
	}
	
	public boolean searchRec(Node root, int data)
	{
		if(root == null)
			return false;
		
		if(root.value == data)
			return true;
		
		if(data < root.value)
			return searchRec(root.left, data);	
		else
			return searchRec(root.right, data);
			
	}
	
	
	public void insert(int data)
	{
			root = insertRec(root, data);
	}
	
	

	
	public Node insertRec(Node root, int data)
	{
		if(root == null)
			return new Node(data);
		
		else
		{
			if(data < root.value)
				root.left = insertRec(root.left,data);
			else
				root.right = insertRec(root.right,data);
		}
		
		return root;
	}
	
}
