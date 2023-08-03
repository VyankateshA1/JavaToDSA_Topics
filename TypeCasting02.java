import java.util.Scanner;

public class TypeCasting02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //type casting
//        float num1 = in.nextFloat();
//        float num2 = in.nextFloat();
//        int sum = (int) ((int)num2 + num1);
//        System.out.println(sum);

        //Automatic type promotion to expression
//        int a = 258;
//        byte b = (byte) (a);// maximum value store in byte is 256
//        System.out.println(b);//2= output will be reminder--> 256 % 267=2
//

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a*b)/c;//40*50= 2000--byte automatically converting in into Integer .
//        System.out.println(d);

//
//        int number = 'a';
//        System.out.println(number);


        byte b = 42;
        char c ='a';
        short s = 11213;
        int i = 1545;
        float f = 10.000121F;
        double d = 0.12135461645;
        double result = (f*b) + (i/c) - (d-s);
        System.out.println((f*b)+" "+(i/c)+" "+(d-s));
        System.out.println(result);


    }
}
