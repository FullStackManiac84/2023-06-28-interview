package com.solutions.problem_two;

import java.util.ArrayList;
import java.util.List;

public class Test_Two {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>(List.of("Hello", "Wake", "Fern", "Wake"));
		DeDupe.removeDupes(list1);
		for (String s : list1) {
			System.out.println(s);
		}
		
		List<Integer> list2 = new ArrayList<>(List.of(1,2,3,4,5,6,6,6,6));
		DeDupe.removeDupes(list2);
		list2.forEach((i) -> System.out.println(i));
		
		// created custom Song object for final test
		Song s0 = new Song("The Beatles", "Abbey Road", 3);
		Song s1 = new Song("The Beatles", "Abbey Road", 3);
		Song s2 = new Song("The Doors", "Waiting For The Sun", 5);
		Song s3 = new Song("The Beach Boys", "Today!", 7);
		
		List<Song> mySongs = new ArrayList<>();
		mySongs.add(s0);
		mySongs.add(s1);
		mySongs.add(s2);
		mySongs.add(s3);
		
		mySongs.forEach((song) -> System.out.println(song));
		
		System.out.println("***************  de-duping ********************");
		
		DeDupe.removeDupes(mySongs);
		mySongs.forEach((song) -> System.out.println(song));
	}

}
