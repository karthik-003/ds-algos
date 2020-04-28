package com.karvis.linkedlist;

public interface ILinkedList<E> {

	public void insert(E s);
	public Object remove(int n);
	public boolean isEmpty();
	public int size();
	public void printList();
	public void insertAt(E s,int pos);
	
}
