package com.karvis.stackandqueues;

public class StackQueueClient {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("karthik");
		s.push("ramya");
		s.push("dumbo");
		s.push("jumbo");
		s.push("abc");
		
		s.printStack();
		
		s.pop();
		s.printStack();
		
		Queue<String> q = new Queue<>();
		q.enQueue("karthik");
		q.enQueue("ramya");
		q.enQueue("dumbo");
		q.enQueue("jumbo");
		q.enQueue("abx");
		
		q.printQueue();
		
		q.deQueue();
		q.printQueue();
	}
}

