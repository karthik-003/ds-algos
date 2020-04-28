package com.karvis.unionfind;

public class QuickFind implements UnionFind{

	int[] arr;
	
	QuickFind(int n){
		arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = i;
		}
		System.out.println("**** Array initialized");
		printArray();
	}
	
	void union(int a,int b) {
		// swap the id of b with id of a. 
		// if id(b) is not b, then find x such that id(x) is id(b)
		int aid = arr[a];
		int bid = arr[b];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == aid)
				arr[i] = bid;
		}
		System.out.println("Array after union("+a+","+b+"):");
		printArray();
	}
	
	
	void printArray() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
}
