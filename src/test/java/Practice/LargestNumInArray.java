package Practice;

import java.util.Arrays;

public class LargestNumInArray {

    public static void main(String[] args) {
        int[] arr = {23, 12, 56, 47};
        System.out.println(largest(arr));
    }

    public static int largest(int[] arr){

        int largest = 0;
        Arrays.sort(arr);
        largest = arr[arr.length-1];
        return largest;
    }
}
