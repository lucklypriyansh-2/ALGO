package com;

import java.util.ArrayList;
import java.util.Scanner;

public class PIGGYBANK {

	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);

		int nooftestcase = sc.nextInt();

		for (int i = 0; i < nooftestcase; i++) {

			int piggylower = sc.nextInt();
			int piggyupper = sc.nextInt();
			int piggycapacity =   piggyupper - piggylower;

			ArrayList<Integer> pricearray = new ArrayList<>();
			ArrayList<Integer> wieghttArray = new ArrayList<>();
			int noofpriceweight = sc.nextInt();
			for (int j = 0; j < noofpriceweight; j++) {
				pricearray.add(sc.nextInt());`
				wieghttArray.add(sc.nextInt());
			}
			int amount = MinimumAmount(pricearray, wieghttArray, piggycapacity, wieghttArray.size() - 1);
          System.out.println("amount is"+amount);
		}

	}

	private static int MinimumAmount(ArrayList<Integer> pricearray, ArrayList<Integer> wieghttArray, int piggycapacity,
			int size) {
		// TODO Auto-generated method stub
		if(piggycapacity<0)
			return 0;
		
		if(size<0)
			return Integer.MAX_VALUE;
		
		
		int value= Integer.min(MinimumAmount(pricearray, wieghttArray, piggycapacity, size - 1), pricearray.get(size)
				+ MinimumAmount(pricearray, wieghttArray, piggycapacity - wieghttArray.get(size), size));
return value;
	}

}
