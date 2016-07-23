package com;

public class BinaryIndexTree {

	int[] BIT = new int[1000];

	public BinaryIndexTree(int[] array) {
		// TODO Auto-generated constructor stub

		createBinaryIndexTree(array);

	}

	private void createBinaryIndexTree(int[] array) {
		// TODO Auto-generated method stub

		for (int i = 0; i < array.length; i++) {

			updateBITarray(array[i], i + 1, array.length);

		}
	}

	private void updateBITarray(int val, int j, int end) {
		// TODO Auto-generated method stub

		for (; j <= end; j += j & -j) {
			BIT[j] += val;
		}

	}

	private void createBinaryIndexTree() {
		// TODO Auto-generated method stub

	}

	public static void main(String... args) {

		int[] array = new int[] { 2,1,1,3,2 };
           BinaryIndexTree bit= new BinaryIndexTree(array);


   		System.out.println("abc");
           
	}
	
	

}
