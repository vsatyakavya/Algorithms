package collections;

import java.util.HashMap;
import java.util.Map;

public class MapPlayGroung {
    Map<String, Integer> map;
    private void printAndCount() {
        map = new HashMap<>();
        String str = "the list is a collection of items, the list are linked list array list and some list if exists";
        String[] strArray = str.split("\\s+");

        for (String eachString: strArray) {
            if (map.containsKey(eachString)) {
                map.put(eachString, map.get(eachString) +1);
            } else {
                map.put(eachString, 1);
            }

        }
//        System.out.print(map);

        System.out.println("unique keys =-=-=-=>>> *****");
       for(String unique:strArray) {
           if(map.get(unique) == 1){
               System.out.print(unique+" ");
           }


       }

        System.out.println("*****");
       System.out.print(map);

    }

    public static void main(String[] args) {
        MapPlayGroung mapPlayGroung = new MapPlayGroung();
        mapPlayGroung.printAndCount();
    }
}
