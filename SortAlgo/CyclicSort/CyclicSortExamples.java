package SortAlgo.CyclicSort;

import java.util.Arrays;

public class CyclicSortExamples {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,6,8,7,4};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    static int [] cyclicSort(int[] arr) {

        int i=0;
       while(i<arr.length)
       {
           int correct=arr[i]-1;
           if(arr[i] != arr[correct]) {
               swapped(arr, i, correct);
           }else {
               i++;
           }
       }
        return arr;
    }

     static void swapped(int[] arr, int i, int correct) {
        int temp=0;
        temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }

}
