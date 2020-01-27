package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void traditionalLoop() {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);

        List<Integer> evens = new ArrayList<>();

        for (int i: nums) {
            if (i % 2 == 0) {
                evens.add(i);
            }
        }

        System.out.println(evens);
    }

    public static void withStreams() {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);

        List<Integer> evens = nums.stream().filter(i -> i%2 == 0).collect(Collectors.toList());

        System.out.println(evens);
    }

    public static void main(String[] args) {
        traditionalLoop();
        withStreams();
    }
}
