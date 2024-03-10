package com.cydeo.task;

import java.util.Comparator;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories
        DishData.getAll()
                .stream()
                .filter(p -> p.getCalories() < 400)
                .map(dish -> dish.getName())
                .forEach(System.out::println);

        //Print the length of the name of each dish
        DishData.getAll()
                .stream()
                .map(dish -> dish.getName())
                .map(String -> String.length())
                .forEach(System.out::println);

        //Print three high caloric dish name (>300)
        DishData.getAll()
                .stream()
                .filter(dish -> dish.getCalories()>300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

        //Print all dish name that are below 400 calories in sorted
        System.out.println("--------------------------Task4-------------");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);










    }
}
