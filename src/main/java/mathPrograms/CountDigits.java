package mathPrograms;

import java.util.Scanner;

public class CountDigits {
    public static void main(String []args){
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = sc.nextInt();
        while (n!=0){
            int ld=n%10;
            count+=1;
            n=n/10;
        }
        System.out.println(count);
    }
}
