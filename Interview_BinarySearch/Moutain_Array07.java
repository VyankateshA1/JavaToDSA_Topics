package Interview_BinarySearch;

public class Moutain_Array07 {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6,4,2,1,0};
        System.out.println(mountain(arr));

    }
    public static int mountain(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <  end){
            int mid = start + (end - start) / 2;
            if (arr[mid]> arr[mid + 1]){
                // you are in dec part of array
                //this may be the ans, but look at Left side
                // this is why end != mid - 1
                end = mid;
            }else {
                //You are in asc part of Array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        //end the end, start == end and pointing to the largest number , because of the 2 cheks above.
        // start and end are always try to find max element in above checks.
        // hence, when they are pointing to just one element , that is the ans
        // more eloboration: at every point of time for start and end, they have the best possible ans till that time.
        // And if we are saying one item remaining ,hence because  of above line that is the possible ans
        return start;
    }
}
