package com.solutions.problem_one;

public class ThreadSafePresident {

	private static ThreadSafePresident tsPotus = null;
	
	private ThreadSafePresident() {
		
	}
	
	public static synchronized ThreadSafePresident getThreadSafePotus() {
		
		if (tsPotus == null) {
			tsPotus = new ThreadSafePresident();
		}
		
		return tsPotus;
	}
}
