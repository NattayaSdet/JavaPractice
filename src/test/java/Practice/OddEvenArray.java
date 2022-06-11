package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OddEvenArray {

    public static void main(String[] args) {

        int[] arr = {2,5,8,1,7,3,9,4};
        System.out.println(oddEvenArray(arr));
    }

    public static ArrayList<Integer> oddEvenArray(int[] arr){

        ArrayList<Integer> list = new ArrayList<>();
        for (Integer each :arr) {
            list.add(each);

        }
        ArrayList<Integer> oddList = new ArrayList<>();
        for (Integer each:list) {
            if(list.get(each) == 0){
                list.remove(list.get(each));
            }
            if(list.get(each)%2 !=0){
                oddList.add(list.get(each));

            }

        }

        return oddList;
    }
}