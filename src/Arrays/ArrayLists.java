package Arrays;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(5);
        list.add(12);
        list.add(124);
        list.add(124);
        list.add(351);
        list.add(1432);
        list.add(14325);
        list.add(1452);
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);
    }
}
