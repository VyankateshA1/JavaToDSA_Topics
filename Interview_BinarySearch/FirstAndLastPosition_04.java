package Interview_BinarySearch;

public class FirstAndLastPosition_04 {
    public static void main(String[] args) {

        int[] nums={1,2,3,5,5,5,8,9,9,10};
        int target = 9;

        System.out.println();

    }
//     public int[] searchRange(int[] nums, int target) {
//
//        int[] ans = {-1,-1};
//
//        int start = search(nums,target,true);
//
//        int end = search(nums,target,false);
//
//        ans[0]=start;
//        ans[1]=end;
//
//        return ans;

     }
//   public int search(int[] nums,int target, boolean FirstIndex){
//
//            int ans = -1;
//
//            //check for first occurance
//
//            int count=0;
//            int start =0;
//            int end = nums.length;
//
//            while (start<=end){
//                int mid = start+(end-start)/2;
//
//                if (target==9){
//                    count++;
//                }
//                if (target<nums[mid]){
//                    end=mid-1;
//                }else if (target>nums[mid]){
//                    start=mid+1;
//                }else {
//                    ans=mid;
//                    if (FirstIndex == true){
//                        end = mid-1;
//                    }else {
//                        start=mid+1;
//                    }
//                }
//            }
//            return ans;
//    }


//}
