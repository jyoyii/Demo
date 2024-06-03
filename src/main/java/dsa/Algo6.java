package dsa;

import java.util.Scanner;

public class Algo6 {
    public static void main(String []args){
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i+1;j++){

                System.out.print(j + " ");

            }

            System.out.println();
        }
    }
}

/*
 1 2 3
 1 2
 1
 */

