package LinearSearchAlgo;

public class FindMaxNumber2D {

    public static void main(String[] args) {

        int[][] arr={
                {1,3,5,77,66,8,7,8,7,37,82,9,88,8},
                {44,78,58,54,77,33,77,1,2,42,5,5,83,22,2,55,8},
                {78,224},
                {98,25,33,77,55,38}
                    };

        int m=maxNum(arr);
        System.out.println(m);
        int n=minMum(arr);

        System.out.println(n);

    }

     static int maxNum(int[][] arr) {

        int max=Integer.MIN_VALUE;

        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if (arr[row][col]>max){

                    max=arr[row][col];
                }
            }
        }
         return max;
     }


     static int minMum(int[][] arr){
        int n=Integer.MAX_VALUE;
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if(arr[row][col]<n){
                    n=arr[row][col];
                }
            }
        }
        return n;
     }

}
