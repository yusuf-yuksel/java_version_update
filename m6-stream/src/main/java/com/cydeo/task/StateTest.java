package com.cydeo.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {

        List<State> states = new ArrayList<>();
        State state1 = new State();
        state1.addCity("istanbul");
        state1.addCity("Ankara");

        State state2 = new State();
        state2.addCity("London");
        state2.addCity("Manchester");

        State state3 = new State();
        state3.addCity("New York");
        state3.addCity("Los Angeles");

        states.add(state1);
        states.add(state2);
        states.add(state3);

        states.stream()
                .flatMap(state -> state.getCities().stream())
                .forEach(System.out::println);







    }
}
