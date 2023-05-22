package interviewQuestionsPractice;

import java.util.Arrays;

public class SecondLargestElementInArray {

	public static void print2Largest(int arr[], int arr_size) {

		int i;

		// There should be atleast 2 elements
		if (arr_size < 2) {
			System.out.println("Invalid input");
			return;
		}

		Arrays.sort(arr);

		// start traversing from the second last element
		for (i = arr_size - 2; i >= 0; i--) {

			if (arr[i] != arr[arr_size - 1]) {
				System.out.println("The second largest element is: " + arr[i]);
				return;
			}

		}
		System.out.println("There is no second largest element.");
	}

	public static void main(String[] args) {

		int arr[] = { 11, 34, 98, 37, 28, 79, 83 };
		int n = arr.length;
		print2Largest(arr, n);

	}

}
