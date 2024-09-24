import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        String array[] = new String[3];
        int i = 0;
        StringTokenizer st = new StringTokenizer(fullName, " ");
        while(st.hasMoreTokens()){
            array[i] = st.nextToken();
            i++;
        }
       System.out.println(array[2]+ ", " + array[0] + " "+array[1].charAt(0)+ " .");

    }
}

