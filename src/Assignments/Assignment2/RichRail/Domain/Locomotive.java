package Assignments.Assignment2.RichRail.Domain;

import java.util.ArrayList;

/**
 * Created by jason on 12/19/2016.
 */
public class Locomotive {
    private ArrayList<Wagon> wagons;
    private String name;


    public Locomotive() {

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
}
