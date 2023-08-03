package loops;

public class Reverse_Number_07 {
    public static void main(String[] args) {

        int n = 23597;
        int ans = 0;
         while(n>0) {
             int reminder = n % 10;
             n /= 10;
             ans = ans * 10 + reminder;
         }  System.out.println(ans);

    }
}
