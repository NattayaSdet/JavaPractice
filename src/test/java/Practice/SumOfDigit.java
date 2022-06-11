package Practice;

public class SumOfDigit {

    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
    }
    public static int sumDigits(int num){

        int result = 0;
        while(num!=0){
            result+=num%10;
            num/=10;
        }
        return result;
    }

}
