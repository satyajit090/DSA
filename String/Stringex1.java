package String;

public class Stringex1 {
    public static void main(String[] args) {
        String s="";
        int i=0;
        while (i<26){
            char c= (char)('a'+i);

            //System.out.println(c);
            s+=c;
            i++;
        }
        System.out.println(s);
    }
}
