package readingAssignmentCode;

import java.util.*;

public class R3 {

    public static void main(String[] args){
        System.out.println("Please enter a positive number.");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        Random generator = new Random();
        if (input >= 0){
            int num = generator.nextInt(input);
            System.out.println("Number is: " + num);
        }
    }
}
