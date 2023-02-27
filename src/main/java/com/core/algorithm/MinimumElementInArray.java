package com.core.algorithm;

public class MinimumElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {1,3,4,2,6};
		int min = Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
		System.out.println(" min " + min );
	}

}
