package Practice;

public class ArmstrongNum {

    public static void main(String[] args) {
        System.out.println(armStrong(1000));

    }


    public static String armStrong(int num){

        String result = "";
        int digit = 0;
        int temp = num;
        int sum = 0;

        do {
            int value = temp % 10;
            temp /= 10;
            sum += Math.pow(value, digit);
        }while (temp>0);
        if(num==sum){
            result = "This is an Armstrong number";
        }else{
            result = "This is not an Armstrong number";
        }
        return result;
    }


}
