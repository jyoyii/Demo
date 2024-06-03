package dataStructures;

import java.util.*;

public class ListCollection {
    public static void main(String []args){
        //ArrayList - dynamic array for sorting,duplicate elements allowed,insertion order & non synchronised
        ArrayList <String> arr=new ArrayList<String>();
        arr.add("Nilu");
        arr.add("Jyoi");
        arr.add("7");
        arr.add("Apple");
        arr.remove(1);
        arr.set(1,"Good");
        System.out.println("ArrayList"+arr);
        Collections.sort(arr);
        System.out.println(arr.size());
        System.out.println("-------------------------------");
        //LinkedList
        LinkedList <Integer> ll=new LinkedList<Integer>();
        ll.add(1);
        ll.add(7);
        System.out.println("lionkedlist"+ll);
        System.out.println("-------------------------------");
        //vector
        Vector<String> v=new Vector<String>();
        v.add("Hi");
        v.add("vector");
        System.out.println("Vector"+v);
        System.out.println("-------------------------------");
        //Stack
        Stack<Integer> s=new Stack<Integer>();
        s.add(10);
        s.add(999);
        System.out.println("Stack"+s);
        System.out.println("-------------------------------");
        //Converting Array to List
        String[] strArr={"Hi","2024","Year"};
        System.out.println("Array is:" +Arrays.toString(strArr));
        List<String> list=new ArrayList<String>();
        for (String language:strArr) {
            list.add(language);
        }
        System.out.println(list);
        System.out.println("-------------------------------");
        //Converting list to Array
        list.add("hehe");
        list.add("haha");
        Collections.sort(list);
        System.out.println(list);
        //traversing list
        for (String smile:list) {
            System.out.println(smile);
        }
    }
}
