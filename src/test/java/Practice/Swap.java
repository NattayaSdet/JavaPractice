package Practice;

public class Swap {

    public static void main(String[] args) {
        System.out.println(swap(10,15));

    }
    public static String swap(int x, int y){

        String result = "";

        x=x+y;
        y=x-y;
        x=x-y;
        result = x+" "+y;
        return result;
    }


}
