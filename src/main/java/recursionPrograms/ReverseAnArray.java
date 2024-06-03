package recursionPrograms;

public class ReverseAnArray {
    static void revArray(int[] arr,int arrLength){
        int[] arrObj=new int[arrLength];
        for (int i=arrLength-1; i >=0 ; i--) {
            arrObj[arrLength-i-1]=arr[i];
        }
        printRevArray(arrObj,arrLength);
    }

    static void printRevArray(int[] a,int s){
        System.out.println("Reversed Array:");
        for (int i = 0; i < s; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int n=a.length;
        revArray(a,n);
    }


}
