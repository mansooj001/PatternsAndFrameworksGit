package Assignments.AdapterPresentatie.Starcraft;

import Assignments.AdapterPresentatie.Adapter.IUnit;
import Assignments.AdapterPresentatie.Nintendo.Sonic;

/**
 * Created by jason on 12/1/2016.
 */
public class SonicAdapter implements IUnit {
    Sonic sonic = new Sonic();

    @Override
    public void attack() {
        sonic.spinAttack();
    }
}
