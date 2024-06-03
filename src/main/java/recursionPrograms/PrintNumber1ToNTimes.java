package recursionPrograms;

public class PrintNumber1ToNTimes {
    static void f(int i,int n){
        if(i>n) return;;
        System.out.println(i);
        f(i+1,n);
    }
    public static void main(String[] args) {
    int n=100;
        System.out.println(n);
        f(1,n);
    }
}
