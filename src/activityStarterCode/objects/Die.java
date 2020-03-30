package activityStarterCode.objects;

import java.awt.*;
import java.util.Random;

public class Die {

    private int value;
    private Color color;

    public Die(){
        this.value = -1;
        this.color = Color.black;
    }

    public void roll(){
        Random generator = new Random();
        this.value = generator.nextInt(5) + 1;
    }

    public int getValue(){
            return this.value;
    }

    @Override
    public String toString(){
        int number = this.value;
        if (number == -1){
            return "not rolled :/";
        }
        else if (number == 1){
            return "one";
        }
        else if (number == 2){
            return "two";
        }
        else if (number == 3){
            return "three";
        }
        else if (number == 4){
            return "four";
        }
        else if (number == 5){
            return "five";
        }
        else{
            return "six";
        }
    }
}
