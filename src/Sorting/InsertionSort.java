package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		//TODO: S2 implements insertion sort

		for (int i = 1; i < unsortedArray.length; i++) {
			for (int j = i; j > 0; j--) {
				if (unsortedArray[j] > unsortedArray[j-1]) {
					break;
				} else {
					int temp = unsortedArray[j-1];
					unsortedArray[j-1] = unsortedArray[j];
					unsortedArray[j] = temp;
				}
			}
		}
		
		return unsortedArray;
	}
}
