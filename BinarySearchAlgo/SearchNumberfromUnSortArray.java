

package BinarySearchAlgo;

public class SearchNumberfromUnSortArray {

    public static void main(String[] args) {
      int[] arr={2,4,89,5,6,7,55,8,99,15,78,35,10};
     int[] rr= sorting(arr);

     int target=10;
      for (int i=0;i < rr.length;i++){
          System.out.println(rr[i]);
      }

      int num=binarySearch(rr,target);

        System.out.println("Searching index number "+num);


    }
    static int[] sorting( int[] arr){

        int t=0;
        for (int i=0;i< arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){

                if (arr[i]>arr[j]){
                    t=arr[j];
                    arr[j]=arr[i];
                    arr[i]=t;
                }

            }
        }
        return arr;
    }


    static int binarySearch(int[] rr,int target){

        int start=0;
        int end=rr.length-1;

        int mid=start+(end-start)/2;

        while(start<=end){

            if(target<rr[mid]){
                end=mid-1;
            }else if(rr[mid]>target) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }


}


