package BinarySearchAlgo.LeetCode;

public class SearchRepeatArrtayrotationArray {

    public static void main(String[] args) {
        int[] arr={2,2,9,2,2,2};
        int target=2;

        System.out.println(findPivot(arr));

    }
    static int findPivot(int[] arr){

        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                return mid;
            } else if (arr[mid]<arr[mid-1]) {
                return mid-1;

            } else if (arr[mid]==arr[start] &&arr[mid]==arr[end] ) {
                if (arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if (arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;

            } else if (arr[start]<arr[mid]|| (arr[start]==arr[mid] && arr[mid]>arr[end])) {
                start=mid+1;
            } else if (arr[start]>arr[mid]||(arr[start]==arr[mid] && arr[mid]<arr[end])) {
                end=mid-1;
            }
        }


        return -1;
    }
}
