package arrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class HighestAndLowestFrequencyElement {
    public static void main(String[] args) {
        int array[]={1,2,3,6,3,1,2,1};
        int n=array.length;
        frequencyFunc(array,n);
    }
    static void frequencyFunc(int a[],int n){
        Map<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(hm.containsKey(a[i])){
                hm.put(a[i],hm.get(a[i])+1);
            }else {
                hm.put(a[i], 1);
            }
        }
        System.out.println(hm);
        int maxFrequency=0,minFrequency=n;
        int maxElement=0, minElement=0;
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();
            if(count>maxFrequency){
                maxElement=element;
                maxFrequency=count;
            }
            if(count<minFrequency){
                minElement=element;
                minFrequency=count;
            }
        }
        System.out.println("Highest frequency Element: " +maxElement);
        System.out.println("Lowest frequency Element: " +minElement);
    }
}
