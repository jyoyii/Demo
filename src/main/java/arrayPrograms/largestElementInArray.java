package arrayPrograms;

public class largestElementInArray {
    static int largestElement(int[] arr, int n) {
        // Write your code here.
        //int[] arrObj=new int[n];
        int highestNum=0;
        for(int i=0;i<arr.length-1;i++){
            if(highestNum<arr[i]){
               highestNum=arr[i];
                //highestNum=Math.max(highestNum,arr[i+1]);
            }
        }
        System.out.println(highestNum);
        return highestNum;
    }

    public static void main(String[] args) {
        int n=5;
        int[] a={1,2,13,4,5};
        largestElement(a,n);
    }
}
