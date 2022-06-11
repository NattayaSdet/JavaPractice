package Practice;

public class IntPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));

    }
    public static boolean isPalindrome(int num){

        int reversed = 0;
        while(num!=0){
            int remainder = num%10;
            reversed=reversed*10+remainder;
            num/=10;
            if(reversed==num){
                return true;
            }
        }
        return false;
    }
}
