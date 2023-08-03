package Linear_Searchc;

public class Search_In_Range_03 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,4,8,9,7,5};
        int ans = search(arr,9,0,6);
        System.out.println(ans);

    }

    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start; i <=end ; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }

        }
        return -1;
    }
}
