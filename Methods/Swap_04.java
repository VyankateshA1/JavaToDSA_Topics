package Methods;

public class Swap_04 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        //Swap the num
//
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);
        System.out.println("After Swap: \n"+ "a "+a +"\nb "+b);
    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

        // this change only be valid in this func Scop only..

    }
}
