package arrayPrograms;

import java.util.Arrays;

public class SecondLargestEleementArray {
    static int print2largest(int arr[], int n){
        int max=arr[0], smax=-1,tmax=0;
        for (int i = 1; i < n-1; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        //Second highest element in Array
        for(int i=0;i<n-1;i++){
            if(arr[i]<max && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(smax);
        //return smax;
        //Third highest Element in Array
        for(int i=0;i<n-1;i++){
            if(arr[i]<smax && arr[i]!=tmax){
                tmax=arr[i];
            }
        }
        System.out.println(tmax);
        return tmax;
    }

    public static void main(String[] args) {
        int arrayLength=5;
        int array[]={1,3,25,38,2};
        print2largest(array,arrayLength);
    }
}
