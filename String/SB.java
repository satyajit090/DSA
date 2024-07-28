package String;

public class SB {
    public static void main(String[] args) {

        StringBuilder builder=new StringBuilder();
        int i=0;
        while (i<26){
            char c= (char)('a'+i);

            //System.out.println(c);
            builder.append(c);
            i++;
        }
        System.out.println(builder);
    }
}
