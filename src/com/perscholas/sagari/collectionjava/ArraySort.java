package com.perscholas.sagari.collectionjava;

import java.util.ArrayList;

public class ArraySort {

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
  
  
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(3);
        list2.add(5);
        list2.add(7);
        list2.add(9);
        list2.add(10);
        list2.add(13);
        list2.add(15);
        list2.add(18);
        list2.add(23);
        
		list1.retainAll(list2);
		 System.out.println("Common elements: "
                 + list1);
		

	}

}
