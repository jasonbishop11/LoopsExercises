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
}
