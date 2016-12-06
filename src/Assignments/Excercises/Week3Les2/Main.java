package Assignments.Excercises.Week3Les2;

/**
 * Created by jason on 12/1/2016.
 */
class Main {
    public static void main(String[] args) {
        IDocent pDocent = new PDocent();
        IDocent hfDocent = new HFDocent();
        IStudent sneStudent = new SNE();
        IStudent sieStudent = new SIE();
        IStudent tiStudent = new TI();

        System.out.println(pDocent.accept(sneStudent));
        System.out.println(pDocent.accept(sieStudent));
        System.out.println(pDocent.accept(tiStudent));

        System.out.println(hfDocent.accept(sneStudent));
        System.out.println(hfDocent.accept(sieStudent));
        System.out.println(hfDocent.accept(tiStudent));
    }
}
