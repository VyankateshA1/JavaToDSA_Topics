package Arrays;

public class Q01_RangMax {
    public static void main(String[] args) {
        //max value in range.
        int[] arr = {1,2,5,6,9,88,77,66,555};

        System.out.println(maxRange(arr,1,3));

    }
    static int maxRange(int[] arr, int start, int end){

        if (end>start){
            return -1;
        }
        if (arr==null){
            return -1;
        }
      int maxVal = arr[start];
        for (int i = start; i <=end ; i++) {
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }
}
