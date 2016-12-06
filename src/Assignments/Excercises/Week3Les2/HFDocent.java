package Assignments.Excercises.Week3Les2;

/**
 * Created by jason on 11/30/2016.
 */
public class HFDocent implements IDocent {

    @Override
    public String accept(IStudent student) {
        return this + student.visit(this);
    }

    @Override
    public String toString() {
        return "HFDocent: ";
    }
}
