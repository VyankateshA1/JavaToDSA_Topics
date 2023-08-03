package Arrays;

import java.util.Arrays;

public class Q_03_ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1,2,5,6,9,88,77,66,555};
       // swap1(arr,0,4);

        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
             swap1(arr,start,end);
             start++;
             end--;

        }
    }
        static void swap1(int[] arr, int index1, int index2){
            int temp = arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
    }
}
