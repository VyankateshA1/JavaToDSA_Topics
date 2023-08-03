package Strings_and_StringBuilder;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name= "Vyankatesh";
        System.out.println(Arrays.toString(name.toCharArray()));
        name.length();
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.stripIndent());
        System.out.println(name.repeat(2));
        System.out.println(name.getBytes());
    }
}
