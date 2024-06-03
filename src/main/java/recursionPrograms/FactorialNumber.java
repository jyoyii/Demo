package recursionPrograms;

public class FactorialNumber {
/*    static void fact(int i, int factorial){
        if(i<1){
        System.out.println(factorial);
        return;
        }
        fact(i-1,factorial*i);
    }
    public static void main(String[] args) {
        int n=3;
        fact(n,1);
    }
}
*/

    static int fact(int n) {
        if (n==1) return 1;
    return n*fact(n-1);
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(fact(n));
        //return 1;
    }
}
/*
    public static void main(String args[]){
        int number,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        number=sc.nextInt();
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }

 */