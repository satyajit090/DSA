package SortAlgo.InterviewLeetcode;

public class MissingNumberAMAZON {
    public static void main(String[] args) {

        int[] arr={3,4,5,2,1,0};
        int missingNumber=findMissingNumber(arr);
        System.out.println(missingNumber);
    }

    static int findMissingNumber(int[] arr) {

        int i=0;

        while(i<arr.length){


            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swapping(arr,i,correct);

            }
            else {
                i++;
            }
        }

        for (i=0;i<arr.length;i++){
            if (arr[i]!=i){
                return i;
            }
        }

        return arr.length;
    }

    static void swapping(int[] arr, int f, int s ) {
        int temp=0;
        temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
}
