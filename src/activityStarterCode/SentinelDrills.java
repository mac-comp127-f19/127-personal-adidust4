package activityStarterCode;

import javax.sound.midi.SysexMessage;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class SentinelDrills {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Please enter a number. Enter a negative number to quit.");
        int input = sc.nextInt();
        while(input>=0){
            if (input % 2 == 0){
                System.out.println("The number is even");
            }
            else{
                System.out.println("The number is odd");
            }
            System.out.println("Please enter a number. Enter a negative number to quit.");
            input = sc.nextInt();
        }

        System.out.println("Please enter an integer");
        int number = sc.nextInt();
        int total = 0;
        while(number > 1){
            if (number%2 == 0){
                number/=2;
                total++;
            }
        }
        System.out.println("Your number is divisible by 2, " + total + " times");
    }
}
