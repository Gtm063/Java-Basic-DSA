package com.cdn_lp;

public class SpecificNum {
    public static void main(String[] args) {
        int n=234631;
        int count=0;
                while(n>0){
                    int rem=n % 10;
                    if(rem==3){
                        count++;
                    }
                    n=n/10;
                }
        System.out.println(count);
    }
}
