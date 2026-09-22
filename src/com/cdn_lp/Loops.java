package com.cdn_lp;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = ip.nextInt();
        //FOR LOOP::

        // for (int i = 1; i < num; i++) {
        //     System.out.print(i);
        // }

        //WHILE LOOP::

        // int i=1;
        // while(i<num){
        //     System.out.println(i);
        //     i++;

        //DO WHILE LOOP::

        int i = 1;
        do {

            System.out.println(i);
            i++;

        } while (i<= num);
    }
    }


