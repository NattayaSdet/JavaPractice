package Practice;

public class floydTriangle {

    public static void main(String[] args) {

        int noOfRow = 5;
        int value = 1;
        System.out.println("Floy's Triangle: ");

        for (int i = 1; i <= noOfRow ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(value+ " ");
                value++;

            }
            System.out.println();

        }

        }
    }

