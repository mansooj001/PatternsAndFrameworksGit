package Assignments.Excercises.Week3Les2;

/**
 * Created by jason on 11/30/2016.
 */
public class TI implements IStudent {
    @Override
    public String ontmoet() {
        return "accept " + this;
    }

    @Override
    public String toString() {
        return "TI student";
    }
}
