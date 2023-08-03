package Binary_Search;

public class decend_02 {
    public static void main(String[] args) {

        int[] arr = {100,99,88,44,33,22,11,1};
        int target = 88;
        int ans = binray(arr,target);
        System.out.println(ans);

    }

    static int binray(int[] arr, int target){

       int start = 0;
       int end = arr.length - 1;

       while (start <= end){
         int mid = start + (end-start) / 2;

           if (target < arr[mid]){
               start = mid + 1;

           } else if (target > arr[mid]) {
               end = mid - 1;
           }else {
               return mid;
           }
       }
       return -1;
    }
}
