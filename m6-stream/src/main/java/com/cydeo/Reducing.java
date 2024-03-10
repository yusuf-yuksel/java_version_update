package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,43,5,762,743,23);

        int sum= numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(sum);
    }
}
