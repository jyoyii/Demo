package recursionPrograms;

public class PrintName5Times {
    static void printName(int i, int n){
        if(i>5) return;
        System.out.println("Name");
        printName(i+1,n);
    }
    public static void main(String[] args) {
        int n=5;
        printName(1,n);
    }
}
