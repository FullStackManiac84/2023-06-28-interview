package com.solutions.problem_one;

public class President {

	private static President potus = null;
	
	private President() {
		
	}
	
	public static President getPotus() {
		
		if (potus == null) {
			potus = new President();
		}
		
		return potus;
	}
}
