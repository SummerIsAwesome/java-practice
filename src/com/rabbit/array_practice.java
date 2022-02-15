package com.rabbit;

import java.util.Arrays;
import java.util.Scanner;

public class array_practice {
    public static void main(String[] args) {

        int a[] = {1, 2};
        System.out.println(find_index(a));
    }



    //Write a Java program to calculate the average value of array elements
    public static double average(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        double a = (sum / numbers.length);
        return a;
    }

    //Write a Java program to test if an array contains a specific value
    public static boolean test(int [] numbers) {
        boolean condition = false;
        System.out.print("please enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0 ; i< numbers.length; i++){
            if (numbers[i] == a){
                condition=true;
                break;
            }
        }
        return condition;

    }

    // Write a Java program to find the index of an array element
    public static String find_index(int[] numbers) {
        int index = 0;
        System.out.print("please enter an array element ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0 ; i< numbers.length; i++){
            if (numbers[i]==a) index=i;
        }
        if (index==0 ) return ("oo you little piece of shit I asked you to enter a number from the array.");
        else return ("the index is " + index);
    }

    //Write a Java program to remove a specific element from an array.

}
