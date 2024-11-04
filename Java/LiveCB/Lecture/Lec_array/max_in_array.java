package Java.LiveCB.Lecture.Lec_array;

import java.util.*;

public class max_in_array {
    public static void main(String[] args) {
        int[]arr = {3,5,1,7,8,23};
        System.out.println(maxInArr(arr));
    }

    public static int max1arr(int[] arr){
        //Avoiding all the negative value. Take the value as the minimum value of INTEGER.ß
        int max = Integer.MIN_VALUE; // -2^31
        for(int i=0;i<arr.length;i++)
        {
            max = Math.max(max, arr[i]); //Compare the maximum of Array.

        }

        return max;
    }
    public static int maxInArr(int [] arr)
    {
        int m = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>m){
                m=arr[i];
            }
        }

        return m;
    }

}
