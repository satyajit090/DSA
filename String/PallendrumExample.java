package String;

public class PallendrumExample {
    public static void main(String[] args) {

        String s="abcdcb";

       boolean b=pallendrum(s);
        System.out.println("Pallendrum is " +b);
    }
    static boolean pallendrum(String s){
        int i=0;
        while(i<s.length()/2){
            char f=s.charAt(i);
            char l=s.charAt(s.length()-1-i);

            if(f!=l){
                return false;
            }
            i++;
        }
      return true;
    }
}
