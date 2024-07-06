package BinarySearchAlgo;

public class RotationCountArray
{
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,10,1,2,3,4};

        int rotation=rotationCount(arr);
        System.out.println(rotation+1);
    }

    static int rotationCount(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                return mid;
            } else if (arr[mid-1]>arr[mid]) {

                return mid-1;
            } else if (arr[start]<arr[mid]) {
                start=mid+1;
            } else if (arr[start]>=arr[mid]) {
                end=mid-1;
            }
        }

        return -1;
    }
}
