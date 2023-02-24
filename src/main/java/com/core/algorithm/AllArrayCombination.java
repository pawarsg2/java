package com.core.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllArrayCombination {
	
	public static void main(String arg[]) { 
		
		List listOfInt = Arrays.asList(1,2,3);
		List <List<Integer>> ListOfArray = new ArrayList<List<Integer>>();
		ListOfArray.add(new ArrayList());
		
		for(int i= 0; i<listOfInt.size();i++) {
			int size = ListOfArray.size();
			for(int j=0;j<size;j++) {				
				List l = new ArrayList(ListOfArray.get(j));
				l.add(listOfInt.get(i));
				ListOfArray.add(l);
			}
		
		}
	System.out.println(ListOfArray);	
	}

}
