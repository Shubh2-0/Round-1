package com.masai;

import java.security.PublicKey;

public class Question_3 {

//	1. MERGE SORT

	public static void ms(int[] arr, int si, int ei) {

		int mid = si + (ei - si) / 2;

		ms(arr, si, mid);
		ms(arr, mid + 1, ei);
		Merger(arr, si, mid, ei);

	}

	public static void Merger(int[] arr,int si,int mid,int ei){

		int[] merger = new int[ei-si+1];

		int idx1 = si;
		int idx2 = mid+1;
		int x = 0;

		while(idx1<= mid && idx2<=ei){

		if(arr[idx1]<=arr[idx2])
		merger[x++] = arr[idx1++];

		else 
		merger[x++] = arr[idx2++];


		}

		while(idx1<=mid)
		merger[x++] = arr[idx1++];


		while(idx2<=ei)
		merger[x++] = arr[idx2++];



		for(int i=0,j=si;i<merger.length;i++,j++)
		arr[j] = merger[i];


		/*
		 *  TIME  : O(nlogn)
		 *  Space : O(n)
		 *  Pros of Merge Sort:
              1. Stable and consistent O(n log n) time complexity.
              2. Suitable for large datasets.

          Cons of Merge Sort:
              1. High memory usage.
              2. Slower for small datasets.
		/*
			


		}

	
	    
	
	

	
//	2. BUBBLE SORT
	
	
	
	public static void bubbleS(int[] arr) {
	
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j] > arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					
				}
				
				
			}
			
/*
 * Pros of Bubble Sort:
1. Simple to understand and implement.
2. Minimal memory usage as it's in-place.

Cons of Bubble Sort:
1. Inefficient for large datasets.
2. Lacks adaptivity, always the same number of operations.
 */
				
			
		}
	
	
	
	

	
	public static void main(String[] args) {
		
		int[] ae = {1,2,3,4,90,7,9,10,45};
		int t = 9;
		
		System.out.println(twoPointers(ae, t));
		
		
		
	}
	
	
	
//	SEARCHING 
	
	
//	1. BINARY SEARCH
	
	public static int binarySearch(int[] arr,int target) {
		
		int low =0;
		int high = arr.length-1;
		
		while(low<=high) {
		
			int mid = low + (high-low)/2;
			
			if(arr[mid] == target) return mid;
			
			else if(arr[mid] < target)
				low = mid+1;
			
			else
				high = mid-1;
			
					
			
		}
		
		
		
		
		return -1;
	
		
		
		
		
	}
	
	

//	2. TWO POINTERS
	
		
	

	public static int twoPointers(int[] arr,int target) {
		
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high) {
		
			if(arr[low] == target)
				return low;
			
			else if (arr[high] == target) 
				return high;
		
			else if(high-low == 1 && arr[high-low] == target)
				return high-low;
			 
			
			low++;
			high--;
			
			
					
			
		}
		
		
		
		
		return -1;
	
		
		
		
		
	}
	
	
		
		
		
	}
    

	
	
	
	
	
	

