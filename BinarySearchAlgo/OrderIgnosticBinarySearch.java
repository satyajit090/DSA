package BinarySearchAlgo;


//Using bunch of code====lost of codes are repeate
public class OrderIgnosticBinarySearch {
    public static void main(String[] args) {

        int[] arr={7,59,41,22,47,77,2,4,9,6,8,74,22,58};
           int target= 58;
      arr=  sortingDesc(arr);
      for (int i=0;i<arr.length;i++){
          System.out.println(i+" = "+arr[i]);
      }

      int searchNum=binarySearch(arr,target);

        System.out.println(searchNum);

    }



    static int[] sortingDesc(int[] arr){

        int t=0;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){

                if(arr[i]<arr[j]){

                    t=arr[j];
                    arr[j]=arr[i];
                    arr[i]=t;
                }
            }
        }

        return arr;
    }

static int binarySearch(int[] arr, int target){

        int start=0;
        int end=arr.length-1;

        if(arr[start]<arr[end])
        {
            int as=asendendingArray(arr,target,start,end);
            return as;
        } else {

            int des=descendingArray(arr,target,start,end);
            return des;
        }

     }

     static int asendendingArray(int[] arr,int target,int start,int end){

        while(start<=end){
            int mid=start+(end-start)/2;

            if (target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }

        }
        return -1;
     }

     static int descendingArray(int[] arr,int target,int start,int end){

        while(start<=end){
            int mid=start+(end-start)/2;

            if (target>arr[mid]){
                end=mid-1;

            }
            else if (target<arr[mid]) {
                start=mid+1;

            }
            else{

                return mid;
            }
        }

        return -1;
     }


}
