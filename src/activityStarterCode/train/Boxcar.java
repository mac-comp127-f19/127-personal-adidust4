package activityStarterCode.train;

import comp127graphics.Rectangle;

import java.awt.*;

public class Boxcar extends TrainCar {


    /* Dimensions of the door panels on the boxcar */
    public static final double DOOR_WIDTH = 18*SCALE;
    public static final double DOOR_HEIGHT = 32*SCALE;


    public Boxcar(double x, double y, Color color) {
        super(color);

        drawCarFrame(x, y, color);
        double xRight = x + TrainCar.CONNECTOR + TrainCar.CAR_WIDTH / 2;
        double xLeft = xRight - DOOR_WIDTH;
        double yDoor = y - TrainCar.CAR_BASELINE - DOOR_HEIGHT;
        this.add(new comp127graphics.Rectangle(xLeft, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
        this.add(new Rectangle(xRight, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
    }
}
