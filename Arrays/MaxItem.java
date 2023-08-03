package Arrays;

public class MaxItem {
    public static void main(String[] args) {

        int[] arr = {2, 5, 4, 8, 45, 55,66};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
                if (arr[i] > maxval) {
                    maxval = arr[i];
                }
            }
            return maxval;
        }

    }

