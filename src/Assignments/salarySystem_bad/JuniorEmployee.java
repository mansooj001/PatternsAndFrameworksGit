package Assignments.salarySystem_bad;

/**
 * Created by jason on 12/11/2016.
 */
class JuniorEmployee implements IEmployee {
    private String name;
    private double salary;

    JuniorEmployee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setSalary(double salary){
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Junior employee " + name + " has salary " + salary;
    }

    @Override
    public void raiseSalary() {
        setSalary(salary * 1.05 + 100);
        System.out.println("Log message: employee " + name + " has new salary: " + this.salary);
    }
}
