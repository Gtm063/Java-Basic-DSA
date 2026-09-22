package com.cdn_lp;

import java.util.Scanner;

public class fibonacii {
    //1,1,2,3,5,.....nth
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        System.out.println("Enter the nth number :");
        int a=0;
        int b=1;
        int c = 0; int i;
        for (i = 2;  i <= n ; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}
