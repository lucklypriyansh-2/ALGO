package com;

import java.util.Scanner;

public class MultiplyAndDivideBignumbers {

	public static void main(String... args) {
		int[] Multiplynumber = new int[10000];
		Scanner sc = new Scanner(System.in);
		int noofeleemets = sc.nextInt();
		int[] numberarray = new int[noofeleemets];

		for (int i = 0; i < numberarray.length; i++) {

			numberarray[i] = sc.nextInt();

		}
		int m = 0;
		int number1 = numberarray[0];

		while (number1 > 0) {
			Multiplynumber[m] = number1 % 10;
			number1 = number1 / 10;
			m++;
		}

		
		
		for (int i = 1; i < numberarray.length; i++) {
			int currentnumber = numberarray[i];
			int temp = 0;
			for (int k = 0; k < m; k++) {
				int number = currentnumber * Multiplynumber[k] + temp;
				Multiplynumber[k] = number % 10;
				temp = number / 10;

			}
			while (temp > 0) {
				Multiplynumber[m] = temp % 10;
				temp = temp / 10;
				m++;

			}

		}

		for (int l = 0; l < m; l++) {
			System.out.println(Multiplynumber[l]);

		}

	}

}
