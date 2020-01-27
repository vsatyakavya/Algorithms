import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCaseCheck {

    private static void vowelsPrint(String word){
        List<Character> upperCaseList=new ArrayList<>();
        List<Character> lowerCaseList=new ArrayList<>();

        for (char c: word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCaseList.add(c);
            } else if (Character.isLowerCase(c)) {
                lowerCaseList.add(c);
            }
        }

        System.out.println("Printing Upper case letters of the word -> ");
        for (Character c: upperCaseList) {
            System.out.print(c + "  ");
        }
        System.out.println();
        System.out.println("Printing Lower case letters of the word -> ");
        for (Character c: lowerCaseList) {
            System.out.print(c + "  ");
        }

        //second method...without using inbuilt method
        List<Character> upperCaseList1=new ArrayList<>();
        List<Character> lowerCaseList1=new ArrayList<>();

        for(char d:word.toCharArray()){
            if(d>=65&&d<=90){
                upperCaseList1.add(d);
            }
            else if(d>=97&&d<=122) {
                lowerCaseList1.add(d);
            }
        }

        System.out.println("******************");
        System.out.println("uppercase"+upperCaseList1);
        System.out.println("lowercase"+lowerCaseList1);

    }
    public static void main(String[] args) {
        String name="KavY  _989a";
        vowelsPrint(name);
    }
}
