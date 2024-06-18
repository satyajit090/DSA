package LinearSearchAlgo;

import java.util.Arrays;

public class SearchInString {

    public static void main(String[] args) {

        String s="satyajitbehera";
         char k='j';
        boolean m=search2(s,k);

        System.out.println(m);
        System.out.println(Arrays.toString(s.toCharArray()));
    }

     static boolean search(String s,char k) {
        if (s.isEmpty()){
            return false;
        }
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(k==c){
                return true;
            }
        }
        return false;
    }
     static boolean search2(String s,char k){
        for(char m:s.toCharArray()){
            if (m==k){
                return true;
            }
        }
        return false;


     }


}
