package Java.LiveCB.Lecture.Lec14;

import java.util.*;
/*
 * Periodic Nature of Array with K.
 * For K=143.
 * offset = k%nums.length;
 */
public class rotateArray {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70};
        int k=3;
        RotateArray(arr, k);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

    public static void RotateArray(int[] arr, int k){
        k=k%arr.length;
        for(int j=1;j<=k;j++)
        {
            int item=arr[arr.length-1]; //we are changing item (last index).
            /**
             * Rotation 1  - Start from (n-2).
             * Because we have to move the second last item.
             */
            //Loop from behind
            for(int i=arr.length-2;i>=0;i--)
            {
                arr[i+1] = arr[i]; // move the value to the next index.
                arr[i+1] = arr[i];
            }
            arr[0]=item;
        }
        
    }
}
