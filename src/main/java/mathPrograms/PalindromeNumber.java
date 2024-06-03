package mathPrograms;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n=121, ld, revN=0;
        int dup=n;
        while (n!=0){
            ld = n % 10;
            revN = (revN * 10) + ld;
            n=n/10;
        }
        System.out.println(revN);

        if(revN==dup){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
