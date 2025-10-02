package Leetcode202;
public class HappyNumber {
    public static void main(String[] args) {

        int x=19;
        boolean happy=isHappy(19);
        System.out.println(happy);
    }

    private static boolean isHappy(int n) {
        int fast=n;
        int slow=n;

        do {
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(slow != fast);

        if(slow==1){
            return true;
        }
        return false;
    }

    private static int findSquare(int number){

        int ans=0;
        while(number>0){
            int rem=number %10;
            ans+=rem * rem;
            number /=10;
        }
        return ans;
    }
}
