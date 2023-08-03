package Linear_Searchc;

import java.util.Arrays;

public class Max_Wealth_09 {
    public static void main(String[] args) {
        int[][] account = {
                {3,2,1},
                {5,6,4}

        };
      // int a = maximumWealth(account);
       // System.out.println(Arrays.toString(a));
//        System.out.println(maximumWealth(account));
//        int ans = maximumWealth(account);
        maximumWealth(account);
        System.out.println(Arrays.toString(account));


    }
    static int maximumWealth(int[][] accounts){
        int ans = Integer.MAX_VALUE;
        for (int[] ints : accounts) {
            //when you start new col take a sum
            int sum = 0;
            for (int anInt : ints) {

                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
