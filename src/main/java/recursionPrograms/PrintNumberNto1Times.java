package recursionPrograms;

public class PrintNumberNto1Times {
    static void func(int i, int n){
        if(i<1) return;
        System.out.println(i);
        func(i-1,n);
    }
    public static void main(String[] args) {
        int n=100;
        //System.out.println(n);
        func(n,n);
    }
}
