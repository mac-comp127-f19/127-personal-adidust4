package activityStarterCode.train;

import comp127graphics.Rectangle;

import java.awt.*;

public class Caboose extends TrainCar {

    /* Dimensions of the cupola (the rectangular piece on the top of the caboose) */
    public static final double CUPOLA_WIDTH = 35*SCALE;
    public static final double CUPOLA_HEIGHT = 8*SCALE;


    public Caboose(double x, double y) {
        super(Color.RED);

        drawCarFrame(x,y, Color.RED);
        drawCupola(x,y);
    }

    private void drawCupola(double x, double y) {
        double xLeft = x + TrainCar.CONNECTOR+TrainCar.CAR_WIDTH/2-CUPOLA_WIDTH/2;
        double yTop = y - TrainCar.CAR_BASELINE - TrainCar.CAR_HEIGHT - CUPOLA_HEIGHT;
        comp127graphics.Rectangle cupola = new Rectangle(xLeft, yTop, CUPOLA_WIDTH, CUPOLA_HEIGHT);
        cupola.setFillColor(Color.RED);
        cupola.setFilled(true);
        this.add(cupola);
    }

}
