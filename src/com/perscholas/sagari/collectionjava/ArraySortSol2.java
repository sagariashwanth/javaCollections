package com.perscholas.sagari.collectionjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortSol2 {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(3,4,6,7,9,12,15,17,23),
		b= Arrays.asList(3,5,7,9,10,13,15,18,23),
		c = new ArrayList<Integer>();
		
	for(Integer i : a)	{
		if(Collections.binarySearch(b, i) >=0)c.add(i);
	}
	System.out.println(c);

	}

}
