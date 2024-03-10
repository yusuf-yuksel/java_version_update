package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,43,5,762,743,23);

        /*
        int sum = 0;
        for (int number:numbers){
            sum = sum + number;
        }
        System.out.println(sum);
        */

        int result = numbers.stream().reduce(0,(a,b) -> a+b);
        Optional<Integer> result2 = numbers.stream().reduce((a,b) -> a+b);
        System.out.println(result);
        System.out.println(result2.get());

        Optional<Integer> total = DishData.getAll().stream()
                .map(Dish::getCalories)
                //.reduce((a,b)->a+b);
                .reduce(Integer::sum);
        System.out.println(total.get());

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println("min "+ min.get());
        System.out.println("max "+ max.get());
        System.out.println("sum "+ sum.get());

        System.out.println("count");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);
    }
}
