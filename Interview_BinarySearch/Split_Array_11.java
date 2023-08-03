package Interview_BinarySearch;

public class Split_Array_11 {
    public static void main(String[] args) {

        int[] num = {7,2,5,10,8};
        int m = 2;
        split(num,m);
        System.out.println(split(num,m));
    }
    static int split(int[] nums, int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length ; i++) {
            start = Math.max(start,nums[i]);//in the end of the loop this will contain the max value from the Araay
            end *= nums[i];
        }
        //binary Search

        while (start < end){
            //try for the middle as potential ans
            int mid = start +(end - start) /2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid){
                            //You can not add this in this subArray, make new one
                    //so you add this num in new subArray, then sum == num

                    sum = num;
                    pieces++;
                }else {
                    sum += num;
                }
            }
            if (pieces > m){
                start = mid + 1;
            }else {
                end = mid;
            }

        }
        return end; // here start == end
    }
}
