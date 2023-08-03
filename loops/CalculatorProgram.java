package loops;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        // Taking Input ultill user does not print x or X.

        int ans = 0;
        Scanner in = new Scanner(System.in);

        while (true){
            //take the operator
            System.out.println("Enter the Operator :");

            char op = in.next().trim().charAt(0);

            if (op == '/' || op == '*' || op == '-' || op == '+' || op == '%'){
                // input two num

                System.out.println("Enter the two Numbers");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '/'){
                    if (num2 != 0){
                   ans = num1 /num2;
                }}
                if (op == '*'){
                   ans = num1 * num2;
                }
                if (op == '-'){
                   ans = num1 - num2;
                }
                if (op == '+'){
                   ans = num1 + num2;
                }
                if (op == '%'){
                   ans = num1 % num2;
                }
                if (op == '/'){
                   ans = num1 /num2;
                }
            }else if(op == 'x' || op == 'X'){
                break;
            }else {
                System.out.println("Invalid !");
            }
            System.out.println(ans);

        }
    }
}
