import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Syntax

        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(20);
//        list.add(200);
//        list.add(15);
//        list.add(55);
//
//       // list.contains(15);
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list.contains(15));
//        System.out.println(list);

        //Input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());


        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here..list[index] doesnt work here..


        }
        System.out.println(list);
    }
}
