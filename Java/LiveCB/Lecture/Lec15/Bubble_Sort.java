package Java.LiveCB.Lecture.Lec15;
/**
 * Arrays - Sorting 
 * 
 * 1. Bubble Sort.
 * 2. Selection Sort.
 * 3. Insertion Sort.
 * 
 * 
 * 
 */
import java.util.*;

public class Bubble_Sort {
    public static void main(String[] args) {
        int [] arr  = {4,5,3,2,1};
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
    }
    public static void Sort(int[] arr) {
		for (int pass = 1; pass < arr.length; pass++) {

			for (int i = 0; i < arr.length - pass; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
}
