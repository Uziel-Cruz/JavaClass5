package com.company;

public class Main {
    //FILLING AN ARRAY

    public static void main(String[] args) {

        int numbers []= new int[10];

        for (int i=0;i<numbers.length;i++){
            numbers[i]= 9-i;

        }


        for (int t :numbers) {
            // System.out.println(yes);
            System.out.println("Array["+ t +"] = " + t);

        }

    }
}
