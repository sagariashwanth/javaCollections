package com.perscholas.sagari.collectionjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertDeleteList {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n= scan.nextInt();
		List<Integer> list = new ArrayList<Integer>(n);
		for(int i=0;i<n;i++) {
			list.add(scan.nextInt());
		}
		
		int q = scan.nextInt();
		
		for(int i=0;i<q;i++) {
			String action = scan.next();
		
		if(action.equals("Insert")) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			list.add(x,y);
		}
		if(action.equals("Delete")){
			int x = scan.nextInt();
			list.remove(x);
		}
		}
		for(Integer i: list) {
			System.out.print(i + " ");
		}

	}

}
