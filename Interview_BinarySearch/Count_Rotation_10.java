package Interview_BinarySearch;

public class Count_Rotation_10 {
    public static void main(String[] args) {

        int[] arr= {1,2,3,4,5,6,7};
        System.out.println(pivot(arr));
        System.out.println(count(arr));
    }
    static int count(int[] arr){
        int pivot = pivot(arr);
        return pivot + 1;
    }
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) /2;
            if (mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid]<arr[mid - 1]){
                return mid -1;
            }
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int pivotDuplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) /2;
            if (mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid]<arr[mid - 1]){
                return mid -1;
            }
            if (arr[mid] == arr[start] && arr[end] == arr[mid]){
                if (arr[start] > arr[start +1]){
                    return start;
                }start++;
                if (arr[end]<arr[end - 1]){
                    return end - 1;
                }end --;
            } else if (arr[start] < arr[mid] || arr[start] == arr[mid]
                        && arr[mid] > arr[end]) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
