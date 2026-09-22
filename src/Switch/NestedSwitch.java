package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter ID");
        int empID= in.nextInt();
        System.out.println("enter department");
        String department= in.next();
        switch (empID){
            case 1-> System.out.println("Pujan Gautam");
            case 2-> System.out.println("Bhuwan sharma");

            case 3-> {
                System.out.println("emp no. 3");

                switch (department) {
                    case "IT"->
                        System.out.println("IT department");
                    case "Management"->
                        System.out.println("Management Department");
                    default->
                        System.out.println("no department entered");
                }

            }
        }
    }
}
