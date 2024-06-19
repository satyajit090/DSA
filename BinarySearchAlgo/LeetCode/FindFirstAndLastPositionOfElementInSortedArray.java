package BinarySearchAlgo.LeetCode;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};

        int target = 8;
        int[] krr = searchRange( nums,  target);

        System.out.println(krr[0]+"   "+krr[1]);

    }
    public static int[] searchRange(int[] nums, int target){

        int[] krr={-1,-1};
         krr[0]=firstndexSearch(nums,target,true);
         krr[1]=firstndexSearch(nums,target,false);

         return krr;
    }

    static int firstndexSearch(int[] nums, int target, boolean b) {

        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if (target<nums[mid]){
                end=mid-1;
            } else if (target>nums[mid]) {
                start=mid+1;

            }else{
                ans=mid;
                if(b){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }

        return ans;
    }
}
