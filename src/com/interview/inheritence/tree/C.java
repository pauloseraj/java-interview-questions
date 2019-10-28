/**
 * 
 */
package com.interview.inheritence.tree;

/**
 * @author paulose
 *
 */
public class C extends ParentClassB {
	
	C(){
		System.out.println("inside C");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Calling -- GreatParentClassA A = new C();");		
		//for class A as reference
		GreatParentClassA A = new C();
		System.out.println("\n");
		System.out.println("Calling -- C c = new C();");
		//for class c
		C c = new C();
		

	}

}
