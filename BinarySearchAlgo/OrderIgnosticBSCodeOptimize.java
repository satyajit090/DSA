package BinarySearchAlgo;

public class OrderIgnosticBSCodeOptimize {

    public static void main(String[] args) {
        int[] arr = {40, 34, 32, 29, 28, 24, 23, 22, 20, 18, 15, 12, 11, 10, 9, 5, 3, 2};

        int target = 10;
        int num=binarySearch(arr, target);
        System.out.println(num);
    }
    static int binarySearch(int[] arr,int target){

        int start=0;
        int end=arr.length-1;
        boolean isAsc= arr[start]<arr[end];
        while(start<=end){
           int mid=start+(end-start)/2;
           if(target==arr[mid]){
               return mid;
           }
           if (isAsc){
               if (target<arr[mid]){
                   end=mid-1;
               }else{
                   start=mid+1;
               }
           }else{
               if(target<arr[mid]){
                   start=mid+1;
               }else{
                   end=mid-1;
               }
           }
        }
        return -1;
    }
}
