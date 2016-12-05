package Assignments.AdapterPresentatie.Starcraft;

import Assignments.AdapterPresentatie.Adapter.IUnit;

/**
 * Created by jason on 12/1/2016.
 */
public class Marine implements IUnit {
    @Override
    public void attack() {
        System.out.println("Marine firing guns");
    }
}
