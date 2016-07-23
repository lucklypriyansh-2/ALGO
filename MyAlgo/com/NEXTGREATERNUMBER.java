package com;

import java.util.Arrays;
import java.util.Scanner;

public class NEXTGREATERNUMBER {

	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);
		String number = sc.nextInt() + "";

		char[] elements = number.toCharArray();

		int k = elements[elements.length - 1];
		int i;
		for (i = k - 1; i >= 0; i--) {

			if (elements[i] < elements[k])
				break;
			k--;

		}

		findgreaterelemment(elements, elements[i], i);

		Arrays.sort(elements, 3, elements.length);

		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}

	}

	private static void findgreaterelemment(char[] elements, char element, int index) {

		int minimumdiffrence = Integer.MAX_VALUE;
		int diffrenceindex = index;
		for (int i = index+1; i < elements.length; i++) {

					
			
		}

	}

	public static void NEXTGREATERELEMENT(char[] a) {

	}

}
