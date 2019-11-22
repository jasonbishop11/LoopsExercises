package com.company;

public class Main {

    public static void main(String[] args) {
        int a = Exercises.addOdds(10);
        System.out.println(a);
        int b = Exercises.addOdds(5);
        System.out.println(b);
        int c = Exercises.addOdds(1);
        System.out.println(c);

        int d = Exercises.howManyYears(120,150);
        System.out.println(d);

        int e = Exercises.sumDigits(50);
        System.out.println(e);
        int f = Exercises.sumDigits(123);
        System.out.println(f);
        int g = Exercises.sumDigits(7);
        System.out.println(g);

        Exercises.sillyNumbers();

        System.out.println();

        Exercises.sillyNumbers2();

        Exercises.dollarsAndStars();
    }
}
