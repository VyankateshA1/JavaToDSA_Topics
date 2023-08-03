package loops;

public class countNums_6  {
    public static void main(String[] args) {

        int n =1546555;
        int count=0;

        while(n>0) {
            int reminder = n % 10;
            if (reminder == 5) {
                count++;
            }
            n /= 10;

        }
        System.out.println(count);
    }
}
