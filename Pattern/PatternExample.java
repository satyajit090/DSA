package Pattern;

public class PatternExample {
    public static void main(String[] args) {

        int n=4;
        pattern1(n);
        System.out.println();
        pattern2(n);
        System.out.println();
        pattern3(n);
        System.out.println();
        pattern4(n);
        System.out.println();
        pattern5(n);
        System.out.println();
        pattern28(n);
        System.out.println();
        pattern30(n);
        System.out.println();
        pattern17(n);
        System.out.println();
        pattern31(n);
    }
    static void pattern1(int n){

        for (int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){

        for (int row=0;row<n;row++){
            for(int col=0;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){

        for (int row=0;row<n;row++){
            for (int col=0;col<n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){

        for (int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row=0;row<=2*n;row++){
            int totalColumnInRow=n<=row?2*n-row:row;
            for (int col=0;col<totalColumnInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){

        for (int row=0;row<2*n;row++){
            int totalColumnInRow=n<=row?2*n-row:row;
            int space=n-totalColumnInRow;
            for(int i=0;i<space;i++){
                System.out.print(" ");
            }
            for (int col=0;col<totalColumnInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for (int row=1;row<=n;row++){
            int space=n-row;
            for (int i=0;i<space;i++ ){
                System.out.print("  ");
            }
            for (int col=row;col>=1;col--){
                System.out.print(col+ " ");
            }
            for (int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){

        for (int row=1;row<=2*n;row++){
            int totalColumnInRow=n<row?(2*n)-row:row;

            for (int space=0;space <n-totalColumnInRow;space++){
                System.out.print("  ");
            }

            for (int col=totalColumnInRow;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=totalColumnInRow;col++){
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }

    static void pattern31(int n){
        int m=n;
         n=2*n-1;
        for (int row=0;row<=n;row++){
            for (int col=0;col<=n;col++){
                int InEveryIndex=m-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(InEveryIndex+" ");
            }
            System.out.println();

        }
    }
}
