package Interview_BinarySearch;

public class Ceiling_Number_01 {
    public static void main(String[] args) {
//        int[] arr = {2,3,5,9,14,18,20};
//        int target = 20;
//       int ans = search(arr,target);
//       System.out.println(ans);


    }
    //return the index of greatest no <= target
    static int search(int[] arr, int target){
        if (target > arr[arr.length -1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
        //return -1;

        return start;
    }

}
