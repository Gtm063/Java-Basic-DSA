package FunctionMethods;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
          // int a=70;//already initialized outside the block in same methode,hence cannot initialized again
            int c=99; //values initialised in this blook will remain in block

            a=100;//but can change value


        }
        System.out.println(a);
        //System.out.println(c);//cant use outside the block
    }
}
