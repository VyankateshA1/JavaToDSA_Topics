package Linear_Searchc;

import java.util.Arrays;

public class Search2D_Array_max_06 {
    public static void main(String[] args) {

        int[][] arr = {
                {2,5,8,9},
                {10,20,3},
                {55,66,77,7},
                {5,6,99}
        };
       // System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));


    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }
        return max;
    }

}
