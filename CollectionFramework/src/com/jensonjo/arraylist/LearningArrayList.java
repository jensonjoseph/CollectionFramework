package com.jensonjo.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class LearningArrayList {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list1.add("Student#" + i);
		}
		
		long randomizeBy = System.nanoTime();
		Collections.shuffle(list1, new Random(randomizeBy));
		System.out.println("Randomized");
		Collections.sort(list1);
		int res = Collections.binarySearch(list1, "Student#5");
		System.out.println("Is element found ? " + res);

		Collections.shuffle(list1, new Random(randomizeBy));
		list1.add("Student#5");
		list1.add("Student#9");
		Hashtable<String, String> ht = new Hashtable<>();
		for (String entry : list1) {
			String ret = ht.put(entry, entry);
			if (ret != null) {
				System.out.println(ret + " is duplicate");
			}
		}

		System.out.println(list1.size());
		System.out.println(ht.size());
	}

}
