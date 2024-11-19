package Java.LiveCB.Lecture.Lec15;
/**
 * Selection Sort -
 * 1. Finding the smallest item on the list and then swap it 
 * with the 1st element of the list. 
 * 2. Then Find the Smallest element in the remaining list(
 * ignoring the 1st one). and swap it with the second element on the list.
 * It Continues until the remainung part of the list/array is empty.
 * 
 * 
 */
public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,-7,4,-8,2};
        Sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

    public static void Sort(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            int idx = minidx(arr, i); //get the min value
            //Swap idx with arr[i].
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }

    public static int minidx(int[] arr, int index)
    {
        int idx = index;
        for(int i=index+1;i<arr.length;i++)
        {
            if(arr[i]<arr[idx])
            {
                idx=i;
            }
            
        }
        return idx;
    }
}
