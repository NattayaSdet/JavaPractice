package Practice;

public class Factorial {

    //5*4*3*2*1 =120

    public static void main(String[] args) {
        System.out.println(factorial(5));

    }
    public static long factorial(int num){

       long result = 1l;
        for (int i = num; i >=1 ; i--) {
            result*=i;

        }
        return result;
    }


}
