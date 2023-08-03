package Methods;

public class Fun_Overloading_10 {
    public static void main(String[] args) {
fun(02);
fun("vyan");
    }
//number of argument or function should be different
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
