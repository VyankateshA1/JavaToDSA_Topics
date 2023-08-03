package Strings_and_StringBuilder;

import java.nio.charset.StandardCharsets;

public class camparison {
    public static void main(String[] args) {

        String a = "vyan";
        String b = "vyan";
        String c = a;
      //  System.out.println(c == a);
       // System.out.println(a == b);

        String name1 = new String("Vyan");
        String name2 = new String("Vyan");

       // System.out.println(name1 == name2);

        //* .equals()
        System.out.println(name1.equals(name2));

        //* .charAt()
        System.out.println(name1.charAt(0));
        System.out.println(name1.repeat(2));
        System.out.println(name1.getBytes());
        System.out.println(name1.length());
        System.out.println(name1.getBytes(StandardCharsets.UTF_8));
        System.out.println(name1.concat("v"));
        System.out.println(name1.lines());
    }
}
