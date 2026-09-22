package com.cdn_lp;

public class ReverseNum {
    public static void main(String[] args) {
        int n=234;
        int reverse =0;
        while(n!=0){
            int rem=n %10;
            n/=10;
            reverse = reverse *10+rem;
        }
        System.out.println(reverse);
    }
}
