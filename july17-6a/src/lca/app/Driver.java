package lca.app;

import lca.service.Node;
import lca.service.Service;

public class Driver {

	public static void main(String[] args) {
		
		Service tree = new Service();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		
		
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		
		tree.root.right.left = new Node(60);
		tree.root.right.right = new Node(70);

		System.out.println("Lowest Commong Ancesstor(20, 30) " + tree.check(20,30));
		System.out.println("Lowest Commong Ancesstor(40, 30) " + tree.check(40,30));
		System.out.println("Lowest Commong Ancesstor(60, 70) " + tree.check(60,70));
		System.out.println("Lowest Commong Ancesstor(20, 40) " + tree.check(20,40));
		System.out.println("Lowest Commong Ancesstor(20, 55) " + tree.check(20,55));
		System.out.println("Lowest Commong Ancesstor(65, 30) " + tree.check(65,30));
		System.out.println("Lowest Commong Ancesstor(66, 77) " + tree.check(66,77));
	}
}