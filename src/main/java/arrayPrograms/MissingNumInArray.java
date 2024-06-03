package arrayPrograms;

public class MissingNumInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8,9};
        int n=9;
        int total=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            sum+=arr[i];
        }
        int num=total-sum;
        System.out.println(num);
    }
}
