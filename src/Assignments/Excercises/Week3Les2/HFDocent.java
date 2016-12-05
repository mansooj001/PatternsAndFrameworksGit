package Assignments.Excercises.Week3Les2;

/**
 * Created by jason on 11/30/2016.
 */
public class HFDocent implements IDocent {

    @Override
    public String ontmoet(IStudent student) {
        return this + "ontmoet " + student;
    }

    @Override
    public String toString() {
        return "HFDocent: ";
    }
}
