package com.cdn_lp;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter first numbers : ");
        int a= in.nextInt();
        System.out.print("Enter 2nd numbers : ");
        int b=in.nextInt();
        System.out.print("Enter 3rd numbers : ");
        int c=in.nextInt();
//        if(a>b && a>c){
//            System.out.println(a + "is greater");
//        } else if (b>c && b>a) {
//            System.out.println(b +" is greater");
//
//        }
//        else {
//            System.out.println(c +" is greater");
//    }
        int max=Math.max(c,Math.max(a,b));
        System.out.println("the greater no. is :"+ max);
}}
