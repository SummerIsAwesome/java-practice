package com.rabbit;

import java.util.Scanner;

public class loop_exercise {
    public static void max_min(String[] args) {
        //write a program to get the numbers from use and give the max and min when a negative number is
        //entered
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 0;
        int min = 0;

        while (true) {
            if (a < 0) {
                min = a;
                break;
            }
            max = a > max ? a : max;
            // '?'  tells if true do this and ':' tells if false do this
            // another way of writing it___-- if (a>max) max = a;
            a = sc.nextInt();
        }
        strict_divisor();

        //  System.out.println("The max number entered is " + max);
        // System.out.println("The min number entered is " +min);
    }


    public static void strict_divisor() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = a / 2;
        int sum_of_divisors = 0;
        for (int i = 1; i <= b; i++) {
            //    if (a%i==0) sum_of_divisors = sum_of_divisors+i;
            //             or
            sum_of_divisors = a % i == 0 ? sum_of_divisors + i : sum_of_divisors;

        }
        System.out.println(sum_of_divisors);


    }


    // finding prime numbers
    public static void prime(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = Math.sqrt(a);
        int sum = 0;
        for (int i = 2; i <= b; i++) {
            if (a % i == 0) sum = sum + i;

        }
        if (sum == 0) System.out.println("the number is prime");
        else System.out.println("The number is not prime");

    }


    // Sum of digits of a number
    public static void sum_of_digits(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 10; ; ) {
            if (a < 10) {
                sum = sum + a;
                break;

            }
            int b = a % 10;
            a = a - b;
            a = a / i;

            sum = sum + b;

        }
        System.out.println("sum   " + sum);
    }


    //Display the nth fibonacci number
    public static void fibonacci(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        int c = 1;
        int i = 1;
        while (i < a) {
            int reasult = b + c;
            b = c;
            c = reasult;
            i++;
            System.out.println(reasult);
        }
    }





    //show a star pattern
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println("*".repeat(i));
        }

        for (int i = 1; i <= a; i++) {
            System.out.println(" ".repeat(a - i) + "*".repeat(i));
        }

        for (int i = 1; i <= a; i++) {
            System.out.println(" ".repeat((a - i)) + "*".repeat(i*2));

        }
        int z= 0;
        for (int i= 1 ; i<a;i++){
            System.out.println(" ".repeat(a-i)+ "*" +" ".repeat(i*2) +"*");
            z= z+i;
        }
        System.out.println("*".repeat(a*2+2));

        for (int i = 1 ; i<=a;i++){
            for (int j=1;j<=a;j++)
            if (j<=a) System.out.print("*");
            System.out.println();
        }
    }





    //write a program to write the string with a space between each character

    public static void space(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int L = a.length();
        for (int i =0;i<=L-1;i++){
            System.out.print(a.charAt(i)+" ");

        }
    }



    // program to reverse a given string
    public static void reverse(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int L = a.length() -1;
        for (int i = 0; i<=L;i++){
            System.out.print(a.charAt(L-i));
        }

    }





    //find weather a given string is a palindrome string
    public static void Palaindrome(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int v = 1;
        int L = a.length() -1;
        for (int i = 0; i<=L;i++){
           if (a.charAt(i)!=a.charAt(L-i)) {
               System.out.println("this string is not a palindrome");
               v = 2;
               break;
           }
        }
        if (v==1) System.out.println("this string is palindrom");

    }





    // print the pattern
    public static void intezerpattern(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=1 ;i<=a; i++){
            for (int j= 1; j<=i; j++){

                System.out.print(i);
            }
            System.out.println();
        }

    }







}
