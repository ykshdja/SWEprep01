package Java.LiveCB.Lecture.Lec15;

import java.util.*;
/**
 * Maximum Sub array '
 * 'Find the sub-array with the largest sum and return its sum.
 * Example - [2,3,-7,6,-1,4]
 * sub array 1 - 
 * define indices for all sub-arrays
 * Figure 01
 * --------------------------------------
 *    i  j      arr[i..]           Sum 
 *   [0-0]      2                  2
 *    [0-1]     2 3                5
 *     [0-2]    2 3 -7            -2
 *     [0-3]    2 3 -7 6           4
 *     [0-4]    2 3 -7 6 -1        3
 *     [0-5]    2 3 -7 6 -1 4      7
 * --------------------------------------
 * 
 */
public class subArray {
    public static void main(String[] args) {
        int [] arr = {-2,1,3,4,1,7,8,9,34,5,67,0};
        System.out.println(MaximumSubArraySum(arr));
    }
    public static int MaximumSubArraySum(int[] arr)
    {
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            //Figure 01 explains this loop. 
            // Iteration for every sub-array
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}
