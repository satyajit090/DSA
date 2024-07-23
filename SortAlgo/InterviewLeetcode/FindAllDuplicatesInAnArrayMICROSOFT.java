package SortAlgo.InterviewLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInAnArrayMICROSOFT {

    public static void main(String[] args) {
        int[] arr={1};

        List<Integer> find=findalldup( arr);
        System.out.println(find);
    }

    static List<Integer> findalldup(int[] arr) {

        int i=0;
        while (i<arr.length){

            int clear=arr[i]-1;
            if(arr[i]!=arr[clear]){
                swapped(arr,i,clear);
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        List<Integer> mis=new ArrayList<>();
        for (int index=0;index<arr.length;index++){
            if (arr[index]!=index+1){
                mis.add(arr[index]);
            }
        }
        return mis;
    }

     static void swapped(int[] arr, int i, int clear) {

        int temp=0;
        temp=arr[i];
        arr[i]=arr[clear];
        arr[clear]=temp;
    }
}
