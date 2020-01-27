import java.util.ArrayList;
import java.util.List;

public class ArrayListEvenOdd {
    private static void evenOrOdd(int[] a){
        List<Integer> even=new ArrayList<>();
        List<Integer>  odd=new ArrayList<>();

         for(int i:a){

             if(i%2==0) {
                 even.add(i);
             } else if(i%2!=0){
                 odd.add(i);
             }
         }
        System.out.println("even"+even);
        System.out.println("odd"+odd);

    }
    public static void main(String[] args) {
        int[]  num={12,43,556,73,81};

        evenOrOdd(num);
       // System.out.println(num);
    }
}
