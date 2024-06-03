package arrayPrograms;

public class RotateArrayByD {
    static void reverseArray(int[] a,int start, int end){
        while(start<=end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }

    static void rotateLeft(int[] array,int arrayLength,int shift){
        reverseArray(array,0,shift-1);
        reverseArray(array,shift,arrayLength-1);
        reverseArray(array,0,arrayLength-1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int k=2;
        rotateLeft(arr,n,k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
