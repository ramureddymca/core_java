package ds;
class Node{
	int data;
	Node left,right;
	public Node(int item) {
		
		data=item;
		left=right=null;
	}
}
public class BinaryTree {

	Node root;
	
	public int findMaxDepth(Node node){
		if(node==null) {
			return 0;
		}
		int lDepth = findMaxDepth(node.left);
		int rDepth = findMaxDepth(node.right);
		
		if(lDepth>rDepth) {
			return lDepth+1;
		}else {
			return rDepth+1;
		}
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(2);
		tree.root.left.right = new Node(2);
		System.out.println("Maximum depth of tree::::::::"+tree.findMaxDepth(tree.root));
		
	}
}
