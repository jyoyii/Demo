package stringPrograms;

public class ReverseAllWordsInAString {
    public static void main(String[] args) {
        String s1="Good Morning";
        String rev="";
        String words[]=s1.split("\\s");
        /*for (String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            rev+=sb.toString()+" ";
        }
        System.out.println(rev);*/

        for (String w1:words) {
            char[] ch=w1.toCharArray();
            for (int i = ch.length-1; i >=0 ; i--) {
                rev+=ch[i]+" ";
            }
        }
        System.out.println(rev);
    }
}
