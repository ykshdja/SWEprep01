package Java.LiveCB.Lecture.Lec_array;

import java.util.*;

public class reverseArr_range {
    /***
     * Use Two Pointer Approach --->
     * Consider a smaller array from the point1 you want to reverse till point2
     * for index 2 till 6
     * arr ={3,5,1,8,6,11,78,9,0,56,76,23,56}
     * point1 is arr[2] = 1;
     * point2 is arr[6] = 78;
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 7, 8, 6, 11, 78, 9, 0, 56, 76, 23, 56 };
        reverseArr_range(arr, 2, 6);// 2 and 6 is Index number
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArr_range(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
