package BinarySearchAlgo.TwoD_MatrixArray;

import java.util.Arrays;

public class RowsColumnMatrixExp2EfficiencyWay {

    public static void main(String[] args) {

        int[][] matrix ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}

        };
        int target=6;


        System.out.println(Arrays.toString(search(matrix,target)));
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd,int target){

        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if (matrix[row][mid]==target){
                return new int[]{row,mid};
            } else if (matrix[row][mid]>target) {
                cEnd=mid-1;
                
            } else if (matrix[row][mid]<target) {
                cStart=mid+1;
            }
        }

        return new int[]{-1,-1};
    }


    static int[] search(int[][] matrix,int target){

       int row= matrix.length;
       int column= matrix[0].length;

       if(row==1){
           return binarySearch(matrix,0,0,column-1,target);
       }

       int rStart=0;
       int rEnd=row-1;
       int cMid=column/2;

       while(rStart<(rEnd-1)){

           int mid=rStart+(rEnd-rStart)/2;

           if (matrix[mid][cMid]==target){
               return new int[]{mid,cMid};
           } else if (matrix[mid][cMid]>target) {
               rEnd=mid;
           } else if (matrix[mid][cMid]<target) {
               rStart=mid;
           }

       }
       //now we check two rows
        //check whether the target is in the column of two rows

        if (matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        } else if (matrix[rStart+1][cMid]==target) {
            return new int[]{rStart+1,cMid};
        }

        //search in 1st half
        if( target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix, rStart, 0,cMid-1,target );
        }
        //search in 2nd half
        if(target>=matrix[rStart][cMid+1]  && target <= matrix[rStart][column - 1]){
            return binarySearch(matrix,rStart,cMid+1,column-1,target);
        }
        //search in 3rd half
        if (target<=matrix[rStart+1][cMid-1]){
           return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        //search in 4th half
        if(target>=matrix[rStart+1][cMid+1])
        {
            return binarySearch(matrix,rStart+1,cMid+1,column-1,target);

        }

          return new int[]{-1,-1};
    }
}
