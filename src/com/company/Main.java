package com.company;

public class Main {

    public static void main(String[] args) {
        int a = Exercises.addOdds(10);
        System.out.println(a);
        int b = Exercises.addOdds(5);
        System.out.println(b);
        int c = Exercises.addOdds(1);
        System.out.println(c);

        System.out.println();

        int d = Exercises.howManyYears(120,150);
        System.out.println(d);

        System.out.println();

        int e = Exercises.sumDigits(50);
        System.out.println(e);
        int f = Exercises.sumDigits(123);
        System.out.println(f);
        int g = Exercises.sumDigits(7);
        System.out.println(g);

        System.out.println();

        Exercises.sillyNumbers();

        System.out.println();

        Exercises.sillyNumbers2();

        System.out.println();

        Exercises.dollarsAndStars();
    }
}

/* Output
25
9
1

2

5
6
7

000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999

9999999888888877777776666666555555544444443333333222222211111110000000
9999999888888877777776666666555555544444443333333222222211111110000000
9999999888888877777776666666555555544444443333333222222211111110000000
9999999888888877777776666666555555544444443333333222222211111110000000

$$$$$$$**************$$$$$$$
**$$$$$$************$$$$$$**
****$$$$$**********$$$$$****
******$$$$********$$$$******
********$$$******$$$********
**********$$****$$**********
************$**$************
 */