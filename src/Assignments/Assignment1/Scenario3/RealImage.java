package Assignments.Assignment1.Scenario3;

/**
 * Created by jason on 12/11/2016.
 */
class RealImage implements Image{

    private final String fileName;

    RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
