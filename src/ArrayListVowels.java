import java.util.ArrayList;
import java.util.List;

public class ArrayListVowels {

    private static final String VOWELS = "aeiouAEIOU";


    private static void vowelsUsingString(String word) {

        List<Character> vowelsList=new ArrayList<>();
        List<Character> consonants=new ArrayList<>();

        for (char c: word.toCharArray()) {
            if (Character.isDigit(c) || Character.isSpaceChar(c)) {
                continue;
            }
            if (VOWELS.indexOf(c) == -1) {
                consonants.add(c);
            } else if (VOWELS.indexOf(c) != -1) {
                vowelsList.add(c);
            }
        }

        System.out.println("Method 2");
        System.out.println("vowels -> "+vowelsList);
        System.out.println("consonants =>"+consonants);
    }
    private static void vowelsSep(String name) {
        List<Character> vowels1=new ArrayList<>();
        List<Character> consonants1=new ArrayList<>();

        for(char c:name.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                vowels1.add(c);
            }
            else if(Character.isDigit(c) || Character.isSpace(c)) {
            }
           else{
                consonants1.add(c);
            }

        }
        System.out.println("vowels"+vowels1);
        System.out.println("consonants");
        for(char d:consonants1) {
            System.out.print(d + "  ");

        }
    }
    public static void main(String[] args) {
        String name="san56e   ep";
        vowelsSep(name);
        vowelsUsingString(name);
    }
}
