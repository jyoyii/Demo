package binarySearchPrograms;

public class BSToFindXInSortedArray {
    static int bsFunc(int[] arr,int arrSize, int target){
        int low=0, high=arrSize-1,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target) {
                System.out.println(mid);
                return mid;
            } else if (target>arr[mid]) {
                low=mid+1;
            }else high=mid-1;
        }
        System.out.println(-1);
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,3,4,6,10,14,18,23};
        int n=a.length;
        int t = 11;
        bsFunc(a,n,t);
    }
}
