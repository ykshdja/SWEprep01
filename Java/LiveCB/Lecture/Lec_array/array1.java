package Java.LiveCB.Lecture.Lec_array;
import java.util.*;
public class array1 {
    public static void main(String[] args) {
		int[] arr = { 3, 2, 5, 6, 7 };
		int[] other = { 30, 20, 50, 60, 70 };
		System.out.println(arr[0] + " " + other[0]);
		Swap(arr, other);
		System.out.println(arr[0] + " " + other[0]);
	}

	public static void Swap(int[] arr, int[] other) {
		int[] temp = arr;
		arr = other;
		other = temp;

	}
}
