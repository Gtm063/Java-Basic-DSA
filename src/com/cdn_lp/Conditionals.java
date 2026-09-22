package com.cdn_lp;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        System.out.print("Enter the salary of the employee : ");
        Scanner ip=new Scanner(System.in);
        int sal=ip.nextInt();
        if(sal>=10000){
            System.out.println("bonous: 2000");
            sal=sal+2000;
        }else if(sal>=20000){
            System.out.println("bonous :3000");
            sal=sal+3000;
        }
        else{
            System.out.println("bonous :1000");
            sal=sal+1000;
        }
        System.out.println("new salary is : "+sal);

    }
}
