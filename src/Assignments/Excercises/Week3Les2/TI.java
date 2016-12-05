package Assignments.Excercises.Week3Les2;

/**
 * Created by jason on 11/30/2016.
 */
public class TI implements IStudent {
    @Override
    public String ontmoet() {
        return "ontmoet " + this;
    }

    @Override
    public String toString() {
        return "TI student";
    }
}
