package activityStarterCode.train;

import comp127graphics.CanvasWindow;
import comp127graphics.Ellipse;
import comp127graphics.Line;
import comp127graphics.Rectangle;

import java.awt.*;


/*
 * File: TrainDrawer.java
 * --------------------
 * This program draws a three-car train consisting on an engine,
 * a boxcar, and a caboose.  This implementation of the program,
 * however, is incomplete, and contains only the methods given
 * in the text.
 */

public class TrainDrawer {

    public static final int SCALE = 1;
    
	/* Private constants */





    // Instance variable for the canvas that you can add shapes to in order to have them be drawn.
    private CanvasWindow canvas;


    public static void main(String[] args) {
        TrainDrawer drawer = new TrainDrawer();
    }

    public TrainDrawer(){
        //Create a window and canvas to draw on
        canvas = new CanvasWindow("Train", 800, 500);
        double trainWidth = 3 * TrainCar.CAR_WIDTH + 4 * TrainCar.CONNECTOR;
        double x = (canvas.getWidth() - trainWidth) / 2;
        double y = canvas.getHeight();
        double dx = TrainCar.CAR_WIDTH + TrainCar.CONNECTOR;
        Engine engine = new Engine(Color.BLACK);
        canvas.add(engine,100,400);

        Boxcar boxcar = new Boxcar(x + dx,y,Color.BLUE);
        canvas.add(boxcar,100 + dx,400);

        Caboose caboose = new Caboose(2*x + dx, y);
        canvas.add(caboose,100 + dx + dx,400);
    }

}