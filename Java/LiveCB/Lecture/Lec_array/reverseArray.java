package Java.LiveCB.Lecture.Lec_array;

import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 7, 8, 23 };
        reverseArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArr(int[] arr) {
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
