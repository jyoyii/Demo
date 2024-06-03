package dataStructures;
import java.util.*;

public class MapCollection {
    public static void main(String[] args){
        //contains value on basis of key.Each key value pair is called entry,contains unique keys
        //HashMap - allows null keys & values, doesn't maintain order
        Map map=new HashMap();
        map.put(1,"nilu");
        map.put(2,"Jyo");
        Set set=map.entrySet();
        for (Object m:set) {

        }

        //LinkedHashMap - allows 1 null key & values, maintains ascending order

        //TreeMap - doesn't allow any null key or value, maintains ascending order

    }
}
