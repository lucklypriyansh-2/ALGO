package com;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Stockroom {

	static int[][] lookup;
	static int[] array;

	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();

		lookup = new int[arraySize][arraySize];

		array = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();

		}

		int maxtillnow = Integer.MIN_VALUE;
		for (int k = 1; k < arraySize - 1; k++) {

			maxtillnow = Integer.max(maximummEnergy(k - 1, k + 1), maxtillnow);

		}
		System.out.println(maxtillnow);

	}

	public static int maximummEnergy(int i, int j) {

		if (i < 0)
			return 0;
		if (j >= array.length)
			return 0;

		if (lookup[i][j] != 0)
			return lookup[i][j];
		lookup[i][j] = array[i] * array[j] + Integer.max(maximummEnergy(i - 1, j), maximummEnergy(i, j + 1));
		return lookup[i][j];

	}

}
