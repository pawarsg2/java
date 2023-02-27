package com.core.algorithm;
import java.lang.*;
import java.lang.reflect.Array;
public class RainWater {

    public static void main( String arg[]) {

        int array[] = {2,1,3,0,2};
        int leftMax[] = new int[array.length];
        int rightMax[] = new  int[array.length];
        int max=0;
        int count = 0;
        for(int i =0; i<array.length;i++) {
            max= leftMax[i] = Math.max(max,  array[i]);           
        }
         max=0;
        for(int i =array.length-1; i>=0; i--) {
            max= rightMax[i] = Math.max(max,  array[i]);           
        }
        for(int i=0;i<array.length;i++) {
        	count = count + Math.min(leftMax[i], rightMax[i]) - array[i];
        }
        System.out.println("count " + count);
    }
}