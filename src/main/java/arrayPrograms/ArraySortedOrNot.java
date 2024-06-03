package arrayPrograms;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,2,33,4,5};
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            if(arr[i+1]>=arr[i]){
            }
            else {
                System.out.println("false");
            }
        }
        System.out.println("true");
    }
}
