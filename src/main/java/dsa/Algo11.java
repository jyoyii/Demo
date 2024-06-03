package dsa;

import java.util.Scanner;

public class Algo11 {
    public static void main(String[] args) {
        int i, j, n, x=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:");
        n = sc.nextInt();

        for(i=0;i<n;i++){
            if(i%2==0) x=1;
            else x=0;
            for(j=0;j<=i;j++){
                System.out.print(x);
                x=1-x;
            }
            System.out.println();
        }
    }
}

/*
1
01
101
01
1
 */

