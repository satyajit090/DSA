package SortAlgo.InterviewLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArrayGOOGLE {

    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};


        System.out.println(missingNums(arr));
    }

     static List<Integer> missingNums(int[] arr) {

        int i=0;
        while(i< arr.length){

            int correct=arr[i]-1;
            if ( arr[i]!=arr[correct]){
                swapped(arr,i,correct);
            }else {
                i++;
            }
        }
         System.out.println(Arrays.toString(arr));
List<Integer> mis=new ArrayList<>();
        for (int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                mis.add(index+1);
            }
        }
        return mis;
    }

     static void swapped(int[] arr, int i, int correct) {
        int temp=0;
        temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }

}
