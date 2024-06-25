
package BinarySearchAlgo.LeetCode;

//https://leetcode.com/problems/find-peak-element/description/
public class FindPeakElement {

    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,6,4};

       int ans=findPeakElement(arr);
        System.out.println(ans);
    }
    static int findPeakElement(int[] arr){

        int start=0;
        int end=arr.length-1;

        while(start<end){

            int mid=start+(end-start)/2;

            if (arr[mid]<arr[mid+1]){
                start=mid+1;
            } else if (arr[mid]>arr[mid+1]) {
                end=mid;
            }
        }
        return start;
    }
}
