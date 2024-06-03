package stringPrograms;

public class SortAString {
    public static void main(String[] args) {
        String s="Hello God's World";
        String temp[]=s.split("\\s");
        String rev="";
        for (int i =temp.length-1; i >=0 ; i--) {
            rev+=temp[i]+" ";
        }
        System.out.println(rev);
    }
}
