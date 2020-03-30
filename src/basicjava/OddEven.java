package basicjava;
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number pls");
        int intTyped = Integer.valueOf(scan.nextLine());
        if (isOdd(intTyped)){
            System.out.println("Wow that is Odd!");
        }
//        else{
////            System.out.println("That is Even");
////        }
    }

    public static Boolean isOdd (int integerPicked){
        if (integerPicked%2 == 0){
            return false;
        }
        else{
            return true;
        }
    }
}
