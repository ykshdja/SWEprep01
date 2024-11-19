package Java.LiveCB.Lecture.Lec15;
https://courses.cs.washington.edu/courses/cse143/24sp/homework.shtml
import java.util.*;
/**
 * Insertion Sort - 
 * Effecient for Small Data.
 * Time Complexity - O(n+d) or O(n). d is the number of inversions.
 * more efficient than bubble/selection sort.
 * memory - O(1).
 * Insertion Sort - removes an element from the input data, and inserts it into the correct
 * position.
 * Resulting array - k iteration, where k+1 entries are sorted.
 * 
 * [Sorted Partial | comparator/item \ Unsorted Elements] 
 * 
 * 
 * Example -
 * [ 6 8 1 4 3 7 2  ] - index = 0
 * [6 8 1 4 5 3 7 2 ] - indices 0-1
 * [1 6 8 4 5 3 7 2 ] - indices 0-2 
 * [ 1 4 6 8 5 3 7 2] - indices 0-3 $ every pass 
 * indices 0-3 ==> [ [1 6 8] 4 5 3 7 2]
 * - Every Pass/iteration => elements in [1 6 8] is compared to 4.
 * and every pass the sub-array expands and it will compare every element of that sub array '
 * to the item next which is in the unsorted section
 * 
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6, 7, -1 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
    }

	public static void Sort(int[] arr) {
		// every iteration the array exapandes for InsertLastElemnt Method.
		for (int i = 1; i < arr.length; i++) {
			InsertLastElement(arr, i);
		}

	}
    public static void InsertLastElement(int[] arr, int i)
    {
        int item = arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>item)
        {
            arr[j+1] = arr[j];
            arr[j] = item;
            j--;
        }
    }

	
}
