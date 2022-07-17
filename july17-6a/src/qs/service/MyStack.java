package qs.service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MyStack {

	private Queue<Integer> stackElements;

	public MyStack() {
		stackElements = new LinkedList<>();
	}

	public void push(int data) {
		Queue<Integer> temp =  new LinkedList<>();

		if(stackElements.size() == 0) {
			stackElements.add(data);
		}
		else {
			while(stackElements.size() > 0)
				temp.add(stackElements.remove());

			stackElements.add(data);

			while(temp.size() > 0)
				stackElements.add(temp.remove());
		}
	}
	public int pop() throws NoSuchElementException{
//		int rtnValue = -1;
//		if(stackElements.size() > 0)
//			rtnValue=  stackElements.remove();
//		else 
//			System.out.println("Stack is empty");
//		
//		return rtnValue;
		return stackElements.remove();
	}
	
	public int getSize() {
		return stackElements.size();
	}
	
	public boolean isEmpty() {
		boolean rtnValue = true;
		if(stackElements.size() > 0) {
			rtnValue = false;
		}
		
		return rtnValue;
	}
	public void dispaly() {
		if(stackElements.size() == 0) {
			System.err.println("Stack is empty ");
		}
		else {
//			System.out.println(stackElements);
			
			Iterator<Integer> itr = stackElements.iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next() + " ");
			}
			System.out.println();
		}
	}
}