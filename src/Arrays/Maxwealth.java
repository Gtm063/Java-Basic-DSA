package Arrays;

public class Maxwealth {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{9,1,6},{3,3,7}};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum=sum+arr[i][j];
            }

            if(ans<sum){
                ans=sum;
            }
        }
        System.out.println(ans);
    }
}
