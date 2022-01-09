package com.example.modernjava;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class MethodReferences {
    Stream.of(3, 1, 4, 1, 5, 9)
            .forEach(x -> System.out.println(x));

            Stream.of(3, 1, 4, 1, 5, 9)
            .forEach(System.out::println);

    Consumer<Integer> printer = System.out::println;
            Stream.of(3, 1, 4, 1, 5, 9)
            .forEach(printer);
}
