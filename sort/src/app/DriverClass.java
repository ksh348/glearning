package app;

import java.util.Scanner;

import sort.BinarySearch;
import sort.MergeSort;
import sort.RotatedArray;

public class DriverClass {
	public static void main(String[] args) {
		int arr[];
		int size;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter array size ");
		size = scan.nextInt();
		
		arr = new int[size];
		System.out.println("Enter array Elements ");
		for(int index=0; index < arr.length; index++) {
			arr[index] = scan.nextInt();
		}
		
		MergeSort mergeSort = new MergeSort();
		System.out.println("Before Sorting Elements ");
		mergeSort.printArray(arr);		
		mergeSort.sortAsc(arr, 0, arr.length -1);

		System.out.println("After Sorting Assending Elements ");
		mergeSort.printArray(arr);

//		mergeSort.sortDsc(arr, 0, arr.length -1);
//		System.out.println("After Sorting Decending Elements ");
//		mergeSort.printArray(arr);

		BinarySearch search = new BinarySearch();
		int key =0;
		System.out.println("Enter the key to search ");
		key = scan.nextInt();
		search.search(arr, 0, arr.length, key);
		
		RotatedArray rotate = new RotatedArray();
		rotate.rotate(arr);
		
		System.out.println("After Rotating Elements ");
		mergeSort.printArray(arr);

	}
}