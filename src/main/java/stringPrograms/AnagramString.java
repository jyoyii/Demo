package stringPrograms;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "Silent";
        String s2 = "Listen";
        char[] chs1 = s1.toLowerCase().toCharArray();
        char[] chs2 = s2.toLowerCase().toCharArray();
        /*if (s1.length()!=s2.length()){
            System.out.println("not anagram");
        }
        Arrays.sort(chs1);
        Arrays.sort(chs2);
        if(Arrays.equals(chs1,chs2)==true){
            System.out.println("anagram");
        }*/
        if (s1.length() != s2.length())
            System.out.println("not anagram");
        else
        {
            for (int i = 0; i < chs1.length; i++) {
                for (int j = i+1; j <chs2.length ; j++) {
                    if(chs1[i]>chs2[j]){

                    }
                }
            } 
        }
    }
}