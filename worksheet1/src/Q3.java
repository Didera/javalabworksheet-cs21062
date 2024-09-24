import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value in Centimeters: ");
        int lengthCenti = input.nextInt();
        int  lengthInch;

        lengthInch = (int) (lengthCenti/2.54);
        int feet = lengthInch/12;

        lengthInch = (lengthInch)%12;

        System.out.println("The Length is " + feet + " feet and " + lengthInch + " inches tall.");





    }
}
