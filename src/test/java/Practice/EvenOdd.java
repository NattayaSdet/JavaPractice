package Practice;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(isEven(5));

    }
    public static String isEven(int num){

        String result ="";
        if(num%2==0){
            result = "is even";
        }else{
            result = "is odd";
        }
        return result;

    }

}
