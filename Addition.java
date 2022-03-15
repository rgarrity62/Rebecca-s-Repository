import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        int numberThree;
        int numberFour;
        int sum;
        int diff;

        //Addition
        System.out.print("Enter a number: ");
        numberOne = scnr.nextInt();
        System.out.print("Enter another number: ");
        numberTwo = scnr.nextInt();

        sum = numberOne + numberTwo;
        System.out.println("The sum is: " + sum);

        //sSubtraction
        System.out.print("Enter a number: ");
        numberThree = scnr.nextInt();
        System.out.print("Enter another number: ");
        numberFour = scnr.nextInt();

        diff = numberThree - numberFour;
        System.out.println("The difference is: " + diff);




    }
}