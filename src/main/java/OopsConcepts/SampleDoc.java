package OopsConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SampleDoc {
    public static void main(String[] args) {
//        List<Employee> list=new ArrayList<>();
//        list.add(new Employee("Jyo",11));
//        list.add(new Employee("Nilu", 2));
//        list.add(new Employee("Sayoni",6));
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(6);
        //String[] s= (String[]) list.toArray();\
//        System.out.println("Before Sorting" +list);
//        Collections.sort(list);
//        System.out.println("After Sorting" +list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer m:list) {
            System.out.println(m);
        }

        Iterator<Integer> iteratorVar = list.iterator();
        while (iteratorVar.hasNext()){
            System.out.println(iteratorVar.next());
        }

    }
}
