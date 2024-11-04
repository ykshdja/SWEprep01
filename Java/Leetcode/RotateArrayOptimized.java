package Java.Leetcode;

import Java.LiveCB.Lecture.Lec10.reverse;

public class RotateArrayOptimized {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        int k = 3;
        RotateArray(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
    /**
     * [10,20,30,40,50,60],[70,80,90]
     * reverse range 
     * ==> 60,50,40,30,20,10
     * ==> 90,80,70
     * ----------------------
     * reverse again -
     * ==> 70,80,90,10,20,30,40,50,60
     * for k=3;
     * reverse range 
     * [0,n-k-1] ==> [n-k,n-1]
     * @param arr
     * @param k
     */
    public static void RotateArray(int[] arr, int k)
    {
         int n=arr.length;
         k=k%n;
         Reverse(arr,0,n-k-1);
         Reverse(arr, n-k, n-1);
         Reverse(arr, 0, n-1);
    }
    public static void Reverse(int[] arr, int i,int j)
    {
        while(i<j)
        {
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
