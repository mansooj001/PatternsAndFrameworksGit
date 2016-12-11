package Assignments.Assignment1.Scenario2;

/**
 * Created by jason on 11/29/2016.
 */
class Main {
    public static void main(String[] args) {
        IShape rectangle = new Rectangle();
        rectangle.display(15.4, 2.1, 5.0,10.0);

        System.out.println();

        rectangle = new ClientRectangleAdapter();
        rectangle.display(5, 6, 10, 2);
    }
}
