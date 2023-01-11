package PracticeBubbleSort;
import java.util.Scanner;

public class BubbleSort {
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for(int i=0; i<n; i++) {
			for(int j=1; j<(n-i); j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner myArr = new Scanner(System.in);
		System.out.println("Enter the number of elements in an Array: ");
		int num = myArr.nextInt();
		int[] arr = new int[num];
		System.out.println("Enter the list of numbers in an Array: ");
		for(int i=0; i<num; i++) {
			arr[i] = myArr.nextInt();
		}
		System.out.println("********************************************************");
		System.out.println("Listing the Array Elements: ");
		for(int i=0; i<num; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n********************************************************");
		System.out.println("********************************************************");
		System.out.println("Array Elements before Bubble Sorting: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n********************************************************");
		System.out.println("********************************************************");
		
		bubbleSort(arr);
		
		System.out.println("Array Elements after Bubble Sorting: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n********************************************************");
	}

}
