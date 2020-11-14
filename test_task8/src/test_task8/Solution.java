package test_task8;

import java.util.*;

class Solution {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();

			boolean regul;

			if ((balancedOrNot(input, '{', '}') == true) && (balancedOrNot(input, '[', ']') == true)
					&& (balancedOrNot(input, '(', ')') == true)) {
				regul = true;
			} else {
				regul = false;
			}

			System.out.println(regul);

		}
	}

	public static boolean balancedOrNot(String input, char start, char end) {

		Stack<String> myStack = new Stack<String>();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == end) {
				if (!myStack.empty()) {
					myStack.pop();
				} else {
					return false;
				}
			}
			if (c == start) {
				myStack.push(String.valueOf(c));
			}
		}
		return myStack.empty();

	}

}
