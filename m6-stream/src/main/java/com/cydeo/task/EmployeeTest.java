package com.cydeo.task;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        System.out.println("print all the emails");
        EmployeeData.readAll()
                //  .map(employee -> employee.getEmpEmail())
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("print all the phone numbers");

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("print all phone number with double colum operator");
EmployeeData.readAll()
        .map(Employee::getEmpPhoneNumbers)
        .flatMap(List::stream)
        .forEach(System.out::println);
    }
}
