package Interview_BinarySearch;

public class firstLast06 {
    public static void main(String[] args) {

        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9,8};
        int target = 9;

        System.out.println("First element position :"+first(arr,target));
        System.out.println("Last element position :"+last(arr,target));
    }

    public static int first(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        int result = -1;

        while (start<=end){
            int mid = start + (end - start)/2;
            if (target == arr[mid]){
                result = mid;
                end = mid - 1;
            } else if (target<arr[mid]) {
                end =  mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return result;
    }
    public static int last(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        int result = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target==arr[mid]){
                result = mid;
                start = mid +1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return result;
    }
}
