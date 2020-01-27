package strings;

public class StringPalindrome {
    private static void palindrome(String name){
        StringBuilder sb = new StringBuilder(name);
       boolean eq = sb.reverse().toString().equalsIgnoreCase(name);
       if (eq) {
           System.out.println("pali");
       } else {
           System.out.println("not pali");
       }
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){
            reverse+=name.charAt(i);
        }
        System.out.println(reverse);
        if(reverse.equals(name)){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NOT PALINDROME");
        }

    }
    public static void main(String[] args) {
        String name="amma";
        palindrome(name);
    }
}
