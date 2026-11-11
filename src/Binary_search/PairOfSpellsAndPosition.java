//https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/?envType=study-plan-v2&envId=leetcode-75
package Binary_search;
import java.util.Arrays;

public class PairOfSpellsAndPosition {
    public static void main(String[] args) {
        int []spells={5,1,3};
        int [] potions={1,2,3,4,5};
        //sort so that we can apply binary search
        Arrays.sort(potions);
        int success=7;
        int[] ans=check(spells,potions,success);
        System.out.println(Arrays.toString(ans));
    }
    static int[] check(int[] spells, int[] potions, int success){
        int[] ans=new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int s=0;

            int e= potions.length-1;
            while (s<=e){
                int mid=s+(e-s)/2;
                if (spells[i]*potions[mid]>=success){
                /*as it is sorted and if it satisfies middle element,
                * mean all the right side of mid also satisfy so search to left*/
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
            //start will point the minimum element that satisfies
            //so ans should be the num of all element that satisfies
            //mean here,the start is pointed to 2nd element so all its right including 2nd would be ans
             ans[i]=potions.length-s;
        }
        return ans;
    }

}
