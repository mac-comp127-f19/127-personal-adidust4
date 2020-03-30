package activityStarterCode.basicClasses;

import java.util.Random;

/**
 * Represents a random walk along the integer
 * number line starting at some value. At each step it either moves
 * forward or backward by one unit.
 */
public class RandomWalk {
    private Random rng;
    private int currentWalk;
    private int min;
    private int max;


    public RandomWalk(int currentWalk, int min, int max) {
        rng = new Random();
        this.currentWalk = currentWalk;
        this.max = max;
        this.min = min;
    }

    public int getValue() {
        return this.currentWalk;
    }

    public int advanceValue() {
        Random x = new Random();
        boolean randBool = x.nextBoolean();
        if (randBool){
            return this.currentWalk --;
        }
        else{
            return this.currentWalk ++;
        }
    }

}

