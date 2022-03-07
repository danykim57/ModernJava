package lambdaStream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaPractice {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .forEach(n -> System.out.println());
        Stream.of(1, 2, 3, 4, 5)
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(integer);
                    }
                });
        Consumer<Integer> printer = n -> System.out.println(n);
        Stream.of(1, 2, 3, 4, 5)
                .forEach(printer);
        System.out.println();

        Predicate<Integer> mod3 = n -> n % 3 == 0;
        Stream.of(1, 2, 3, 4, 5)
                .filter(mod3)
                .forEach(printer);

        System.out.println();

        Function<Integer, Integer> doubler = n -> n * 2;
        Stream.of(1, 2, 3, 4, 5)
                .map(doubler)
                .filter(mod3)
                .forEach(printer);
    }
}
