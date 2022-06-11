package Practice;

public class Finra {

    public static void main(String[] args) {
        System.out.println(finra(8));

    }

    public static String finra(int num){

        String result = "";

       if(num%3==0 && num%5!=0){
           result = "FIN";

        }else if(num%5==0&& num%3!=0){
           result = "RA";
       }else if(num%15==0){
           result = "FINRA";
       }else{
           result = num+" ";
       }
       return result;
    }
}

