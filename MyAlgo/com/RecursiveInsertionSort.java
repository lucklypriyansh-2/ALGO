package com;

public class RecursiveInsertionSort {

	public static void main(String... args) {

		int data[] = {10,20,30,40,50,60,71,80,90,91};
	
		int number =-123;
		
		RecursiveInsertionSort(data,9);
	}

	public static void RecursiveInsertionSort(int[] array, int number) {
		if (number >= 1)
			return;

		RecursiveInsertionSort(array, number - 1);

		int currentnumber = array[number];
		int i;
		for (i = number - 1; i >= 0;) {

			if (array[i] > currentnumber) {
				array[i + 1] = array[i];
				i--;
			} else {
				break;
			}

		}
		array[i + 1] = currentnumber;

	}

}
