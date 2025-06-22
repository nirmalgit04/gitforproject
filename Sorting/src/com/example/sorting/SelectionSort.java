package com.example.sorting;

public class SelectionSort {

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 7, 8, 3, 1, 2 };
		// selection sort
		for (int i = 0; i < arr.length - 1; i++) {
			int sidx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[sidx] > arr[j]) {
					sidx = j; // 2
				}

			}
			int temp = arr[sidx];
			arr[sidx] = arr[i];
			arr[i] = temp;
		}
		printArray(arr);
	}

}
