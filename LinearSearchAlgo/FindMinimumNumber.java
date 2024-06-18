package LinearSearchAlgo;

public class FindMinimumNumber {
    public static void main(String[] args) {
        int arr[]={5,8,3,6,8,7,25,8,2,-7,4,7,5,7,4,8,55,55,98};

        System.out.println(findMin(arr));
    }

    static int findMin(int arr[]){

        int min=arr[0];

        for(int index=1;index<arr.length;index++){

            if (arr[index]<min){
                min=arr[index];
            }
        }
        return min;
    }
}
