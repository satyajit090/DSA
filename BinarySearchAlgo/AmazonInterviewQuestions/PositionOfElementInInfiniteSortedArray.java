package BinarySearchAlgo.AmazonInterviewQuestions;

public class PositionOfElementInInfiniteSortedArray {

    public static void main(String[] args) {
        int[] arr={12,54,59,60,63,69,74,75,76,79,89,90,95,96,98,100,101,103,106};
        int target =75;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){

        int start=0;
        int end=1;

        while(target>arr[end]){

            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
int ansIndex=binarySearch(arr,target,start,end);
        return ansIndex;
    }

    static int binarySearch(int[] arr,int target,int start,int end){

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
