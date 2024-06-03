package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {
    public static void main(String[] args) {
        String str1="Hello World";
        char ch[]=str1.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for (char ch1:ch) {
            if (hm.containsKey(ch1)) {
                hm.put(ch1,hm.get(ch1)+1);
            }
            else {
                hm.put(ch1,1);
            }
        }
        //System.out.println(hm);
        //Duplicate character in a string
        for (Map.Entry<Character,Integer> entry:hm.entrySet())
        {
            if(entry.getValue()>1)
                System.out.println(entry.getKey()+" occurs"+entry.getValue());
        }

/*
        Set<Character> duplicateValues=hm.keySet();
        for(char ch2:duplicateValues){
            if(hm.get(ch2)>1){
                System.out.println(ch2+" is"+hm.get(ch2));
            }
        }
        //Distinct character in a string
        for (char ch3:duplicateValues){
            if(hm.get(ch3)<=1){
                System.out.print(ch3);
            }
        }
*/
    }
}
