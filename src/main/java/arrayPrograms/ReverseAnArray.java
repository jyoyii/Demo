package arrayPrograms;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int a[]={1,2,1,23,25}; //-> 1 2 25 23 1
        int n=a.length;
        //swapping 2 elements
        int temp= a[2];
        a[2]=a[4];
        a[4]=temp;
        System.out.println(Arrays.toString(a));
        //reverse
        for (int i=0;i<n/2;i++) {
            int count= a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=count;
        }
        System.out.print(Arrays.toString(a));
    }
}
