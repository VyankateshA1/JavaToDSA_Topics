package loops;

import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//
//        int max=a;
//        if(b>max){
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }
//
//        System.out.println("its max:"+max);
/*
Other Method
 */
//
//        int max=0;
//
//        if (a>b){
//            max=a;
//        }else {
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }
//        System.out.println(max);

        /*
        Other Method
         */

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
