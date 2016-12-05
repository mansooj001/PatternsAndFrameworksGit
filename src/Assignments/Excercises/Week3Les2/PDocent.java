package Assignments.Excercises.Week3Les2;

/**
 * Created by jason on 11/30/2016.
 */
public class PDocent implements IDocent {
    @Override
    public String ontmoet(IStudent student) {
        return this + student.ontmoet();
    }

    @Override
    public String toString() {
        return "PDocent: ";
    }
}
