


package BinarySearchAlgo.interviewQuestions;

public class CeilingOfNumberUsingBS2 {

    public static void main(String[] args) {

        int[] arr={1,10,11,12,13,15,16,17};
        int target=14;
        int ceilingNum=ceilingNum(arr,target);

        System.out.println(ceilingNum);
    }

    
    static int ceilingNum(int[] arr,int target){

        int start=0;
        int end=arr.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;

            }else{
                return mid;
            }
        }
        return start;
    }

}
