package BinarySearchAlgo.LeetCode;

public class SearchInRotateArray {

    public static void main(String[] args) {

        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        int start=0;
        int end=arr.length-1;
        int pivot=findPivot(arr,start,end);

        if(pivot==-1){
           int binarySearc= binarySearch(arr,start,end,target);
            System.out.println(binarySearc);
        } if(arr[start]==target) {
            System.out.println(start);

        }  if (arr[start]<=target) {
            System.out.println(binarySearch(arr,start,pivot-1,target));
        }else {
            System.out.println(binarySearch(arr,pivot+1,end,target));
        }
    }

    static int findPivot(int[] arr,int start,int end){

        while(start<=end){
            
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            } else if (arr[mid-1]>arr[mid]) {
                return mid-1;
            } else if (arr[mid]<=arr[start]) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr,int start,int end,int target){

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]<target){
                start=mid+1;
            }else if (arr[mid]>target){
                end=mid-1;
            }else {
                return mid;
            }
        }

    return -1;
    }

}
