package Linear_Searchc;

import java.util.Arrays;

public class Search_in_2D_array05 {
    public static void main(String[] args) {

        int[][] arr = {
                {22, 6, 4},
                {55, 666, 8, 7, 4},
                {62, 12, 5, 33, 6, 7, 8},
                {2, 1}
        };
        int target = 1;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }            return new int[]{-1, -1};

    }
}
