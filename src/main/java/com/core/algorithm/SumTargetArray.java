package com.core.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumTargetArray {
	
	
		
		public static void main(String arg[]) { 
			
			int array[] ={5,10,15,20,25,30};	
			int target =50;		
			printsum(array,0," ",0,target);
	}
		
		static void printsum(int array[], int indx, String arrayStr, int sum, int target) {
			
			if(indx== array.length) {
				System.out.println(" === " + arrayStr);
				if(sum==target)  {
					System.out.println(arrayStr);
				}
				return;
			}
			printsum(array, indx +1, arrayStr + array[indx] + " ,", sum +array[indx],  target);
			printsum(array, indx +1, arrayStr, sum,  target);
		}

}

