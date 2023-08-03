package OOPS_01;

public class Wrapperclass {
    public static void main(String[] args) {
        int a=20;
        Integer b= 20;

        b.equals(a);

        //final keyword

        final int bonus = 2;

       final a vy = new a("hello");
        vy.name="sdfsdf";

        System.out.println(vy.name);
        a obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new a("Random name");
        }
    }
}
class a{
    String name;
    public a(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {

        System.out.println("object is destroyes.");
    }
}

