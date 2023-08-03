package Methods;

public class Greeting_02 {
    public static void main(String[] args) {
        greeting();

        String msg = myGreet("Vyankatesh");
        System.out.println(msg);
    }

    private static String myGreet(String name) {
        String m = "How are You?..."+name;
        return m;
    }

    static void greeting(){
        System.out.println("Hello...");
    }

}
