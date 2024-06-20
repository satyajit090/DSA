package BinarySearchAlgo.LeetCode;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakIndexInMountainArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,6,7,8,5,6,3,2,1};
        System.out.println(peakIndex(arr));
    }
    static int peakIndex(int[] arr){

        int start=0;
        int end=arr.length-1;

        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            } else if (arr[mid]>arr[mid+1]) {

                end=mid;

            }
        }
        return start;
    }
}
