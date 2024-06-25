

package BinarySearchAlgo.LeetCode;

//https://leetcode.com/problems/find-in-mountain-array/
//

public class FindInMountainArray {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,3,1};
        int target=3;

       int peak= peakIndex(arr,target);

       int ascOrder = ascendingBS(arr,peak,target);//peak use as end index value
        if (ascOrder!=-1){
            System.out.println(ascOrder);
        }else {
            int desOrder = descendingBS(arr, peak, target); //peak use as start index value
            System.out.println(desOrder);

        }
    }

    static int peakIndex(int[] arr,  int target){

        int start=0;
        int end=arr.length-1;

        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }

        }
        return start;
    }

    static int ascendingBS(int[] arr, int end,int target){
        int start=0;

        while (start<=end){

            int mid=start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    static int descendingBS(int[] arr,int start,int target){

        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (target<arr[mid]){
                start=mid+1;
            } else if (target>arr[mid]) {
                end=mid-1;
            }else {
                return mid;
            }

        }
        return -1;
    }
}
