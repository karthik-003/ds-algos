package com.karvis.models;

public class Node<E> {

	E data;
	Node<E> next;
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	public Node(E data) {
		this.data = data;
		this.next = null;
	}
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	
}
