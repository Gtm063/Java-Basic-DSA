package com.cdn_lp;

import java.util.Scanner;

public class ULcaseCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ch=in.next().trim().charAt(0);
        //.trim()-remove extra space
        //charAt->this -(in.next().trim())is a string so it will give that(0)mean 1st char of string
        if(ch>='a' && ch<='z'){
            System.out.println(ch +" is lower case");
        }else {
            System.out.println(ch +" is upper case");
        }
    }
}
