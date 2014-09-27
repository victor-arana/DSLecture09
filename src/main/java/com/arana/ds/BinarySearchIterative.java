package com.arana.ds;

public class BinarySearchIterative implements BinarySearchBehavior {
	
	public static final int FAILURE = -1;
	
	private static int bsearch(int[] i, int left, int right, int findMe){
		
		while (left <= right){
			int middle = (left + right) / 2;
			if(i[middle] == findMe){
				return middle;
			} else if (i[middle] <  findMe){
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}
		return FAILURE;
	}

	public int bynarySearch(int[] i, int findMe) {
		return bsearch(i, 0, i.length-1, findMe);
	}

}
