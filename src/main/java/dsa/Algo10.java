package dsa;

import java.util.Scanner;

public class Algo10 {
    public static void main(String[] args) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:");
        n = sc.nextInt();
        for(i=0;i<n;i++) {
            for (j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=0;i<n;i++){
            for(j=n-1;j>i;j--){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
*
**
***
**
*
 */
