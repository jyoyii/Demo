package stringPrograms;

public class ReverseWordsInaString {
    public static String reverseWords(String s) {
        String[] st=s.split("\\s");
        String str = "";
        int n=st.length;
        for (int i = n-1; i >=0 ; i--) {
            str=str+st[i]+" ";
        }
        System.out.print(str.trim());
        return str.trim();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        reverseWords(s);
    }
}
