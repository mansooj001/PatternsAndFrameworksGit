package Assignments.Excercises.Week3Les2;

/**
 * Created by jason on 11/30/2016.
 */
public class TI implements IStudent {
    public String visit() {
        return "accept " + this;
    }

    @Override
    public String toString() {
        return "TI student";
    }

    @Override
    public String visit(PDocent pDocent) {
        return null;
    }

    @Override
    public String visit(HFDocent hfDocent) {
        return null;
    }
}
