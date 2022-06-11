package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class findSecHighest {

    public static void main(String[] args) {

    }

    public static int findSecHighest(int[] arr){

        ArrayList<Integer> list = new ArrayList<>();

        for (int each:arr) {
            list.add(each);

        }
        int n=2;
        int result = 0;
        int max = Collections.max(list);

        for (int i = 1; i <n ; i++) {
            list.removeIf(p -> p==max);

        }
        result = Collections.max(list);
        return result;
    }
}
