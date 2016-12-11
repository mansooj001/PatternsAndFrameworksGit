package Assignments.salarySystem_bad;

/**
 * Created by jason on 12/11/2016.
 */
public class Main {
    public static void main(String args[]) {
        // raise salary of all employees
        SalarySystem system = new SalarySystem();
        system.printAll();
        IEmployee e = system.search("Jaap");
        system.raiseSalary(e);
        e = system.search("Fred");
        system.raiseSalary(e);
        e = system.search("Hans");
        system.raiseSalary(e);
        system.printAll();
    }
}
