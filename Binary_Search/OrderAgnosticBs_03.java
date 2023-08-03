package Binary_Search;

public class OrderAgnosticBs_03 {
    //Order Agnostic Binary Search
    public static void main(String[] args) {

        int[] arr = {1,3,6,8,11,22,55,66,80,100};
        int target = 80;
        int ans = orderAgnosticBs(arr,target);
        System.out.println(ans);

    }

    static int orderAgnosticBs(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        //find whather the Array is sorted in decending or ascending order

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}

