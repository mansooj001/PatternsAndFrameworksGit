package Assignments.Excercises.Week3Les2;

/**
 * Created by jason on 11/30/2016.
 */
public class SIE implements IStudent {
    @Override
    public String visit(PDocent pDocent) {
        return this + " visit pDocent";
    }

    @Override
    public String toString() {
        return "SIE student";
    }

    @Override
    public String visit(HFDocent hfDocent) {
        return this + "visit hoofddocent";
    }
}
