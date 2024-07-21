package SortAlgo.CyclicSort;

import java.util.Arrays;

public class CyclicSortEx2 {
    public static void main(String[] args) {

        int[] arr={5,3,1,6,4,2};

        System.out.println(Arrays.toString(cycclicSort(arr)));
    }

     static int[] cycclicSort(int[] arr) {

        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swapped(arr,i,correct);

            }else{
                i++;
            }
        }
        return arr;
    }

     static void swapped(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
