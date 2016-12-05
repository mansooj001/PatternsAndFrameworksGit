package Assignments.AdapterPresentatie.Starcraft;

import Assignments.AdapterPresentatie.Adapter.IUnit;
import Assignments.AdapterPresentatie.Nintendo.Mario;

/**
 * Created by jason on 12/1/2016.
 */
public class MarioAdapter implements IUnit {
    private final Mario mario = new Mario();


    @Override
    public void attack() {
        mario.jumpAttack();
    }
}
