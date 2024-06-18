package LinearSearchAlgo.LeetCodeAssignment;


//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1285192492/
public class FindEvenNumDigit {
    public static void main(String[] args) {

        int arr[]={1425,25792,73145,25,84,8,8888,99,3336,78962};

        int evenCount=evenFind(arr);

        System.out.println(evenCount);

    }

    static int evenFind(int arr[])
    {
        int evenNum=0;
        for (int i=0;i<arr.length;i++){
            int k=arr[i];
            if(even(k)){
                evenNum++;
            }
        }

        return evenNum;
    }


    static boolean even(int k){
        int count=0;
        while (k>0){
            k=k/10;
            count++;
        }

        if (count%2==0){
            return true;
        }
         else {
            return false;
        }
    }
}
