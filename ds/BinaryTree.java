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
	
	public static boolean identicalCheck(Node n1, Node n2) {
		if(n1== null && n2 == null) return true;
		if(n1!= null && n2!= null) return (n1.data == n2.data && identicalCheck(n1.left, n2.left) && identicalCheck(n1.right, n2.right));
		
		return false;
		
	}
	
	public int size(Node n) {
		if(n==null) return 0;
		else{
			return (size(n.left)+ 1+ size(n.right));
		}
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(2);
		tree.root.left.right = new Node(2);
		
		BinaryTree tree1 = new BinaryTree();
		tree1.root = new Node(1);
		tree1.root.left = new Node(2);
		tree1.root.right = new Node(2);
		tree1.root.left.left = new Node(4);
		tree1.root.left.right = new Node(2);
		
		if(identicalCheck(tree.root, tree1.root)) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		System.out.println("Maximum depth of tree::::::::"+ tree1.findMaxDepth(tree1.root));
		System.out.println("Maximum size of tree::::::::"+ tree1.size(tree1.root));
		
	}
}
