package arrayPrograms;

import static org.apache.commons.lang3.ArrayUtils.swap;

public class MoveZerosToEnd {
    static int[] moveZeros(int[] a, int s){
        int j=-1;
        for (int i = 0; i < s; i++) {
            if (a[i]==0){
                j=i;
                break;
            }
        }
        if (j==-1) return a;
        for (int i = j+1; i < s; i++) {
            if (a[i]!=0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    return a;
    }
    public static void main(String[] args) {
        int[] arr={1,3,0,4,0,0};
        int n=arr.length;
        int[] ans=moveZeros(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
