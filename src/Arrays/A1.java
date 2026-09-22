package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
//       int[] arr=new int[5];
        Scanner in=new Scanner(System.in);

//
//        for (int i=0;i<arr.length;i++){
//            arr[i]=in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));
//

//        for (int i =  0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
        String[] str=new String[4];
        for (int i = 0; i <str.length ; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
