package dsa;

import java.util.Scanner;

public class Algo4 {
    public static void main(String []args){
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        n = sc.nextInt();
        for(i=0; i<n;i++){
            for(j=0;j<=i;j++){

                System.out.print(i+1 + " ");

            }

            System.out.println();
        }
    }
}

/*
1
2 2
3 3 3
 */




