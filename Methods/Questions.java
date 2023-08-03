package Methods;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // int n = in.nextInt();
       // System.out.println(isPrime(n));

       // System.out.println(isArmStrong(n));

        for (int i = 100; i < 1000; i++) {
            if (isArmStrong(i)){
                System.out.println(i +" ");
            }

        }

    }

    //Print all 3 digit ArmStrong Numbers.
    static boolean isArmStrong(int n) {

        int orignal = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;

        }
        return sum == orignal;
    }
//    static boolean isPrime(int n){
//        if (n <= 1) {
//            return false;
//        }
//        int c =2;
//        while (c*c <= n){
//            if (n % c == 0) {
//                return false;
//            }c++;
//
//        }
//        if (c * c > n) {
//return true;
//        }return false;
//    }
}
