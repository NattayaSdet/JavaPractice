package Practice;

import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Nattaya", "Nattaya", "Nattaya"));
        Set<String> s = removeDup(list);
        System.out.println(s);

    }

    public static Set<String> removeDup(ArrayList<String> list){

        Set<String> s =new TreeSet<>(list);
        return s;
    }
}