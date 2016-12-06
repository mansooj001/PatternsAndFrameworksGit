package Assignments.Excercises.Week3Les2;

/**
 * Created by jason on 11/30/2016.
 */
public class PDocent implements IDocent {
    @Override
    public String accept(IStudent student) {
        return student.visit(this);
    }

    @Override
    public String toString() {
        return "PDocent ";
    }
}
