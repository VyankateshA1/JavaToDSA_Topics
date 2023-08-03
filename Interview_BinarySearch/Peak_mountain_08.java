package Interview_BinarySearch;

public class Peak_mountain_08 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,3,2,1,0};
        int target = 2;
        System.out.println(search(arr,target));

    }
    public static int search(int[]arr, int target){
        int peak = peakIndexMountainArray(arr);
        int firstTry = orderAgnosticBs(arr,target,0 , peak);
        if (firstTry != -1){
            return firstTry;
        }
        //searvh in second half
        return orderAgnosticBs(arr,target,peak+1,arr.length-1);
    }
    public static int peakIndexMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start< end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
            }
        return start;
    }
    static int orderAgnosticBs(int[] arr, int target, int start, int end){


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
