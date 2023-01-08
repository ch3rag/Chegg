// Tree.java

import java.util.ArrayList;
import java.util.List;

public class Tree {
	private Node root;

	class Node {
		public Object data;
		public List<Node> children;

		public void print() {
			System.out.println(data);
			for (Node c : children) {
				c.print();
			}
		}
	}

	public Tree(Object rootData) {
		root = new Node();
		root.data = rootData;
		root.children = new ArrayList<>();
	}
	
	public void addSubtree(Tree subtree) {
		root.children.add(subtree.root);
	}

	public void print() {
		if(root != null) {
			root.print();
		}
	}

	public static void main(String[] args) {
		//       3
		//    1     4
		// -1   2  X  X
		// Create A Tree Like Above
		Tree tree = new Tree(3);
		Tree subTree1 = new Tree(1);
		Tree subTree2 = new Tree(4);
		Tree subSubTree1 = new Tree(-1);
		Tree subSubTree2 = new Tree(2);
		subTree1.addSubtree(subSubTree1);
		subTree1.addSubtree(subSubTree2);
		tree.addSubtree(subTree1);
		tree.addSubtree(subTree2);

		// Print The Tree
		tree.print();

	}
}
