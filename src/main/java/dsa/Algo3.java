package dsa;

import java.util.Scanner;

public class Algo3 {
    public static void main(String []args){
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        n = sc.nextInt();
        for(i=0; i<n;i++){
            for(j=0;j<=i;j++){

                System.out.print(j+1 + " ");

            }
            System.out.println();
        }
    }
}

/*
1
1 2
1 2 3
 */

