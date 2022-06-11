package Practice;

public class PyramidOfNumber {
    public static void main(String[] args) {

        int noOfRows = 5;
        int rowCount = 1;
        System.out.println("Here is your pyramid");

        for (int i = noOfRows; i >0 ; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.println(" ");
            }
                for (int  j= 1; j <= rowCount; j++) {
                    System.out.println(rowCount + "");
                    System.out.println();
                    rowCount++;

                }

            }

        }

}
