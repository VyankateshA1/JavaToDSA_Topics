package Condtionals_And_Loops;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//
//        switch (fruit) {
//            case "Mango" -> System.out.println("its very testy..comes in summer");
//            case "Banana" -> System.out.println("its Yellow");
//            case "orange" -> System.out.println("oranges have vitamin C");
//            case "kivi" -> System.out.println("its good for health");
//            case "apple" -> System.out.println("eat daily");
//
//            default -> System.out.println("We dont have that");
//        }

        int day = in.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Thuesday");
            case 3 -> System.out.println("Wednsday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }



    }
}