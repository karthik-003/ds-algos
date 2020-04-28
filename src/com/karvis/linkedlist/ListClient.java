package com.karvis.linkedlist;

public class ListClient {

	public static void main(String[] args) {
		ILinkedList<String> list = new LinkedList<String>();
		System.out.println("List empyt? "+list.isEmpty());
		list.insert("a");
		list.insert("b");
		list.insert("c");
		list.insert("d");
		
		list.printList();
		
		list.insertAt("k", 5);
		list.printList();
		/*
		 * String s = list.remove(0); if(!s.isEmpty()) {
		 * System.out.println("After removing "+s); list.printList(); }
		 * 
		 * System.out.println("Size of list: "+list.size());
		 */
	}
}
