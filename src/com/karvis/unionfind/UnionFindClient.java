package com.karvis.unionfind;

public class UnionFindClient {

	public static void main(String[] args) {
		/*
		 * QuickFind qf = new QuickFind(10); qf.union(0, 4); qf.union(2, 0);
		 */
		
		QuickUnion qu = new QuickUnion(10);
		qu.union(3, 4);
		qu.union(4, 9);
		qu.union(2, 9);
		qu.union(5, 9);
	}
}
