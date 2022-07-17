package lca.service;

import java.util.ArrayList;
import java.util.List;


public class Service{
	
	public Node root;

	List<Integer> path1 = new ArrayList<>();
	List<Integer> path2 = new ArrayList<>();

	public int check(int data1, int data2){
		path1.clear();
		path2.clear();
		return findCommonAncestor(root, data1, data2);
	}

	private int findCommonAncestor(Node root, int data1, int data2){
		boolean pathOne = findPath(root, data1, path1);
		boolean pathTwo = findPath(root, data2, path2);
		
		if(!pathOne || !pathTwo){
			System.out.println(path1.size() > 0 ? "" : "left is missing ");
			System.out.println(path2.size() > 0 ? "" : "right is missing ");
			return -1;		
		}

		int index = 0;


		for(; index < path1.size() && index < path2.size(); index++){
			if( path1.get(index).equals(path2.get(index)))
				break;
		}

		return path1.get(index -1);

	}
	private boolean findPath(Node root, int data, List<Integer> path){

		if(root == null)
			return false;

		if(root.data == data)
			return true;

		path.add(data);

		if(root.left != null && findPath(root.left, data, path))
			return true;

		if(root.right != null && findPath(root.right, data, path))
			return true;

		path.remove(path.size()-1);

		return false;
	}
}