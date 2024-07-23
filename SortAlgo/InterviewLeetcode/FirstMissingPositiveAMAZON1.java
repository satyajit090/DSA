package SortAlgo.InterviewLeetcode;

import java.util.Arrays;

public class FirstMissingPositiveAMAZON1 {
    public static void main(String[] args) {
        int[] arr={3,4,-1,1};

        int mis=findMisPosNum(arr);
        System.out.println(mis);
    }

     static int findMisPosNum(int[] arr) {

        int i=0;
        while(i< arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<= arr.length && arr[i]!=arr[correct]){
                swapped(arr,i,correct);
            }else {
                i++;
            }
        }
        for(int index=0;index< arr.length;index++){
            if(arr[index]!=index+1){
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
