package lambdaStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionsPractice {
    private List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    private Function<Integer, Integer> doubler = n -> n * 2;

    private Function<Integer, Integer> doubleWithSleep = n -> {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        return n * 2;
    };

    public void printNums(Function<Integer, Integer> function) {
        System.out.println(nums.stream()
                .map(function).
                collect(Collectors.toList()));
    }

    public void printNumsParalle(Function<Integer, Integer> function) {
        System.out.println(nums.parallelStream()
                .map(function)
                .collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        CollectionsPractice prac = new CollectionsPractice();

        long start = System.nanoTime();
        prac.printNums(prac.doubler);
        long end = System.nanoTime();
        System.out.println("Time taken: " + (end - start) / 1e9);

        start = System.nanoTime();
        prac.printNums(prac.doubleWithSleep);
        end = System.nanoTime();
        System.out.println("Time taken: " + (end - start) / 1e9);

        start = System.nanoTime();
        prac.printNumsParalle(prac.doubleWithSleep);
        end = System.nanoTime();
        System.out.println("Time taken: " + (end - start) / 1e9);
    }
}
