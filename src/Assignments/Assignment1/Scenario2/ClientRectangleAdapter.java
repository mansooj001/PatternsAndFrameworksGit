package Assignments.Assignment1.Scenario2;

/**
 * Created by jason on 12/11/2016.
 */
public class ClientRectangleAdapter implements IShape{
    private ClientRectangle rectangle = new ClientRectangle();

    @Override
    public void display(double x, double y, double w, double h) {
        rectangle.display(x, y, w, h);
    }
}
