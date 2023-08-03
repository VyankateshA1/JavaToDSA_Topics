package Methods;

public class Shadowing_08 {
    static int a=50;//this being shadow
    public static void main(String[] args) {
        System.out.println(a);
        int a =500;
        System.out.println(a);
        fun();

        a = 5;
        System.out.println(a);
    }
    static void fun(){
        System.out.println(a);
    }
}
