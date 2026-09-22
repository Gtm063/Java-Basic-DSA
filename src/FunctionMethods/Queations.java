package FunctionMethods;

import java.util.Scanner;

public class Queations {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(isprime(n));

    }
    static String  isprime(int n){
        int c=0;
     for(int i=1;i<=n;i++){
         if(n%i==0){
             c++;
         }
     }
        if (c == 2) {
            return "it is prime";
        }else{
            return "it is composite";
        }

    }}
