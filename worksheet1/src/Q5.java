import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle inCircle = new Circle();
        System.out.print("Enter the radius of the inner circle: ");
        inCircle.setRadius(scanner.nextDouble());
        Circle outCircle = new Circle();
        System.out.print("Enter the radius of the outer circle: ");
        outCircle.setRadius(scanner.nextDouble());

        System.out.println("The area of the inner circle is " + inCircle.computeArea());
        System.out.println("The area of the outer circle is " + outCircle.computeArea());
        System.out.println("The area of the shaded area is " + (outCircle.computeArea() - inCircle.computeArea()));
    }
}