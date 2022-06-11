package Practice;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibo(60)));
    }

    public static long[] fibo(int num){

       long[] fibo = new long[num];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <num ; i++) {
            fibo[i] = fibo[i-1]+fibo[i-2];

        }
        return fibo;
    }

}
