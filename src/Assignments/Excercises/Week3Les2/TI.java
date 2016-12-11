package Assignments.Excercises.Week3Les2;

/**
 * Created by jason on 11/30/2016.
 */
public class TI implements IStudent {
// --Commented out by Inspection START (12/11/2016 18:07):
//    public String visit() {
//        return "accept " + this;
//    }
// --Commented out by Inspection STOP (12/11/2016 18:07)

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
