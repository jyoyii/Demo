package stringPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class DistinctCharsInTwoStrings {
    public static void main(String[] args) {
        String s1="jyothsna";
        String s2="maddala";
        String temp="";
        for (int i = 0; i < s1.length(); i++) {
            String sc1=Character.toString(s1.charAt(i));
            if (!s2.contains(sc1)){
                temp+=sc1;
            }
        }
        for (int j = 0; j < s2.length(); j++) {
            String sc2=Character.toString(s2.charAt(j));
            if (!s1.contains(sc2)){
                temp+=sc2;
            }
        }
        ArrayList<Character> al=new ArrayList<Character>();
        for (int i = 0; i < temp.length(); i++) {
            if (!al.contains(temp.charAt(i))) {
                al.add(temp.charAt(i));
            }
        }
        Collections.sort(al);
        String res="";
        for (int i = 0; i < al.size(); i++) {
            res+=al.get(i);
        }
        if(res==""){
            System.out.println(-1);
        }
        System.out.println(res);
    }
}
