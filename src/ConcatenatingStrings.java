package com.company;



import java.util.Scanner;

public class ConcatenatingStrings {


    public static void main(String[] args){

        String s1,s2;
        Scanner s = new Scanner(System.in);
        System.out.println("Type first bunch of random text: ");
        s1 = s.nextLine();
        System.out.println("Type second bunch of random texts: ");
        s2= s.nextLine();

        s1=s1.concat(s2);

        System.out.println("The texts are:"+ s1);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equalsIgnoreCase(s2));



    }
}
