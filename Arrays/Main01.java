package Arrays;

public class Main01 {
    public static void main(String[] args) {

        // Q. Store a Roll No.
        int a =02;


        /*
        Syntax of array

        data-type[] variable_name = new data-type[size];
         */

        int rollNo[] = new int [5];
        System.out.println(rollNo[0]);

        String [] arr = new String[4];
        System.out.println(arr[0]);


        for (String element : arr){
            System.out.println(element);
        }

    }
}
