package com.jensonjo.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LearningHashMap {

	Map<String, String> hMap = new LinkedHashMap();

	void displayContents() {
		Set<Map.Entry<String,String>> mapEntrySet = hMap.entrySet();
		Iterator itr = mapEntrySet.iterator();
		while (itr.hasNext()) {
			Map.Entry pair = (Entry) itr.next();
			System.out.println("Key : " + pair.getKey() + " | Value : " + pair.getValue());
		}
	}

	public static void main(String[] args) {
		LearningHashMap thisObj = new LearningHashMap();
		thisObj.hMap.put("ID003", "Jenson");
		thisObj.hMap.put("ID001", "Joseph");
		thisObj.hMap.put("ID002", "Joseph");
		thisObj.displayContents();
	}

}
