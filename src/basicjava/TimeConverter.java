package basicjava;
import java.util.Scanner;

public class TimeConverter {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter hours.");
        int intHours = Integer.valueOf(scan.nextLine());
        System.out.println("Please enter minutes.");
        int intMinutes = Integer.valueOf(scan.nextLine());
        System.out.println("Please enter seconds.");
        int intSeconds = Integer.valueOf(scan.nextLine());
        System.out.println(TimeConverter(intHours, intMinutes, intSeconds));
    }
    public static Integer TimeConverter (int hours, int minutes, int seconds){
        Integer newMinutes = hours * 60 + minutes;
        Integer newSeconds = newMinutes * 60 + seconds;
        return newSeconds;
    }
}
