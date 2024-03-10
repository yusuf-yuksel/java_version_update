package com.cydeo.task;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100, "Mike", "mike@gmail.com", Arrays.asList("234242324","235234352")),
                new Employee(100, "nasir", "nasir@gmail.com", Arrays.asList("27878324","233464352")),
                new Employee(100, "alim", "alim@gmail.com", Arrays.asList("2379754","235085352"))

                );
    }
}
