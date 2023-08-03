package loops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        Scanner in = new Scanner(System.in);
        System.out.println("The fibonacci range you want?\nEnter number :");

       int n= in.nextInt();

        for (int i = 0; i <=n; i++) {
       // while (n>0){
            int c = a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
