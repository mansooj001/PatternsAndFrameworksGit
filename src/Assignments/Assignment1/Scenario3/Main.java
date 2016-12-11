package Assignments.Assignment1.Scenario3;

/**
 * Created by jason on 11/29/2016.
 */
class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();

        //image will not be loaded from disk
        image.display();
    }
}
