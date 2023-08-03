import java.util.Scanner;

public class Calculator_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Temprature in C");
        int Celcius = in.nextInt();
        int Fahrenheit = (int) ((Celcius*1.8)+32);
        System.out.println(Fahrenheit);
    }
}
