package Assignments.Assignment1.Scenario2;

/**
 * Created by Jason on 05/12/2016.
 */
class Rectangle implements IShape{

    @Override
    public void display(double x, double y, double w, double h){
        System.out.println("bottom left coordinates: " + x + ',' + y +"\n" +
                "width: " + w + "\n" +
                "height: " + h);
    }

}
