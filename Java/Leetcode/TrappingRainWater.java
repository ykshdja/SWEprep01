package Java.Leetcode;
import java.util.*;
/**
 * Explanation - 42. Trapping Rain Water 
 * Example - arr - 
 * [5,3,1,2,7,4,1,6]
 *  0 1 2 3 4 5 6 7 --> index
 * Left arr - [5,5,5,5,7,7,7,7]
 * Right Arr - [7,7,7,7,7,6,6,6]
 * Left array -  Maximum from left 
 * Right array - Maximum from right
 * We have to find area in between bars 
 * ==> min(5,7) - 5 = 0 
 * ==> min(5,7) - 3 = 2 ((difference between 5 and 3 (Area between 2 bars.)))
 * ==> min(5,7) - 1 = 4 (area)
 * ==> min(5,7) - 2 = 3 (area)
 * Idea - Min(left,right) - arr[i] = area(water is trapped).
 * [Min(left,right)-arr[i]] = area]  
 * -----------------------------------
 * Dry Run --
 * Left[0]=arr[0];
 * Left[1] = Max[Left(0),arr(1)] //Comapring the maximum of Left of the previous
 * Left[2] = Max[Left(1),arr(2)]
 * Maximun uptill 3rd index -
 * Left[3] = Max[Left(2),arr(3)]
 * Max till 4th index - 
 * Left[4] = Max[Left(2),arr(3)]
 * Idea - 
 * [Sum(i=1, i=n-1)[Left[i] = Max[Left(i-1),arr(i)]]] 
 *                     OR
 * For(i=1;i<=n-1;i++){
 * Left[i] = Max[Left(i-1),arr(i)]
 * }
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        int [] arr = {0,1,0,2,1,0,3,2,1,2,1};
        System.out.println(MaximumWater(arr));
    }
    public static int MaximumWater(int[] arr)
    {
        //left max
        int n = arr.length;
        int[] left = new int[n];
        for(int i =1;i<n;i++)
        {
            left[i] = Math.max(left[i-1],arr[i]);
        }
        //right max
        int [] right = new int[n];
        right[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i++) // n-2 because for last index we will work manually.
        {
            right[i] = Math.max(right[i+1],arr[i]);
        }
        //ans call
        /**
         * Fins the minimum of of both left and right and 
         * subtract from arr[i].
         */
        int sum=0;
        for(int i=0;i<right.length;i++)
        {
            sum=sum+Math.min(left[i],right[i])-arr[i];
        }
        return sum;
        /**
         * Dry Run
         * Array = [0,2,4,3,1,4]
         * Min(4,5)-arr[i] =area
         * (4,5)-4 = 0
         * (4,5)-2 = 2 
         * (4,5)-0 = 4;
         * (4,5)-3 = 1;
         * (4,5)-1 = 3;
         * (4,5)-4 = 0;
         * Sum of (0,2,4,1,3,0) = 10 (Maximum Water that can be trapped.)
         */
    }
}
