package Interview_BinarySearch;

public class Rotate_BinarySearch_09 {
    public static void main(String[] args) {

        int[] arr = {3,4,5,7,2,1,0};
        int[] arr1 = {1,1,1,1,1,1,1,9,1};
        int target = 7;
        System.out.println(pivotdublicate(arr1));
        System.out.println("Pivot :"+pivot(arr));
        System.out.println("target in pivot :"+search(arr,target));
    }

    static int search(int[] arr, int target){
        int pivot = pivot(arr);

        //if you did not foun pivot then array is not Rotated

        if (pivot == -1){
            //just do normal binary Search

            return binarySearch(arr,target,0,arr.length-1);
        }
        //if you found pivot you have found 2 asc sorted Arrays
        //case 1
        if (arr[pivot] == target){
            return pivot;
        }
        //case 2
        if (target > arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        //case 3
        return binarySearch(arr,target,pivot+1,arr.length-1);

    }
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end -start)/2;
            //case 1
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }//case 2
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            //case 3
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr, int target, int start, int end){

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    static int pivotdublicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end -start)/2;
            //case 1
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }//case 2
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            //case 3
            // if elements at middle, start and end are equal then just skip duplicates
           if (arr[mid]==arr[start] && arr[mid] == arr[end]){
               // skip the duplicate
               // Note: what if these elements at start and end were the pivot?
               // check if start is pivot
               if (arr[start] > arr[start + 1]){
                   return start;
               }
               start++;
               if (arr[end] < arr[end-1]){
                   return end -1;
               }
               end --;
           }
           else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
               start = mid + 1;
            }else {
               end = mid - 1;
           }

        }
        return -1;
    }
}
