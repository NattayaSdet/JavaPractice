package Practice;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("nattaya"));

    }

    public static String reverse(String str){

        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);

        }
        return result;
}

    /*

    public static void main(String[] args) {
        System.out.println(reverse("Nattaya"));
    }
    public static String reverse(String str){
        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed += str.charAt(i);

        }
        return reversed;
    }*/
}
