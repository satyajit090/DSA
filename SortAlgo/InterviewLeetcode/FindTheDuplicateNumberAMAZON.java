package SortAlgo.InterviewLeetcode;

public class FindTheDuplicateNumberAMAZON {
    public static void main(String[] args) {

        int[] arr={3,1,3,4,2};

        System.out.println(findDuplicate(arr));
    }

     static int findDuplicate(int[] arr) {

        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swapped(arr,i,correct);
            }else {
                i++;
            }
        }

         return arr[arr.length-1];
     }
     static void swapped(int[] arr,int first,int second){

        int temp=0;
        temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
     }

}
