package Strings_and_StringBuilder;

public class Palindrom_ {
    public static void main(String[] args) {

        String str = "";
        System.out.println(Palindrom(str));

    }
    static boolean Palindrom(String str){

        if (str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length()/2 ; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start != end){
                return false;
            }

        }
        return true;
    }
}
