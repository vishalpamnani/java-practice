package interviewQuestionsPractice;

import java.util.Arrays;

public class MaxMinPair {
	
	public int min;
	public int max;
	
	
	public static MaxMinPair getMinMax(int arr[], int n) {
		
		MaxMinPair minmax = new MaxMinPair();
		Arrays.sort(arr);
		minmax.min=arr[0];
		minmax.max=arr[n-1];
		
		return minmax;
		
	}

	public static void main(String[] args) {
		
		int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        int arr_size = arr.length;
		
		MaxMinPair maxmin = getMinMax(arr, arr_size);
		
		System.out.println(maxmin.min+" "+maxmin.max);

	}

}
