package Assignments.Assignment2.RichRail;

/**
 * Created by jason on 12/19/2016.
 */
public class Main {
    public static void main(String[] args) {
        IDrawing d = IDrawingFactory.getDrawing(EGUIType.GUI, EVehicleType.TRAIN);

        Train train = new Train(d);

    }
}
