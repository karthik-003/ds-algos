package com.karvis.stackandqueues;

import com.karvis.linkedlist.ILinkedList;
import com.karvis.linkedlist.LinkedList;

public class Queue<E> {

	ILinkedList<E> list = null;
	public Queue() {
		// TODO Auto-generated constructor stub
		list = new LinkedList<E>();
	}
	public void enQueue(E s) {
		list.insertAt(s, 0);
	}
	
	public String deQueue() {
		return list.remove(list.size()-1).toString();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public int size() {
		return list.size();
	}
	
	public void printQueue() {
		list.printList();
	}
}
