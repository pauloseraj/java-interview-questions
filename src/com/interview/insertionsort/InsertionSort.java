/**
 * 
 */
package com.interview.insertionsort;

/**
 * @author paulose
 *
 */
public class InsertionSort {
	
	public static void insertionSort(int array[]){
		
		
		for (int i = 1; i < array.length; i++) {
			
			int key = array[i];
			int j = i - 1;
			
			
			while(j>=0 && key < array[j]) {
				array[j+1] = array[j];
				array[j] = key;
				j--;
			}
			
		}
		
		for (int i : array) {
			System.out.println(i);
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		insertionSort(new int[] {13,12,11,10});
		

	}

}
