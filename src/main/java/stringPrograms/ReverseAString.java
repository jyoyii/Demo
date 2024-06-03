package stringPrograms;

import java.sql.SQLOutput;

public class ReverseAString {
    public static void main(String[] args) {
        String str="India";
        String temp = "";
        char[] ch=str.toCharArray();
        for (int i = ch.length-1; i >=0; i--) {
            temp+=ch[i];
        }
        System.out.print(temp);
    }
}
