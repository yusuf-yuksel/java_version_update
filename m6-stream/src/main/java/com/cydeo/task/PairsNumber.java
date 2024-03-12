package com.cydeo.task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PairsNumber {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        System.out.println(numbers2);

        List<int[]> pairs = numbers1.stream()
                .flatMap(num1 -> numbers2.stream().map(num2 -> new int[]{num1, num2}))
                .collect(Collectors.toList());
                //.forEach(pair -> System.out.println(Arrays.toString(pair)));

        pairs.forEach(pair -> System.out.println("(" + pair[0] + ", " + pair[1] + ")"));
        // Output: (1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)
    }
}
