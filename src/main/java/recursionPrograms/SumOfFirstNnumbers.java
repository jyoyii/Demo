package recursionPrograms;

public class SumOfFirstNnumbers {
    static void func(int i,int sum){
        if(i<1) {
            System.out.println(sum);
            return;
        }
        //System.out.println(i);
        func(i-1,sum+i);
    }
    public static void main(String[] args) {
        int n=5;
        func(n,0);

    }
}
