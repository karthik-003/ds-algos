package com.karvis.stackandqueues;

import com.karvis.linkedlist.ILinkedList;
import com.karvis.linkedlist.LinkedList;

public class QueueOfStrings {

	ILinkedList<String> list = null;
	public QueueOfStrings() {
		// TODO Auto-generated constructor stub
		list = new LinkedList<String>();
	}
	
	public void enQueue(String s) {
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
