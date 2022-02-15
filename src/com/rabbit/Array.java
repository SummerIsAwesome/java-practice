package com.rabbit;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //program to fill an array with n integers ented by the user
        Scanner sc = new Scanner(System.in);
        System.out.print("how many numbers are you goint to put in the array ");
        int array_lenght = sc.nextInt();
        while (array_lenght > 20 || array_lenght <= 0) {
            System.out.print("please enter a number between 0 and 20 ");
            array_lenght = sc.nextInt();
        }
        int list[] = new int[array_lenght];
        get_array_from_user(list);
        print_array_list(list);




//
    }

    public static void print_array_list(int[] list) {
        System.out.print("the list is ");
        System.out.println(Arrays.toString(list));

    }

    public static void get_array_from_user(int[] number) {
        Scanner sc = new Scanner(System.in);
        System.out.print("the elements in the array");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
    }

    public static int sum_of_arrays(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i];
        }
        return sum;
    }

    public static int product_of_arrays(int[] list) {
        int product = 1;
        for (int i = 0; i < list.length; i++) {
            product = product * list[i];
        }
        return product;
    }

    public static int average_of_arrays(int[] list) {
        int average= 1;
        for (int i = 0; i < list.length; i++) {
            average = sum_of_arrays(list)/ list.length;
        }
        return average;
    }

    public static String number_of_occurrence_of_a_number(int [] list,int a) {
        int occurrence = 0 ;
        for (int i=0 ; i< list.length; i++){
            if (list[i]==a)
            occurrence++;
        }
        return ("the number " +a + " occurres " +occurrence +" tiems");
    }

    public static String find_max_min(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        for (int i= 0; i<numbers.length;i++){
            if (numbers[i]>max) max = numbers[i];
            if (numbers[i]<min) min = numbers[i];
        }
        return ("the max value is " + max + " the min value is " +min) ;

    }


}



