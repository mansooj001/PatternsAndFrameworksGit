package Assignments.Assignment2.RichRail;

import java.util.ArrayList;

/**
 * Created by jason on 12/19/2016.
 */
public class Train implements IVehicle {
    private ArrayList<Wagon> wagons;
    IDrawing IDrawing;

    public Train(IDrawing IDrawing) {
        this.IDrawing = IDrawing;
    }

    public void add(Wagon wagon) {
        wagons.add(wagon);
    }


    public void remove(Wagon wagon) {
        wagons.remove(wagon);
    }


    public void remove(int index) {
        wagons.remove(index);
    }


    public Wagon search(int index) {
        return wagons.get(index);
    }


    public ArrayList<Wagon> search(Wagon.WagonType type) {
        ArrayList<Wagon> wagonsWithType = new ArrayList<>();

        for (Wagon w : wagons) {
            if (w.getWagonType().equals(type)){
                wagonsWithType.add(w);
            }
        }
        return wagonsWithType;
    }

    @Override
    public void draw() {
        IDrawing.draw();
    }
}
