package com.perscholas.sagari.collectionjava;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArraySortSol3 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		list1.add(9);
		list1.add(12);
		list1.add(15);
		list1.add(17);
		list1.add(23);

		// initializing arraylist using anonymous inner class
		ArrayList<Integer> list2 = new ArrayList<>() {
			{
				;
				add(3);
				add(5);
				add(7);
				add(9);
				add(10);
				add(13);
				add(15);
				add(18);
				add(23);
			}
		};
		
		System.out.println("Common elements: ");
		System.out.println(list1.stream().filter(list2::contains).collect(Collectors.toList()));
	}

}
