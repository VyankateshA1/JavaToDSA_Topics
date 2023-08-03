package Linear_Searchc;

public class Search2D_Array_Min_07 {
    public static void main(String[] args) {
        int[][] arr = {
                {2,5,8,9},
                {10,20,3},
                {55,66,77,0},
                {5,6,-99}
        };
        System.out.println(min(arr));

    }
    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int[] ints : arr){
            for (int ints1 : ints) {
                if (min>ints1){
                    min = ints1;
                }

            }
        }
        return min;

    }
}
