package Practice;

public class PrimeNumbers {

    //3%1==0, 3%3==0// 3%2!=0...
    public static void main(String[] args) {
        System.out.println(isPrime(5));

    }
    public static boolean isPrime(int num){

        if(num<2){
            return false;
        }else{
            for (int i = 2; i <num ; i++) {
                if(num%i==0){
                    return false;
                }

            }
        }
        return true;
    }
}
