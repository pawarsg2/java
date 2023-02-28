package com.core.algorithm;

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 1, -2, 1, 3, 2 };

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum = sum + array[k];
				}
				max = Math.max(sum, max);
			}
		}
		System.out.print(max);

		//// Alternative way

		int bestSum = Integer.MIN_VALUE;
		int currentSum = 0;

		for (int i = 0; i < array.length; i++) {

			currentSum = Math.max(array[i], currentSum + array[i]);

			bestSum = Math.max(currentSum, bestSum);
		}
		System.out.print(" New " + bestSum);
	}

}
