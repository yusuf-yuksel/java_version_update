package com.cydeo;
import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import static java.util.Comparator.comparing;


public class FindingMatching {
    public static void main(String[] args) {
        boolean isHealth = DishData.getAll().stream()
                .allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealth);

        System.out.println("ANY MATCH");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

        System.out.println("NONE MATCH");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);

        System.out.println("FIND ANY");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        System.out.println("FIND FIRST");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());

        //parallel streams
        System.out.println(IntStream.range(1,100).parallel().findAny());
        System.out.println(IntStream.range(1,100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");

        Optional<String> findFirst = list1.parallelStream().filter(s ->s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.parallelStream().filter(s ->s.startsWith("J")).findAny();
        System.out.println(findFirst.get());
        System.out.println(findAny.get());

        Optional<Dish> dmin = DishData.getAll().stream().min(comparing(Dish::getCalories));
        System.out.println(dmin.get());
        Optional<Dish> dMax = DishData.getAll().stream().max(comparing(Dish::getCalories));
        System.out.println(dMax.get());




    }
}
