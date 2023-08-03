package Methods;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

//        sum();
//       int ans= sum2();
//        System.out.println(ans);
       int ans =  sum3(10,40);
        System.out.println(ans);
    }
    static void sum(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum :"+sum);

    }
    /*
    Return the value
     */

    static int sum2(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    /*
    Pass the value of numbers when you are calling the method in main();
     */

    static int sum3(int a,int b){
        int sum = a + b;
        return sum;
    }
}
