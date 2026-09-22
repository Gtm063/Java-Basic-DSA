package FunctionMethods;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if (isArmstrong(n)){
            System.out.println("it is armstrong");
        }else {
            System.out.println("it is not armstrong");
        }
    }
    static boolean isArmstrong(int n){
        int s=0;
        int ne=n;
        while(n>0){

            int r=n%10;
             s=s+r*r*r;
             n/=10;
        }
        return s==ne;
    }

}
