package Practice;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(25));

    }
    public static String fizzBuzz(int num){

        String result = "";
        if(num%15==0){
            result = "FIZZBUZZ";
        }else if(num%3==0){
            result = "FIZZ";
        }else if(num%5==0){
            result = "BUZZ";
        }else{
            result = num+" ";
        }
        return result;
    }
}
