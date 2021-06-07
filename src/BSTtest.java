
public class BSTtest {
	
	public static void main (String args[])
	{
		BST tree = new BST();
		
		//tree.insertRec(tree.root, 5);
		
		/*boolean test5 = tree.search(5);
		boolean test2 = tree.search(2);
		boolean test7 = tree.search(7);*/
		
		
		//
		tree.insert(5);
		tree.insert(7);
		tree.insert(2);
		//System.out.println(tree.root.left.value);
		
		boolean test7 = tree.search(10);
		if(test7)
			System.out.println("Pass");
				
		//test
	}

}
