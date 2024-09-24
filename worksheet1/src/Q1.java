import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        int length;
        loop:
        while (true) {
            System.out.println("Enter the name ");
            text = input.next();
            length = text.length();
            if (length % 2 != 0) {
                break;
            }
            else if (length%2==0) {
                continue loop;
            }
            }
            int midIndex = ((length + 1) / 2) - 1;
            System.out.println("Character of the middle of the word: " + text.charAt(midIndex));
        }
    }
