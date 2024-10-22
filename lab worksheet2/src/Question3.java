import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner pyramid = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int noOfRows = pyramid.nextInt();

        for(int  i =1; i<=noOfRows;i++){
            for(int j=1; j<=noOfRows-i;j++){
                System.out.print(" ");
            }
            for(int k=1 ; k<=i;k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
