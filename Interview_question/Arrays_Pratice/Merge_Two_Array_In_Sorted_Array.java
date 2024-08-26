package Arrays_Pratice;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Two_Array_In_Sorted_Array {

    public static void mergeTwoSortedArray(int[] ar1, int[] ar2) {
        int i = 0, j = 0, k = 0;
        int[] res1 = new int[ar1.length + ar2.length];
        
        // Merge arrays
        while (i < ar1.length && j < ar2.length) {
            if (ar2[j] < ar1[i]) {
                res1[k++] = ar2[j++];
            } else {
                res1[k++] = ar1[i++];
            }
        }
        
        // Copy remaining elements of ar1 if any
        while (i < ar1.length) {
            res1[k++] = ar1[i++];
        }
        
        // Copy remaining elements of ar2 if any
        while (j < ar2.length) {
            res1[k++] = ar2[j++];
        }
        
        // Print the merged array
        System.out.println(Arrays.toString(res1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] ar1 = new int[n1];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = in.nextInt();
        }
        
        int n2 = in.nextInt();
        int[] ar2 = new int[n2];
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = in.nextInt();
        }
        
        mergeTwoSortedArray(ar1, ar2);
    }
}

