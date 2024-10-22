import java.util.Scanner;

public class Question2 {

    public static int countNumbers(int number){

        if(number==0){
            return 1;
        }
        int count =0 ;
        while(number>0){
            number/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner  word = new Scanner(System.in);
        int input  ;

       do{
            System.out.println("Enter the number ");
            input = word.nextInt();
            int count = countNumbers(input);
           System.out.println(count);
       }while(input>=0);


    }
}
