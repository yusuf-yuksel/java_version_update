package org.etlas;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("How to access to constant");
        Currency c = Currency.DIME;
        System.out.println(c);
        System.out.println("How to print constant");
        Currency[] currencies = Currency.values();
        for (Currency currency:currencies){
            System.out.println(currency);
        }
        System.out.println("How to access to constant");


    }
}