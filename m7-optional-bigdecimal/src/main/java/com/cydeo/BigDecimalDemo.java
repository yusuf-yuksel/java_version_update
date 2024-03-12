package com.cydeo;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double amount1 =374.56;
        double amount2 =374.26;
        System.out.println(amount1-amount2);

        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = new BigDecimal("374.26");
        BigDecimal b3 = BigDecimal.valueOf(374.56);
        System.out.println(b1.subtract(b3));

        BigDecimal b4 = BigDecimal.TEN;
        BigDecimal b5 = BigDecimal.ONE;
        System.out.println(b4.add(b2));
        System.out.println(b2.multiply(b3));


        System.out.println(new BigDecimal(2).compareTo(new BigDecimal(2)));
        System.out.println(new BigDecimal(3).compareTo(new BigDecimal(2)));
        System.out.println(new BigDecimal(1).compareTo(new BigDecimal(2)));


    }
}

class Employee{
    private String name;
    private BigDecimal salary;
    //private double salary;


}