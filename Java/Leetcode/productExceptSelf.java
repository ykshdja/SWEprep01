package Java.Leetcode;

import java.util.*;
/**
 * Leetcode - 238. Product Array Except Self
 * Link - https://leetcode.com/problems/product-of-array-except-self/description/
 * Time Complexity - O(n).
 * Concept for Left and Right Array is used for Finding Index before an
 * item and after an item.
 * Left arr[]
 * Arr[]
 * Right ar[]
 * -----------
 * We use Right and Left Array to make an Equation and 
 * compute for Array.  Similar Question - 
 * 42. Trapping Rain Water....
 * $ Without division Operation.
 * ----------------------------
 * Algo - Left Side 
 * Left(0)=1;
 * Left(1)=Left(0)xarr[0];
 * Left(2)=Left(1)xarr[1];
 * .
 * .Left(3)=Left(2)xarr[2]
 * .
 * Left(i)=Left(i-1)xarr[i-1];
 * --------------------------
 * Arr = [2,3,4,6,5]
 * Left = [1,2,6,24,44]
 */
public class productExceptSelf {
    public static void main(String[] args) {
        int [] arr = {2,3,4,6,5};
        System.out.println(product(arr));

    }
    public static int[] product(int[] arr)
    {
        int[] left = new int[arr.length];
        left[0] = 1; // First (manual Operation)
        for(int i=1;i<arr.length;i++){ // start the loop with i=1.
            // because i=0 is already operated.
            left[i]=left[i-1]*arr[i-1];

        }/**
        Left = [1,2,6,24,44]
        **/
        int[] right = new int[arr.length];
        right[arr.length-1]=1;// First Operation (manual)
        // right = [,,,,1]
        for(int i=arr.length-2;i>=0;i--)
        {
            right[i] = right[i+1]*arr[i+1];

        } /***
        Right arr = [360,120,30,5,1]
        */
        //Ans Call
        for (int i=0;i<arr.length;i++)
         {
            left[i] = left[i]*right[i];

         }
         return left;

    }
}
