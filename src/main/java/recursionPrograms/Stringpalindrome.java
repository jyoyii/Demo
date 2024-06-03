package recursionPrograms;

public class Stringpalindrome {

    public static void main(String[] args) {
        String str="help";
        String temp="";
        char[] ch=str.toCharArray();
        for(int i=ch.length-1;i>=0;i--) {
            temp+=ch[i];
        }
        System.out.println(temp);
        if(temp==str){
            System.out.println(str +" is a palindrome");
        }
        else {
            System.out.println(str +" is not a palindrome");
        }
    }
}
