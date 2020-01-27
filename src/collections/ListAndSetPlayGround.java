package collections;

import java.util.*;

public class ListAndSetPlayGround {
   private List<String> stringList;
   private List<String> linkedStringList;

   private Set<String> setofStrings;
   private Set<String> stringLinkedSet;

    private void practiceCollections() {
        stringList = new ArrayList<>();
        linkedStringList = new LinkedList<>();
        setofStrings = new HashSet<>();
        stringLinkedSet=new LinkedHashSet<>();
        String str = "the list      is a collection of items, the List are linked List array list and some list if exists";
        String newsentence=str.toLowerCase(); //for treating List and list are same
        String[] strArray = newsentence.split("\\s+");

        for (String individualString: strArray) {
//            System.out.println(individualString);
            stringList.add(individualString);
            linkedStringList.add(individualString);
            setofStrings.add(individualString);
            stringLinkedSet.add(individualString);
        }
        System.out.println("Elements in arraylist");
        for(String eachElementArray:stringList){
            System.out.print(eachElementArray+" ");
        }
        System.out.println();

        System.out.println("Elements in linkedlist: -=-=--=-=-=-=>>>>>");
        for (String eachElementInList: linkedStringList) {
            System.out.print(eachElementInList + " ");
        }

        System.out.println();
        System.out.println("Elements in set -=-=-=- >>> >>>>> >>>>");
        for (String eachElementInList: setofStrings) {
            System.out.print(eachElementInList + " ");
        }

        System.out.println();
        System.out.println("Elements in Linkedset -=-=-=- >>> >>>>> >>>>");
        for (String eachElementInList: stringLinkedSet) {
            System.out.print(eachElementInList + " ");
        }

        System.out.println("*****************");
        System.out.println("size of linked list " + linkedStringList.size());
        System.out.println("size of set " + setofStrings.size());


        //Another way of iteraing a list
       /* for (int i=0; i<linkedStringList.size(); i++) {
            System.out.println(linkedStringList.get(i));
        }*/


  //  private void exmples() {
        System.out.println("Count number of times word list is found in the given string");
        int count = 0;
        for (String s: stringList) {
            if (s.equalsIgnoreCase("list")) {
                count++;
            }
        }
        System.out.println(count);


    }
    private boolean wordCheck() {   //check if the given word is in the sentence or not
        if(stringList.contains("list")){

            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ListAndSetPlayGround listAndSetPlayGround = new ListAndSetPlayGround();
        listAndSetPlayGround.practiceCollections();
        System.out.println( listAndSetPlayGround.wordCheck());
    }
}
