package SortAlgo.SelectionSort;

import java.util.Arrays;

public class SelectionSortEX1 {

    public static void main(String[] args) {
        int[] arr={4,2,7,1,8,5,7};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    static int[] selectionSort(int[] arr){

        int start=0;
        for (int i=0;i< arr.length;i++) {
            int last = arr.length-1-i;
            int max=getMax(arr,start,last);
            swapped(arr,max,last);

        }
        return arr;
    }

    static int getMax(int[] arr,int start,int last){

        int max=start;
        for (int i=0;i<=last;i++){
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void swapped(int[] arr,int max,int last){

        int temp=0;
        temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
}
