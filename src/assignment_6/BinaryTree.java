package assignment_6;import java.util.LinkedList;import java.util.Queue;/** * A class that implements the ADT binary tree.
 *  * @author Frank M. Carrano * @version 2.0 */

public class BinaryTree<T> implements BinaryTreeInterface<T>, java.io.Serializable{
	private static final long serialVersionUID = -1932834476575953631L;
	private BinaryNodeInterface<T> root;
	
	public BinaryTree()
	{
		root = null;
	} 

	public BinaryTree(T rootData)
	{
		root = new BinaryNode<T>(rootData);
	} 

	public BinaryTree(T rootData, BinaryTree<T> leftTree,
 			BinaryTree<T> rightTree)
	{
		privateSetTree(rootData, leftTree, rightTree);
	} 

	public void setTree(T rootData)
	{
		root = new BinaryNode<T>(rootData);
	} 

	public void setTree(T rootData, BinaryTreeInterface<T> leftTree,
			BinaryTreeInterface<T> rightTree)
	{
		privateSetTree(rootData, (BinaryTree<T>)leftTree,
 				(BinaryTree<T>)rightTree);
	} 

	private void privateSetTree(T rootData, BinaryTree<T> leftTree,
 			BinaryTree<T> rightTree)
	{
		root = new BinaryNode<T>(rootData);

		if ((leftTree != null) && !leftTree.isEmpty())
			root.setLeftChild(leftTree.root);

		if ((rightTree != null) && !rightTree.isEmpty())
		{
			if (rightTree != leftTree)
				root.setRightChild(rightTree.root);
			else
				root.setRightChild(rightTree.root.copy());
		} 

		if ((leftTree != null) && (leftTree != this))
			leftTree.clear();

 		if ((rightTree != null) && (rightTree != this))
			rightTree.clear();
	}

	private BinaryNode<T> copyNodes() // not essential
	{
		return (BinaryNode<T>)root.copy();
	} 

	public T getRootData()
	{
		T rootData = null;
		if (root != null)
			rootData = root.getData();
		return rootData;
	} 

	public boolean isEmpty()
	{
		return root == null;
	} 

	public void clear()
	{
		root = null;
	} 

	protected void setRootData(T rootData)
	{
		root.setData(rootData);
	} 

	protected void setRootNode(BinaryNodeInterface<T> rootNode)
	{
		root = rootNode;
	} 

	protected BinaryNodeInterface<T> getRootNode()
	{
		return root;
	} 

	public int getHeight()
	{
		return root.getHeight();
	} 

	public int getNumberOfNodes()
	{
		return root.getNumberOfNodes();
	} 

	public void inorderTraverse()
 	{
		inorderTraverse(root);
	}
public void preOrderTraverse(){	preOrderTraverse(root);}public void postOrderTraverse(){	postOrderTraverse(root);}
public void breathFirstTraverse(){	 breathFirstTraverse(root);}	private void inorderTraverse(BinaryNodeInterface<T> node)
 	{
		if (node != null)
		{
			inorderTraverse(node.getLeftChild());
			System.out.println(node.getData());
			inorderTraverse(node.getRightChild());
		} 
	} 	private void preOrderTraverse(BinaryNodeInterface<T> node)	 	{		if (node != null)		{			System.out.println(node.getData());			preOrderTraverse(node.getLeftChild());			preOrderTraverse(node.getRightChild());					}	}		private void postOrderTraverse(BinaryNodeInterface<T> node)		 		{			if (node != null)			{				postOrderTraverse(node.getLeftChild());				postOrderTraverse(node.getRightChild());				System.out.println(node.getData());			} 	}  
		private void breathFirstTraverse(BinaryNodeInterface<T> node){			if(node==null)				return;//Checks if the node is empty			Queue<BinaryNodeInterface<T>> que = new LinkedList<BinaryNodeInterface<T>>();//Creates a generic queue			que.add((BinaryNodeInterface<T>)node);//Adds the nodes into the queue			while(!que.isEmpty()){//loop through the queue								BinaryNodeInterface<T> node1 =(BinaryNodeInterface<T>) que.remove();//Stores the root node, prints it and then removes it from the queue				System.out.println(" "+ node1.getData());								if(node1.getLeftChild()!=null)//checks if the leftChild is null and if not it adds it too the queue					que.add(node1.getLeftChild());				if(node1.getRightChild()!=null)//checks if the rightChild is null and if not it adds it too the queue					que.add(node1.getRightChild());			}				}
} 