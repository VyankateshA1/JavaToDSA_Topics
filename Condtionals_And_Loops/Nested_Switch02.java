package Condtionals_And_Loops;

import java.util.Scanner;

public class Nested_Switch02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1 -> System.out.println("Vyan");
            case 2 -> System.out.println("Ram");
            case 3 -> {
                System.out.println("emp 3");
                switch (department) {
                    case "IT" -> System.out.println("It deparment");
                    case "managment" -> System.out.println("managment Department");
                    //  default -> System.out.println("enter valid information");
                }
            }
            default -> System.out.println("enter valid info");
        }
    }
}
