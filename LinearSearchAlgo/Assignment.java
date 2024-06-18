package LinearSearchAlgo;

public class Assignment {

    public static void main(String[] args) {
        int[] arr={5,82,6,75,2,25,93,74,22};

        int third=highest(arr);

        System.out.println(third);
    }

    static int highest(int[] arr){
        int t=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    t=arr[j];
                    arr[j]=arr[i];
                    arr[i]=t;
                }

            }
        }

        return arr[2];
    }


}
