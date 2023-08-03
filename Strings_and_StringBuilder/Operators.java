package Strings_and_StringBuilder;

import java.util.ArrayList;

public class Operators{
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println((char)('a'+0));

        //integer will be converted to Integer that will call toString()
        System.out.println("a" +1);

        System.out.println("Vyan" + new ArrayList<>());


        System.out.printf("A"+ new ArrayList<>());

        System.out.println((Integer)4+""+ new ArrayList<>());

    }
}
