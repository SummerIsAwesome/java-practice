package com.rabbit;

public class Two_D_Arrays {
    public static void main(String[] args) {
        int [][] number={{1,2,3,5,4,2,}
                        ,{1,2,3,5,3,9},
                         {11,24,5,3,3,5}};

        // program to print all the element of a 2D array
        for (int i = 0 ; i<number.length;i++){
            for (int j=0;j<number[i].length;j++){
              //  System.out.print(number[i][j] + " ");
            }
       //     System.out.println();
        }


        //program to sum the numbers in a row and in a column
        for ( int i = 0; i < number.length; i++)  {// number.length gives the number of rows in the array
            int sum  = 0;
            for (int j = 0; j < number[i].length; j++) {// number.length gives the number of element in the index i row
                sum = sum + number[i][j];
            }
        //    System.out.println(("The sum of numbers in row " + (i+1) +" =" + sum ));
        }
        for ( int i = 0; i < number[0].length; i++) {// number.length gives the number of rows in the array
            int sum1  = 0;
            for (int j = 0; j < number.length; j++) {// number.length gives the number of element in the index i row
                sum1 = sum1+ number[j][i];
            }
            //System.out.println(("The sum of numbers in colum " + (i+1) +" =" + sum1 ));

        }



        //program to find the max in each row
        for (int i =-0; i<number.length;i++){
            // System.out.println(get_max_of_a_row(number,i));
        }

    }





    //program to find the max in each row
    public static String get_max_of_a_row(int[][] number,int i){
            int max = number[i][0];
            for (int j = 0; j < number[i].length; j++) {
                if (max <= number[i][j]) max = number[i][j];
            }
            return ("The max number in row " + (i+1) + " = " + max);


    }
    }