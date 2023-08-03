package Binary_Search;

public class Main {
    public static void main(String[] args) {

        //Asending order Binary Search

        int[] arr = {1,3,6,8,11,22,55,66,80,100};
        int target = 80;
       int ans =  binary(arr,target);
        System.out.println(ans);

    }

    static int binary(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            //find the middle element
            //int mid = (start+end)/2 --> might be possible that it max of integer value
            int mid = start +(end-start) / 2;

            if (target < arr[mid]){
                    end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }

        }
        return -1;
    }
}
