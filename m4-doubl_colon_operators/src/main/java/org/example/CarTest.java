package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {
        //Zero Argument Constructor
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        //one Argument Constructor
        Function<Integer,Car> f1 = model -> new Car(model);
        Function<Integer,Car> f2 = Car::new;
        System.out.println(f2.apply(5));

        BiFunction<String,Integer,Car> b1 = Car::new;
        Car honda = b1.apply("Honda", 1986);
        System.out.println(honda.getMake()+" "+ honda.getModel());


    }
}
