package SortAlgo.InterviewLeetcode;

import java.util.Arrays;

public class FirstMissingPositiveAMAZON {

    public static void main(String[] args) {
        int[] arr={3,4,-1,1};

        int posNum=firstMissingNumber(arr);
        System.out.println(posNum);
    }

    static int firstMissingNumber(int[] arr) {

        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i] > 0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                swapped(arr,i,correct);
            }else {
            i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int index=0;index< arr.length;index++){
            if(arr[index]!= index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }

    static void swapped(int[] arr, int i, int correct) {
        int temp=0;
        temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
