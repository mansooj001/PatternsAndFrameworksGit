package Assignments.Assignment1.Scenario3;

/**
 * Created by jason on 12/11/2016.
 */
class ProxyImage implements Image{
    private RealImage realImage;
    private final String fileName;

    ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
