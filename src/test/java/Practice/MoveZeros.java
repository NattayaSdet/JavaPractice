 package Practice;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
    int[] arr= {1, 0, 2, 0, 3, 0, 4, 0};
        System.out.println(Arrays.toString(moveZeros(arr)));

    }
    public static int[] moveZeros(int[] arr){

        int[] result = new int[arr.length];
        int i =0;
        for (int each:arr) {
            if(each!=0){
                result[i]+= each;
                i++;
            }

        }
        return result;
    }

}
