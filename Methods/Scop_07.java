package Methods;

public class Scop_07 {
    public static void main(String[] args) {

        //Anything that initialise in ouside . ...it can be initialise inside.
        int a = 10;
        int b = 20;

        String name = "Vyankatesh";


        {

            //Anything that initialise in inside . ...it cannot initialise Outside.

            a = 5; // it will remain in block, values initialise in this block only
            System.out.println(a);
            name = "Andhale";
            System.out.println(name);

            int c =5;//
            //Scoping in for loops

            for (int i = 0; i < 4; i++) {
                System.out.println(i);


            }
        }int c =9;// value initialise inside that can use outside Again.
    }
}