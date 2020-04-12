package com.interview.selectionsort;

public class SelectionSort {
	
	public static void main(String[] args) {
		selectionsort(new int[] {13,12,11,10});
	}

	private static void selectionsort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			
			
			int ele = array[i];
			int pos = i;
			
			for (int j = i+1; j < array.length; j++) {
				if (ele > array[j]) {
					pos = j;
				}
				
				
				
			}
			
			int t = array[i];
			array[i] = array[pos];
			array[pos] = t;
			
			
			
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
