package dsa;

import java.util.Scanner;

public class Algo9 {
    public static void main(String[] args) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                //space
                System.out.print(" ");
            }
            for (j = 0; j < 2 * i + 1; j++) {
                //star
                System.out.print("*");
            }
            for (j = 0; j < n - i - 1; j++) {
                //space
                System.out.print(" ");
            }
            System.out.println();
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                //space
                System.out.print(" ");
            }
            for (j = 0; j <2*n -(2*i + 1); j++) {
                //star
                System.out.print("*");
            }
            for (j = 0; j < i; j++) {
                //space
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*
     *
    ***
   *****
  *******
 *********
 *********
  *******
   *****
    ***
     *
 */

