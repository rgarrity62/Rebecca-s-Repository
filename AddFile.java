import java.util.Scanner;

public class AddFile {


        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            int numberOne;
            int numberTwo;
            int sum;

            System.out.print("Enter first number: ");
            numberOne = scnr.nextInt();
            System.out.print("Enter second number: ");
            numberTwo = scnr.nextInt();

            sum = numberOne + numberTwo;
            System.out.println("The sum is: " + sum);


        }

}
