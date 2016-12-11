package Assignments.AdapterPresentatie;

import Assignments.AdapterPresentatie.Adapter.IUnit;
import Assignments.AdapterPresentatie.Starcraft.*;

import java.util.ArrayList;

/**
 * Created by jason on 12/1/2016.
 */
class Main {
    public static void main(String[] args) {
        ArrayList<IUnit> units = new ArrayList<>();
        units.add(new Marine());
        units.add(new Zealot());
        units.add(new Zergling());
        units.add(new MarioAdapter());
        units.add(new SonicAdapter());

        units.forEach(IUnit::attack);
    }
}
