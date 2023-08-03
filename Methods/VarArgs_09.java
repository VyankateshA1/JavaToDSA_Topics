package Methods;

import java.util.Arrays;

public class VarArgs_09 {
    public static void main(String[] args) {
        fun(1,2,3,5,4,8,9);
        multiple(2,5,"Vyan","Andh");
    }

    static void multiple(int a, int b, String ...v){

    }

    static void fun(int ...v){
        /*
 when you dont know how many arguments you are taking .
 then use
 static void main(int/String ...v){
 }
 */
        System.out.println(Arrays.toString(v));


    }
}
