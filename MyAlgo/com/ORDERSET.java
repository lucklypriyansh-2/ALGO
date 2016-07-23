package com;

import java.util.Scanner;
import java.util.Stack;

public class ORDERSET extends Object {
	public static void main(String... args) {

		Scanner sc = new Scanner(System.in);
		String[] array = new String[] { "{}[](){[}]", "([})" };
		braces(array);
	}

	/*
	 * Complete the function below.
	 */

	static String[] braces(String[] values) {

		String[] returnanswer = new String[values.length];
		for (int i = 0; i < values.length; i++) {
			String currentString = values[i];
			Stack<Character> balancedparanthes = new Stack<Character>();
			for (int k = 0; k < currentString.length(); k++) {

				char c = currentString.charAt(k);
				if (c == '{' || c == '(' || c == '[') {
					balancedparanthes.push(c);
					continue;
				}

				else if (c == '}') {
					if (balancedparanthes.isEmpty()) {
						returnanswer[i] = "NO";
						break;
					}
					if (balancedparanthes.pop().charValue() != '{') {
						returnanswer[i] = "NO";
						break;
					}
				} else if (c == ']') {
					if (balancedparanthes.isEmpty()) {
						returnanswer[i] = "NO";
						break;
					}
					if (balancedparanthes.pop().charValue() != '[') {
						returnanswer[i] = "NO";
						break;
					}

				} else if (c == ')') {
					if (balancedparanthes.isEmpty()) {
						returnanswer[i] = "NO";
						break;

					}
					if (balancedparanthes.pop().charValue() != '(') {
						returnanswer[i] = "NO";
						break;
					}
				}

			}

			if (balancedparanthes.isEmpty()) {
				returnanswer[i] = "YES";

			} else {
				returnanswer[i] = "NO";
			}

		}
		return returnanswer;
	}

}
