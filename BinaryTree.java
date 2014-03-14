public class BinaryTree {
	private class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;
		public TreeNode(int d) {
			data = d;
			left=null;
			right=null;
		}

		public TreeNode(int d,Node l,Node r) {
			data = d;
			left = l;
			right = r;
		}
	}

	/*
	Contains Code
	*/
	public boolean contains(int d, TreeNode T) {
		if(T==null) 
			return false;
		if (T.data==d)
			return true;
		if(T.data<d)
			return contains(d,T.right);
		else
			return contains(d,T.left);
	}

	/*
	FindMin Code
	*/
	public TreeNode findMin(TreeNode T) {
		if T==null
			return null;
		else if(T.left==null)
			return T;
		
		return findMin(T.left);
	}

	/*
	FindMax Code
	*/
	public TreeNode findMax(TreeNode T) {
		if(T==null)
			return null;
		while(T.right!=null) {
			T = T.right;
		}
		return T;
	}

	/*
	Insert Code
	*/
	public TreeNode insert(int d,TreeNode T) {
		if(T==null)
			return(new BinaryTree());
		if(T.data<d)
			insert(d,T.right)
		else if(T.data>d)
			insert(d,T.left)
		else
			;	//Do  Nothing
		return T;
	}

	/*
	Delete Code
	*/
	public TreeNode remove(int d,TreeNode T) {
			if(T==null)
				return T;

			if(T.data<d) {
				T.right = remove(d,T.right);
			}
			else if(T.data>d) {
				T.left = remove(d,T.left);
			}
			if(T.right!=null&&T.left!=null) {
				int elem = findMin(T.right).data;
				T.data = elem;
				T.right = remove(elem,T.right);
			}
	}


	private void printTree( TreeNode t ) {

	}


	private BinaryNode<AnyType> root;
	public BinarySearchTree( ) { 
		root = null; 
	}
	contains(int)
	findMin()
	findMax()
	makeEmpty()
	isEmpty()
	insert()
	remove()
	printTree()
}