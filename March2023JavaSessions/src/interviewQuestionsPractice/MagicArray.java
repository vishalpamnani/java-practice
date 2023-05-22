package interviewQuestionsPractice;

import java.util.*;

public class MagicArray {
    public static void solution(int[] arr, int n) {
    	
    	// Given an array input for example [5,3,4,1,2], you have to print a new array with each index having the count of smaller elements to the right of the starting element;
    	// output in this case should be [4,2,2,0,0] as 5> all 4 to the right, 3 is > 1&2, 4 is > 1&2 and so on..
    	// write your code here

        n = arr.length;
        int count = 0;

        List<Integer> magicArrayList = new ArrayList<Integer>();
        int size = magicArrayList.size();
        

        

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){

                if(arr[i]>arr[j]){
                count++;
            }
         }
            magicArrayList.add(count);
            size++;
            count = 0;

        
        }

        for(int k=0; k<=size; k++){

            System.out.println(magicArrayList.get(k));

        }

        

      

    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr, n);
    }
}   