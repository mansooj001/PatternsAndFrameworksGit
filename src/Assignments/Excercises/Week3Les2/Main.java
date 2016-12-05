package Assignments.Excercises.Week3Les2;

/**
 * Created by jason on 12/1/2016.
 */
public class Main {
    public static void main(String[] args) {
        IDocent pDocent = new PDocent();
        IDocent hfDocent = new HFDocent();
        IStudent sneStudent = new SNE();
        IStudent sieStudent = new SIE();
        IStudent tiStudent = new TI();

        System.out.println(pDocent.ontmoet(sneStudent));
        System.out.println(pDocent.ontmoet(sieStudent));
        System.out.println(pDocent.ontmoet(tiStudent));

        System.out.println(hfDocent.ontmoet(sneStudent));
        System.out.println(hfDocent.ontmoet(sieStudent));
        System.out.println(hfDocent.ontmoet(tiStudent));
    }
}
