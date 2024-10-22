
import  java.util.*;

public class Question4 {
    public static void main(String[] args) {
     int[] numbers = new int[5];
        for(int i=0 ; i<5 ; i++){
            System.out.print("Enter the numbers");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
                numbers[i] = number;
        }
        Arrays.sort(numbers);

        for(int i=0 ; i<5 ; i++){
            System.out.println(numbers[i]);
        }

        System.out.print(numbers[3]);
    }
}
