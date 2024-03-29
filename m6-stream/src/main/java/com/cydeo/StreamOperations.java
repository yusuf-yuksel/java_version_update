package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,3,4,4);
       // list.forEach(x -> System.out.println(x));
        //list.forEach(System.out::println);

        System.out.println("Filter");

        list.stream()
                .filter(i -> i%2==0)
                .forEach(System.out::println);

        System.out.println("distinct");
        Stream<Integer> str = list.stream()
                .filter(i -> i%2==0)
                .distinct();
        str.forEach(System.out::println);

        System.out.println("limit");
        list.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("skip");
        list.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("map");
        list.stream()
                .filter(i -> i%2==0)
                .map(i -> i*3)
                .forEach(System.out::println);







    }
}
