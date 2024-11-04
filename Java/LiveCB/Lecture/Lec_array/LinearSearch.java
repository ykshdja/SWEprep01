package Java.LiveCB.Lecture.Lec_array;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 8, 7 };
        int item = 7;
    }

    public static int search(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
              return i;
            }
        }
        return -1;
    }
}
 