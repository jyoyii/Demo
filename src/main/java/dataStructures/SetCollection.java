package dataStructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String []args){
        //unordered set of elements,no duplicates allowed to store, can store only 1 null value
    //HashSet - uses hashtable for storage,unique elements only,allows 1 null value, non synchronised,elements inserted on their hashcode basis
        Set<String> hashset=new HashSet<String>();
        hashset.add("i");
        hashset.add("love");
        System.out.println(hashset);
    //LinkedHashSet - maintains insertion order and permits null elements,non synchronised, maintains insertion order
        Set<String> linkedhashset=new LinkedHashSet<String>();
        linkedhashset.add("03");
        linkedhashset.add("April");
        linkedhashset.add("1994");
        System.out.println(linkedhashset);
    //TreeSet - uses tree for storage,sorted in ascending order,unique elements only, no null element,non synchronized
        Set<Integer> treeset=new TreeSet<Integer>();
        treeset.add(10);
        treeset.add(9);
        System.out.println(treeset);
    }
}
