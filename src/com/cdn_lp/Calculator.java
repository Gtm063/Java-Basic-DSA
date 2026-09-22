package com.cdn_lp;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int ans=0;
        Scanner in=new Scanner(System.in);
        //Take input till user dont press X or x
        while (true){

            System.out.print("enter the operators :");
            char op=in.next() .trim().charAt(0);

            if (op=='+'||op=='*'||op=='/'||op=='-'||op=='%'){
                System.out.print("enter two nu,bers::");
                int num1= in.nextInt();
                int num2=in.nextInt();

                if (op == '+') {
                    ans=num2+num1;
                }
                if (op == '-') {
                    ans=num1-num2;
                } if (op == '%'){
                    ans=num1%num2;
                }
                if (op == '/') {
                    if (num1 != 0) {
                        ans=num1/num2;
                    }
                    else {
                        System.out.println("Syntax Error");
                    }
                }

            } else if (op=='X'||op=='x') {
                break;

            }else {
                System.out.println("Invalid operation");
            }
            System.out.println("ans="+ans);
        }

    }
}
