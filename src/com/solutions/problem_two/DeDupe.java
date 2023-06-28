package com.solutions.problem_two;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeDupe {

	public static <T> List<T> removeDupes(List<T> dupeList) {
		
		Map<T, String> freqMap = new HashMap<>();
		
		int listSize = dupeList.size();
		int index = 0;
		
		while (index < listSize) {
			
			T currentObj = dupeList.get(index);
						
			if (freqMap.containsKey(currentObj)) {
				dupeList.remove(index);
				// index shouldn't increase, but listSize should decrease!!
				listSize--;
			} else {
				freqMap.put(currentObj, currentObj.toString());				
				// now index increases
				index++;
			}
		}
		
		return dupeList;
	}
}
