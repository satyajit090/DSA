package BinarySearchAlgo.TwoD_MatrixArray;

import java.util.Arrays;

public class RowsColumnMatrixExp2EfficiencyWay1 {

    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int target=6;

        System.out.println(Arrays.toString(search(matrix,target)));
    }
    static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){

        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if (matrix[row][mid]==target){
                return new int[]{row,mid};
            } else if (matrix[row][mid]<target) {
                cStart=mid+1;
            } else if (matrix[row][mid]>target) {
                cEnd=mid-1;
            }

        }
         return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix,int target){

        int row= matrix.length;
        int column=matrix[0].length;

        if(row==1){
            return binarySearch(matrix,0,0,column-1,target);
        }

        int rStart=0;
        int rEnd= matrix.length-1;
        int cMid=column/2;

        while(rStart<(rEnd-1)){
            int rMid=rStart+(rEnd-rStart)/2;
            if(matrix[rMid][cMid]==target){
                return new int[]{rMid,cMid};
            } else if (matrix[rMid][cMid]>target) {

                rEnd=rMid;
            } else if (matrix[rMid][cMid]<target) {
                rStart=rMid;
            }
        }
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }if (matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

        //1st half
        if (target<=matrix[rStart][cMid]){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        //2nd half
        if (target>=matrix[rStart][cMid] && target<=matrix[rStart][column-1] ){
            return binarySearch(matrix,rStart,cMid+1,column-1,target);
        }
        //3rd half
        if(target<=matrix[rStart+1][cMid]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        //4th half
        if (target>=matrix[rStart][cMid]){
            return binarySearch(matrix,rStart+1,cMid+1,column-1,target);
        }

        return new int[]{-1,-1};
    }
}
