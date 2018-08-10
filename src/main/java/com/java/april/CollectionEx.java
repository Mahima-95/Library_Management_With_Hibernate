package com.java.april;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionEx {

	public void testQuestions() {
		try {
			int c = 9 / 0;
			System.out.println("this is a try block");
			// System.exit(0);
		} catch (ArithmeticException arithmeticException) {
			arithmeticException.printStackTrace();
			System.out.println("catch ArithmeticException block");
		} catch (Exception exception) {
			System.out.println("catch Exception block");
		} finally {
			System.out.println("finally block");
		}
	}

	public void CheckMapOrdering() {

		System.out.println("map");
		HashMap<Integer, String> map = new HashMap<>();
		map.put(15, "agrawal");
		map.put(5, "agrawal");
		map.put(9, "mahima");
		map.put(16, null);
		map.put(null, "mahima");
		map.put(6, "thank");
		map.put(null, "you");
		map.put(8, null);
		map.put(1, "hi");
		map.put(2, "this");
		map.put(115, "agrawal");
		map.put(51, "agrawal");
		map.put(3, "is");
		map.put(4, "mahima");

		System.out.println(map);
		/*
		 * for(Map.Entry m:map.entrySet()){
		 * System.out.println(m.getKey()+" "+m.getValue()); }
		 */
		System.out.println("linkedHashMap");
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(3, "is");
		linkedHashMap.put(4, null);
		linkedHashMap.put(null, "!!!");
		linkedHashMap.put(1, "hi");
		linkedHashMap.put(2, "this");
		linkedHashMap.put(5, null);
		linkedHashMap.put(null, "thank");
		linkedHashMap.put(7, "you");
		System.out.println(linkedHashMap);

		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(12, "this");
		treeMap.put(18, "!!!");
		treeMap.put(13, "is");
		treeMap.put(1, "hi");
		treeMap.put(2, "this");
		treeMap.put(8, null);
		treeMap.put(3, "is");
		treeMap.put(4, "mahima");
		treeMap.put(5, "agrawal");
		treeMap.put(6, null);
		treeMap.put(7, "you");
		System.out.println(treeMap);

	}

	public void checkSetOrdering() {
		Set<String> set = new HashSet<>();
		set.add("mahima");
		set.add(null);
		set.add("hi");
		set.add(null);
		set.add("is");
		set.add("!!!");
		System.out.println(set);

		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("mahima");
		linkedHashSet.add(null);
		linkedHashSet.add("hi");
		linkedHashSet.add(null);
		linkedHashSet.add("is");
		linkedHashSet.add("!!!");
		System.out.println(linkedHashSet);

		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("mahima");
		treeSet.add("h");
		treeSet.add("hi");
		treeSet.add("a");
		treeSet.add("is");
		treeSet.add("!!!");
		System.out.println(treeSet);
	}

	public void checkListOrdering() {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("G");
		arrayList.add("mahima");
		arrayList.add("h");
		arrayList.add("hi");
		arrayList.add("a");
		arrayList.add("hiiiiii");
		arrayList.add("h2222i");
		arrayList.add("is");
		arrayList.add("!!!");
		System.out.println(arrayList);

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("G");
		linkedList.add("mahima");
		linkedList.add("h");
		linkedList.add("hi");
		linkedList.add("a");
		linkedList.add("hiiiiii");
		linkedList.add("h2222i");
		linkedList.add("is");
		linkedList.add("!!!");
		System.out.println(linkedList);

		Vector<String> vector = new Vector<>();
		vector.add("G");
		vector.add("mahima");
		vector.add("h");
		vector.add("hi");
		vector.add("a");
		vector.add("hiiiiii");
		vector.add("h2222i");
		vector.add("is");
		vector.add("!!!");
		System.out.println(vector);
	}

	public static void main(String[] args) {
		CollectionEx collectionEx = new CollectionEx();
		collectionEx.equals(collectionEx);
		// collectionEx.CheckMapOrdering();
		// collectionEx.CheckSetOrdering();
		// collectionEx.CheckListOrdering();
	}
}
