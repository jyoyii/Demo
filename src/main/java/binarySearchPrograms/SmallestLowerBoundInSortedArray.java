package binarySearchPrograms;

public class SmallestLowerBoundInSortedArray {
    public static int lowerBound(int []arr, int n, int x) {
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 9;
        int ind = lowerBound(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }
}
