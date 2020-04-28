package com.karvis.linkedlist;

import com.karvis.models.Node;

public class LinkedList<E> implements ILinkedList<E> {

	Node<E> root;
	Node<E> current;
	int size = 0;
	public LinkedList() {
		// TODO Auto-generated constructor stub
		this.root = null;
		this.current = null;
	}
	
	@Override
	public void insert(E s) {
		// TODO Auto-generated method stub
		Node<E> newNode = new Node<E>(s);
		this.current = newNode;
		if(this.root==null) {
			this.root = newNode;
		}else {
			Node<E> temp = this.root;
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
			//this.root = temp;
		}
		size++;
	}
	@Override
	public void insertAt(E s,int pos) {
		if(pos<0 || pos>size) {
			System.err.println("Invalid position.");
		}else {
			Node<E> newNode = new Node<E>(s);
			if(pos==0) {
				newNode.setNext(this.root);
				this.root = newNode;
			}else {
				Node<E> temp = this.root;
				for(int i=0;temp!=null && i<pos-1;i++) {
					temp = temp.getNext();
				}
				newNode.setNext(temp.getNext());
				temp.setNext(newNode);
			}
			size++;
		}
		
	}
	@Override
	public Object remove(int n) {
		// TODO Auto-generated method stub
		Object retVal=null;
		if(n<0 || n>size) {
			System.err.println("Invalid position.");
		}else {
			
			Node<E> temp = this.root;
			if(n==0) {
				retVal = temp.getData();
				this.root = temp.getNext();
			}else {
				for(int i=0;temp!=null && i<n-1;i++) {
					temp = temp.getNext();
				}
				retVal = temp.getNext().getData();
				Node<E> next= temp.getNext().getNext();
				temp.setNext(next);
			}
			size--;
		}
		return retVal;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.root==null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		Node<E> temp = this.root;
		while(temp!=null) {
			System.out.print(temp.getData());
			if(temp.getNext()!=null)
				System.out.print("->");
			temp = temp.getNext();
		}
		System.out.println();
	}

}
