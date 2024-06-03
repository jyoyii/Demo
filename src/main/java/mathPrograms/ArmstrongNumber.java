package mathPrograms;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=987;
        int ld,sum=0;
        int dup=n;
        while (n>0){
            ld=n%10;
            sum=sum+(ld*ld*ld);
            n=n/10;
        }
        System.out.println(sum);
        if(sum==dup){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
