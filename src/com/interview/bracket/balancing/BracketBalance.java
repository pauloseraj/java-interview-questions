/**
 * 
 */
package com.interview.bracket.balancing;

import java.util.Stack;

/**
 * @author paulose
 *
 */
public class BracketBalance {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String inputB = "())(";
		String[] split = inputB.split("");

		Stack<String> bStack = new Stack<>();

		for (int i = 0; i < split.length; i++) {

			if (bStack.size() <= 0) {
				if (split[i].equals(")")) {
					throw new Exception("Not Balanaced");
				}
			}

			if (split[i].equals("(")) {
				bStack.push(split[i]);
			} else {
				bStack.pop();
			}
		}

		if (bStack.size() > 0) {
			System.out.println("Not Balaced");

		} else {
			System.out.println("Balanced");
		}

	}

}
