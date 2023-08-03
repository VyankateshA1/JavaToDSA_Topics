package Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Change_Value06 {
    public static void main(String[] args) {

        //Create An Array

        int arr [] = {1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int num[]){
        num[0]=99;// value will be change.
    }
}
