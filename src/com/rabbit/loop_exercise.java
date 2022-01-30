package com.rabbit;

import java.util.Scanner;

public class loop_exercise {
    public static void main(String[] args) {
        //write a program to get the numbers from use and give the max and min when a negative number is
        //entered
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max =0;
        int min =0;
        while(true){
            if (a<0){
                min=a;
                break;
            }
            max = a > max ? a :max;
            // '?'  tells if true do this and ':' tells if false do this
            // another way of writing it___-- if (a>max) max = a;
            a = sc.nextInt();

        }


        System.out.println("The max number entered is " + max);
        System.out.println("The min number entered is " +min);


    }
}
