package Linear_Searchc;

public class Even_Digits_08 {
    public static void main(String[] args) {

        int[] num = {12,345,2,6,7896};
        System.out.println(findNumbers(num));
        //System.out.println(digits2(65462254));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num: nums) {
            if (even(num)){
                count++;

            }
            //return count;
        }
        return count;
    }

    //funciton to check numbers are even or not.
   static boolean even(int num) {
        int numberofDigits = digits(num);
        /*
        if (numberofDigits % 2 == 0){
            return true;
        }
return false;

         */
       return numberofDigits % 2 == 0;
    }
    static int digits(int num){
        int count =0;
        if (num<0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        while (num>0){
            count++;
            num = num /10;
        }
        return count;
    }
//    static int digits2(int num){
//        if (num<0){
//            num = num * -1;
//        }
//        return (int)(Math.log10(num)) + 1;
//    }
}
