package Practice;

public class FiboString {

    public static void main(String[] args) {
        System.out.println(fibo(8));
    }

    public static String fibo(int num){

        String fibo = "";


        int num1 = 0;
        int num2 = 1;
        for (int i = 2; i < num; i++) {
            int temp = num1+num2;
            fibo+= temp+ " ";
            num1 = num2;
            num2 = temp;

        }
        return fibo;
    }
}
