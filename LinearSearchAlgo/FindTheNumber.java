package LinearSearchAlgo;

public class FindTheNumber {

    public static void main(String[] args) {


        int arr[] = {1, 14, 52, 41, 7, 1, 41, 4, 1, 4, 1, 43, 1, 2, 4, 42, 9, 6, 5, 8, 8, 855, 5, 5, 5, 555, 143};

        int k = 855;

        // one way to searching element
        /*for (int j : arr) {
            if (j == k) {
                System.out.println("found the match value" + j);
                break;
            }

        }*/


        int l=linearSearch(arr,k);
        System.out.println(l);

    }
        static int linearSearch (int arr[],int k) {

        if(arr.length==0)
        {
            return -1;
        }

        for (int i=0;i<arr.length;i++){
            if (arr[i]==k){
                return i;
            }
        }



            return -1;
        }


}
