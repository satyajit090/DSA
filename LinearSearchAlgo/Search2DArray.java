package LinearSearchAlgo;

import java.util.Arrays;

public class Search2DArray {

    public static void main(String[] args) {

        int[][] arr={{ 1,99,5,66,9,2,8,5},
                    {4,5,3,77,6,99},
                    {2,55,4,8,33,}};


        int target=77;
        int[] s=search(arr,target);
        System.out.println(Arrays.toString(s));

    }
    static int[] search(int arr[][],int target){

        for (int row=0;row<arr.length;row++){
            for (int column=0;column<arr[row].length;column++){
                if (arr[row][column]==target){
                    return new int[]{row,column};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
