package LinearSearchAlgo.LeetCodeAssignment;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] arr={

                {2,8,7},{7,1,3},{1,9,5}
        };

        int total=maxValue(arr);

        System.out.println(total);
    }

static int maxValue(int[][] arr){

int max=0;

        for (int row=0;row<arr.length;row++){

            int sum=0;

            for (int col=0;col<arr[row].length;col++){

                sum=sum+arr[row][col];

            }
            if(sum>max){

                max=sum;
            }
        }
        return max;
    }
}
