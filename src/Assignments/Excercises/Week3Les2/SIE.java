package Assignments.Excercises.Week3Les2;

/**
 * Created by jason on 11/30/2016.
 */
public class SIE implements IStudent {
    @Override
    public String ontmoet() {
        return "ontmoet " + this;
    }

    @Override
    public String toString() {
        return "SIE student";
    }
}
