package Linear_Searchc;

import java.util.Arrays;

public class Search_In_Strings02 {
    public static void main(String[] args) {
        String name = "Vyankatesh";
        char target = 'o';
       // System.out.println(search(name,target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            int element = str.charAt(i);
            if (target == element){
                return true;
            }
        }
        return false;


    }  static boolean search2(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()) {
          //  int element = str.charAt(i);
            if (ch == target){
                return true;
            }
        }
        return false;


    }
}
