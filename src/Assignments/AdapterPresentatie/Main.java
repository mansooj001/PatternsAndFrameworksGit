package Assignments.AdapterPresentatie;

import Assignments.AdapterPresentatie.Adapter.IUnit;
import Assignments.AdapterPresentatie.Starcraft.SonicAdapter;
import Assignments.AdapterPresentatie.Starcraft.Marine;
import Assignments.AdapterPresentatie.Starcraft.Zealot;
import Assignments.AdapterPresentatie.Starcraft.Zergling;

import java.util.ArrayList;

/**
 * Created by jason on 12/1/2016.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<IUnit> units = new ArrayList<IUnit>();
        units.add(new Marine());
        units.add(new Zealot());
        units.add(new Zergling());
        units.add(new SonicAdapter());

        units.forEach(IUnit::attack);
    }
}
