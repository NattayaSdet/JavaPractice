package Practice;

public class ReversedInteger {

    public static void main(String[] args) {
        System.out.println(reversedInteger(1234));
    }
    public static int reversedInteger(int num){

        int result =0;
        while(num!=0){
            int remainder = num%10;
            result=result*10+remainder;
            num/=10;
        }
        return result;
    }
}
