package strings;

public class CheckUpperCase {
    private static boolean checkCaps(String a){
        if(a==null) {
            return false;
        }
        for(int i=0;i<a.length();i++) {
           // if(Character.isUpperCase(a.charAt(i)))(or)

           if(a.charAt(i)>=65&&a.charAt(i)<=90) {
                return true;
            }
       }
        return false;
    }


    private boolean capsCheck(String b)
    {    if(b==null) {
        return false;
            }
        char[] cr=b.toCharArray();
        for(char d:cr) {
            if(Character.isUpperCase(d)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        String text="kAvya";
        System.out.println(checkCaps(text));
        CheckUpperCase check=new CheckUpperCase();
        System.out.println("***********");
        System.out.println(check.capsCheck(text));


    }
}
