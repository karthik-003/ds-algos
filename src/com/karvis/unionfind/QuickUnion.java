package com.karvis.unionfind;

public class QuickUnion implements UnionFind {

	int[] arr;
	
	public QuickUnion(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = i;
		}
	}
	
	public boolean connected(int p,int q) {
		return getRoot(p) == getRoot(q);
	}
	
	private int getRoot(int p) {
		while(arr[p]!=p) {
			p = arr[p];
		}
		return p;
	}
	
	
	public void union(int p,int q) {
		int pRoot = getRoot(p);
		int qRoot = getRoot(q);
		arr[pRoot] = qRoot;
		System.out.println("Array after union("+p+","+q+"):");
		printArray();
	}
	
	void printArray() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	
}
