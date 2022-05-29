package com.company;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int n = 10 , i , j , sum = 0;
        int matrix [][]= new int [n][n];

        //entering numbers from 0 to 9 on the diagonal and 0 outside the diagonal into the table

        for (i = 0 ; i<matrix.length;i++){
            for(j = 0; j< matrix.length; j++){
                if (i == j){
                    matrix[i][j] = i;
                    sum += matrix[i][j];
                } else {
                    matrix[i][j] = 0;
                }
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
        System.out.println("The sum of the diagonal in the array is equal to: " + sum);


    }
}