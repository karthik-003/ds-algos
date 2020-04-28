package com.karvis.stackandqueues;

import com.karvis.linkedlist.ILinkedList;
import com.karvis.linkedlist.LinkedList;

public class Stack<E> {

	ILinkedList<E> stack;
	public Stack() {
		// TODO Auto-generated constructor stub
		stack = new LinkedList<E>();
	}
	public void push(E item) {
		stack.insert(item);
	}
	
	public String pop() {
		return stack.remove(stack.size()-1).toString();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public int size() {
		return stack.size();
	}
	
	public void printStack() {
		stack.printList();
	}
}
