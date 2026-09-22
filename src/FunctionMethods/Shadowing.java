package FunctionMethods;

public class Shadowing {
    static int x=90;//shadowed at line 8:
    public static void main(String[] args) {
        System.out.println(x);//90
        int x=30;
        System.out.println(x);//30

    }

}
