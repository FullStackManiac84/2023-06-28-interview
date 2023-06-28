package com.solutions.problem_one;

public class Test_One {

	public static void main(String[] args) {

		// Non Thread Safe Singleton
		President potus1 = President.getPotus();
		President potus2 = President.getPotus();

		if (potus1 == potus2) {
			System.out.println("Object refs are identical");
		} else {
			System.out.println("Not a Singleton pattern");
		}
		
		// Thread Safe Singleton Checks
		Runnable r = () -> {
			ThreadSafePresident potus3 = ThreadSafePresident.getThreadSafePotus();
			System.out.println(potus3.toString());
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}

}
