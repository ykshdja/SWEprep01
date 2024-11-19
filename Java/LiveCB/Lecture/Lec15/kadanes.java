package Java.LiveCB.Lecture.Lec15;

import java.util.*;
/***
 * Maximum Sub Array (Kadane's Algorithm)
 * Kadanes is the optimized approach for finding maximum of a subarray.
 * operation is on a contiguous subarray. means the elements in the sub-array are 
 * consecutive.
 * 
 * Brute Force - O(N^2)
 * Kadane's  - O(N)
 * 
 * Kadane's - Iterating through the array, maintaining the current maximum sub-array sum
 * ending at each point. updating the global maximum sum encountered.  
 *  Example - arr = [4,3,-2,6,-14,7,-1,4,5,7,-10,2,9,-10,-5,-9,6,1]       
 * 
 * we start with arr[0]-->arr[n]
 * Current Best  
 *  Sum -> item            
 * 4->4 
 * 7->4,3
 * 5->4,3,-2
 * 11->4,3,-2,6,-14
 * -3->4,3,-2,6,-14
 * 7->7
 * 6->6
 * 10->7,-1,4
 * 15->7,-1,4,5
 * 22-> 7,-1,4,5,7
 * 12-> 7,-1,4,5,7,-10
 * 14-> 7,-1,5,7,-10,2
 * 23-> 7,-1,4,5,7,-10,2,9
 * 13-> 7,-1,4,5,...-10
 * 8->7,-1,4.....-9
 * -1 -> 7....-9
 * 6-> 6
 * 7->6,1
 * ---------------------
 * Overall Best
 * sum-> item
 * 4->4
 * 7->4,3
 * 11->4,3,-2,6
 * 15->7,-1,4,5
 * 22->7,-1,4,5,7
 * 23-> 7,-1,4,5,6,-10,2,9
 */
public class kadanes {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(MaximumSubArraysum(arr));
    }
    public static int MaximumSubArraysum(int[] arr)
    {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            ans=Math.max(ans, sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        return ans;
    }

}
