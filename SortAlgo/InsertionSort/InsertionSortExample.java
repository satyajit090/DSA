package SortAlgo.InsertionSort;
import java.util.Arrays;

public class InsertionSortExample {
    public static void main(String[] args) {

        int[] arr={5,2,6,3,9,7,1,4,8};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    static int[] insertionSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if (arr[j-1]>arr[j])
                {
                    swappped(arr,j,j-1);
                }
                else {

                    break;
                }
            }
        }
return arr;
    }

    static void swappped(int[] arr, int j, int i) {

        int temp=0;
        temp=arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
    }
}
