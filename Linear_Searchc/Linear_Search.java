package Linear_Searchc;

public class Linear_Search {
    public static void main(String[] args) {
        int[] nums = {23,55,4,7,8,9,6,2,22,10};
        int target = 23;
//        int ans = linearSearch(nums,target);
//        System.out.println(ans);
        System.out.println(linearSearch2(nums,22));
        
    }
    // Search in the Array : return the index if item found
    //if not found return -1
   static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
       for (int i = 0; i < arr.length; i++) {
           int element = arr[i];
           if (element == target){
               return i;
           }

       }
       return -1;
   }static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }

        }
       return -1;
   }
}
