package SortAlgo.BubbleSort;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {

        int[] arr={4,2,9,5,6,7,1,3};

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr){
 boolean swapped;
        for (int i=0;i<arr.length;i++){
            swapped=false;
            for (int j=1;j<arr.length-i;j++){
                int temp=0;
                if (arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }

        return arr;
    }
}
