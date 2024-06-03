package arrayPrograms;

public class MaxConsecutivesInArray {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,1,1,1,0,1};
        int n=arr.length;
        int count=0,maxConsec=0;
        for (int i=0;i<n-1;i++){
            if(arr[i]==1){
                count++;
                maxConsec=Integer.max(maxConsec,count);
            }
            else count=0;
        }
        System.out.println(maxConsec);
    }
}
