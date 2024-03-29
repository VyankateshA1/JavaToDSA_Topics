package Interview_BinarySearch;

public class Target_inInfinity_Array {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,20,50,60,80,70,100,120,150,200};
        int target = 10;
        System.out.println(ans(arr,target));

    }

    public static int ans(int[] arr, int target){
//find the range
        //start with a box size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while (target > arr[end]){
            int temp = end + 1;
            //double the box value
            //end = previos end + sizeofbox * 2
            end = end + (end - start +1) * 2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }

    public static int binarySearch(int[] arr, int target, int start,int end){
        while (start<=end){
            int mid = start + (end - start)/2;

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
