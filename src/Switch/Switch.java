package Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
//        String fruit= in.next();
//        switch (fruit){
//            case "Mango":
//                System.out.println("King of fruit");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            default:
//                System.out.println("please enter valid fruit");
      int day= in.nextInt();
      switch (day){
          case 1,2,3,4,5-> System.out.println("Weekday");
          case 6,7-> System.out.println("Weekend");
      }
      switch(day){

          case 1-> System.out.println("Monday");
          case 2-> System.out.println("Tuesday");
          case 3-> System.out.println("Wednesday");
          case 4-> System.out.println("Thursday");
          case 5-> System.out.println("Friday");
          case 6-> System.out.println("Saturday");
          case 7-> System.out.println("Sunday");
        }
    }
}
