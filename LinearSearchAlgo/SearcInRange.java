package LinearSearchAlgo;

public class SearcInRange {

    public static void main(String[] args) {
        int arr[]={1,3,87,6,5,6,7,88,6,65,54,84,4,7,444,90};

        int start=1;
        int end=10;
        int target=84;

        int k=range(arr,start,end,target);
        System.out.println(k);

    }

    static int range(int arr[],int start,int end,int target){



        if(arr.length==0)
        {
            return -1;
        }

        for (int index=start;index<=end;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
