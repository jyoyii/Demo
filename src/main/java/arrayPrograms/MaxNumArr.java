package arrayPrograms;

import java.util.Arrays;

public class MaxNumArr {
    public static void main(String[] args) {
        /*int a[]={1,4,7,9,11,13};
        int ma=0;
        int max2=0;
        for (int i = 0; i <= a.length-1; i++) {
            max2=ma;
            if (a[i] > ma) {
                ma=a[i];
            }
        }
        //max num
        System.out.println(ma);
        System.out.println(max2);*/
        int arr[]={1,2,4,7,9,5};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
            if (arr[i] > max) {
                max = arr[i];
            }
        //max value
        System.out.println("Max value is:" +" " +max);

        int secondMax;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    secondMax=arr[i];
                    arr[i]=arr[j];
                    arr[j]=secondMax;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        //second max value in array
        System.out.println("second Max:" +arr[arr.length-2]);
        int min=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        //min value
        // System.out.println("Min value is: " +min);
        int secondMin;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    secondMin=arr[i];
                    arr[i]=arr[j];
                    arr[j]=secondMin;
                }
            }
        }
        //second  min value
        //System.out.println("second Min value: " +arr[arr.length-2]);







    }
}
