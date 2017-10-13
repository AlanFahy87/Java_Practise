package assignment_6;

import java.util.Scanner;

public class BinaryTreeDemo2 
{
	private static int n;


	public static void main(String[] args) 
	{
		System.out.println("What heigth do you want your tree?");
		Scanner scan = new Scanner(System.in);
				n = scan.nextInt();
		scan.close();
		// Create a tree
		System.out.println("Constructing a test tree ...");
		
		BinaryTree<String> test1Tree = MMExtra.createRecursiveTree(n);//Takes in the users input for the height of the tree,
		
		// Display some statistics about it
		System.out.println("\nSome statistics about the test tree ...");
		displayStats(test1Tree);
		
		// Perform in-order traversal
		System.out.println("\nIn-order traversal of the test tree, printing each node when visiting it ...");
		test1Tree.inorderTraverse();
		
		// Perform pre-order traversal
				System.out.println("\npre-order traversal of the test tree, printing each node when visiting it ...");
				test1Tree.preOrderTraverse();
				
				// Perform post-order traversal
				System.out.println("\npost-order traversal of the test tree, printing each node when visiting it ...");
				test1Tree.postOrderTraverse();
		
				// Perform  breathFirst traversal
				System.out.println("\n breathFirst traversal of the test tree, printing each node when visiting it ...");
				test1Tree.breathFirstTraverse();
	} 
	
	
	public static void displayStats(BinaryTree<String> tree)
	{
		if (tree.isEmpty())
			System.out.println("The tree is empty");
		else
			System.out.println("The tree is not empty");
		
		System.out.println("Root of tree is " + tree.getRootData());
		System.out.println("Height of tree is " + tree.getHeight());
		System.out.println("No. of nodes in tree is " + tree.getNumberOfNodes());
	}  
}