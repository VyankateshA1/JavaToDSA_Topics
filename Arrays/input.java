package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
       // int [] arr = new int[5];
//        arr[0]=23;
//        arr[1]=213;
//        arr[2]=2;
//        arr[3]=3;
//        arr[4]=123;
//        System.out.println(arr[3]);5


        //Input using for loops

//        for (int i = 0; i <arr.length ; i++) {
//            arr[i] = in.nextInt();
//
//        }
//        System.out.println(Arrays.toString(arr));
////
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//
//        }
//        for (int num : arr){
//            System.out.print(num + " ");//num represent element of the array
//



        // arrays of Objects

        String[] str = new String[4];
        for (int i = 0; i <str.length ; i++) {
            str[i] = in.next();

        }
        System.out.print(Arrays.toString(str));

        // Modify array

        str[1] = "Vyan";
        System.out.print(Arrays.toString(str));

    }
}
