package com.arana.ds;

public class BinarySearchRecursive implements BinarySearchBehavior {
	
	public static final int FAILURE = -1;
	
	private static int bsearch(int[] i, int left, int right, int findMe){
		// test if array is empty
		if(left > right){
			// set is empty, so return value showing not found
			return FAILURE;		// Base case 2: subarray of size zero.
		}
		
		// Calculate mid point to cut set in half
		int mid = (left + right)/2; 	// Halfway between left and right
		// Three-way comparison
		if(findMe == i[mid]){
			// key is in lower subset
			return mid;					// Base case 1: success!
		} else if(findMe < i[mid]){
			// key is in upper subset
			return bsearch(i, left, mid - 1, findMe);	// Search left half	
		} else{
			// key has been found
			return bsearch(i, mid + 1, right, findMe);	// Search right half
		}
	}

	public int bynarySearch(int[] i, int findMe) {
		return  bsearch(i, 0, i.length-1, findMe);
	}

}
