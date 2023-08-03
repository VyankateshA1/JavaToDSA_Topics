package Interview_BinarySearch;

public class Floor_Number_02 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,18,20};
        int target = 1;
        int ans = search(arr,target);
        System.out.println(ans);

    }
    //return the index of smalled no >= target
    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start +(end-start) / 2;
            if (target < arr[mid]){
                end = mid -1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return end;
    }
}
