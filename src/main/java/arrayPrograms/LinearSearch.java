package arrayPrograms;

public class LinearSearch {
    static int linearSearchFunc(int[] arr,int num, int size){
        for (int i = 0; i < size; i++) {
            if(arr[i]==num) {
                System.out.println(1);
                return 1;
            }
        }
        System.out.println(-1);
        return -1;
    }
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        int n=1;
        int arrSize=ar.length;
        linearSearchFunc(ar,n, arrSize);
    }
}
