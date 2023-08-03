package Interview_BinarySearch;

public class firstAndLast05 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 3, 3, 4, 7, 8, 8};
        int n = arr.length;
        int target = 2;

        System.out.println("First Occurrence = "
                + first(arr, 0, n - 1, target, n));
        System.out.println("Last Occurrence = "
                + last(arr, 0, n - 1, target, n));

    }

    public static int first(int[] arr, int start, int end, int target, int n) {

        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == 0 || target > arr[mid - 1] && arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                return first(arr, mid + 1, end, target, n);
            } else {
                return first(arr, start, mid - 1, target, n);
            }
        }
        return -1;
    }

    public static int last(int[] arr, int start, int end, int target, int n) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == n - 1 || target < arr[mid + 1] && arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                return last(arr, start, mid - 1, target, n);
            } else {
                return last(arr, mid + 1, end, target, n);
            }
        }
        return -1;
    }
}