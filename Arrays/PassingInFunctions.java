package Arrays;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {

        int [] nums = {3,4,5,6};
        System.out.println(Arrays.toString(nums));

        //it is mutable arrays in java
        Change(nums);
        System.out.println(Arrays.toString(nums));

    }

    private static void Change(int[] arr) {
        arr[0] = 33;
    }

}
