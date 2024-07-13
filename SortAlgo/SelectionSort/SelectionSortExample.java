package SortAlgo.SelectionSort;

import java.util.Arrays;


public class SelectionSortExample {
    public static void main(String[] args) {

        int[] arr={6,4,2,7,1,9,5,0,3};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

     static int[] selectionSort(int[] arr) {

        for (int i=0;i<arr.length;i++){

            int last=arr.length-1-i;
            int maxIndex=getMaxIndex(arr,0,last);
            swapped(arr,maxIndex,last);
        }

         return arr;
     }

     static void swapped(int[] arr, int maxIndex, int last) {
        int temp=0;
        temp=arr[maxIndex];
        arr[maxIndex]=arr[last];
        arr[last]=temp;
    }

    static int getMaxIndex(int[] arr,int start,int last){
        int max=start;

        for (int i=0;i<=last;i++){
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
     }
}
