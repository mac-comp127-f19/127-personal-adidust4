package basicjava;
import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give us one side!");
        String length1 = scan.nextLine();
        Double length1a = Double.valueOf(length1);
        System.out.println("Give us another side!");
        String length2 = scan.nextLine();
        Double length2a = Double.valueOf(length2);
        System.out.println(calculateHypotenuse(length1a, length2a));

    }
    public static double calculateHypotenuse (double length1, double length2){
        return Math.sqrt(Math.pow(length1, 2) + Math.pow(length2, 2));
    }
}
