package LinearSearch;

public class EvenDigita {
    public static void main(String[] args) {
        int[] arr = {18, 24, 36, 1, 421};
//        System.out.println(dig(arr));
//
//
//    }
//
//    static int dig(int[] arr) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (even(arr[i])) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    static boolean even(int a) {
//        int numofdig=count(a);
//
//        return numofdig %2==0;
//    }
//
//    static int count(int b){
//        int n=0;
//    while(b>0){
//       n++;
//       b=b/10;
//    }
//
//        return n;
//    }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int Countnum=0;
            while (arr[i]>0){
                Countnum++;
                arr[i]/=10;
            }
            if(Countnum%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}

