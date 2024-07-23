package SortAlgo.InterviewLeetcode;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {

        int[] arr={1,2,2,4};
        System.out.println(Arrays.toString(misMatch(arr)));
    }
    static int[] misMatch(int[] arr) {
        int i=0;
        while(i<arr.length){

            int correct=arr[i]-1;
            if (arr[i] != arr[correct]){
                swapped(arr,i,correct);
            }else{
                i++;
            }
        }
        int[] setM=new int[2];
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){

                return new int[]{arr[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }

    static void swapped(int[] arr, int i, int correct) {
        int temp=0;

        temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
