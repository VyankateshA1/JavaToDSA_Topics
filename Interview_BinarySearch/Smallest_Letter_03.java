package Interview_BinarySearch;

public class Smallest_Letter_03 {
    public static void main(String[] args) {
//        char[] letter = {'c','f','i','m'};
//        char target = 'i';
//        char ans = search(letter,target);
//        System.out.println(ans);

    }
    static char search(char[] letter,char target){
        int start = 0;
        int end = letter.length-1;
        while (start<=end){
            int mid = start +(end-start)/2;

            if (target>letter[mid]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return letter[start% letter.length];
    }
}
