package qs.service;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(30);
		list.add(35);
		list.add(36);
		list.add(38);
		System.out.println(list);
		
		for(int index=0; index < list.size(); index++) {
			System.out.print(list.get(index) + " ");
		}
		System.out.println();
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

	}

}
