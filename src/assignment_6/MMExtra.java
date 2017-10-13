package assignment_6;

public class MMExtra 
{
	/**
	 * Hint on creating a tree with specified height: 
	 * use a recursive function with the height as one of its arguments. 
	 * It will call itself to create subtrees, with 1 subtracted from 
	 * the specified height. If the specified height is 1, create a
	 * node with no subtrees.
	 */
	private static char x = '@';
	public static BinaryTree<String> createRecursiveTree(int height)
	{
		
		
	    x+=1;
		String txt = " "+ x; 
		BinaryTree<String> tree;
		
		if (height <= 1) {
			tree = new BinaryTree<String>(txt, null, null);
		}
		else {
			tree = new BinaryTree<String>(txt, 
					createRecursiveTree(height-1), createRecursiveTree(height-1));
		}
		
		return tree;
	}

}
