package Linear_Searchc;

public class Find_Min_Number04 {
    public static void main(String[] args) {
        int[] arr = {5,1,55,100,322,2,233,3,};
        System.out.println(min1(arr,0,3));
        System.out.println(min(arr));

    }
    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static int min1(int[] arr,int start, int end){
        int min = arr[start];
        for (int i = start; i <=end; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
