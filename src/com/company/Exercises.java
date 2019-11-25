package com.company;

public class Exercises {
    public static int addOdds(int n){
        int sum = 0;
        for (int i = 1; i<=n; i=i+2){
            sum = sum + i;
        }
        return sum;
    }

    public static int howManyYears(double StartPop, double EndPop){
        int year = 0;
        while (StartPop<=EndPop){
            StartPop = StartPop * 1.13;
            year++;
        }
        return year;
    }

    public static int sumDigits(int n){
        int total=0;
        int lowestdigit;
        while (n>10){
            lowestdigit = n%10;
            n = n/10;
            total = total + lowestdigit;
        }
        total = total + n;
        return total;
    }

    public static void sillyNumbers(){
        for(int i = 1; i<=3; i++){
            for(int j = 0; j<=9; j++){
                for(int k = 1; k<=3; k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void sillyNumbers2(){
        for(int i = 1; i<=4; i++){
            for(int j = 9; j>=0; j--){
                for(int k = 1; k<=7; k++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void dollarsAndStars(){
        for(int i = 0; i<=6; i++) {
            for (int j = 1; j <= i * 2; j++) {
                System.out.print("*");
            }
            for(int k = 0; k<=6-i; k++){
                System.out.print("$");
            }
            for(int l = 1; l<=14-(i*2); l++){
                System.out.print("*");
            }
            for(int k = 0; k<=6-i; k++){
                System.out.print("$");
            }
            for (int j = 1; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a = addOdds(10);
        System.out.println(a);
        int b = addOdds(5);
        System.out.println(b);
        int c = addOdds(1);
        System.out.println(c);

        System.out.println();

        int d = howManyYears(120,150);
        System.out.println(d);

        System.out.println();

        int e = sumDigits(50);
        System.out.println(e);
        int f = sumDigits(123);
        System.out.println(f);
        int g = sumDigits(7);
        System.out.println(g);

        System.out.println();

        sillyNumbers();

        System.out.println();

        sillyNumbers2();

        System.out.println();

        dollarsAndStars();
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
}
