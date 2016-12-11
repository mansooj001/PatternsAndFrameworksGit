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
        salary = salary * (105 + 10000);
        salary = salary / 100;
        System.out.println("Log message: employee " + name + " has new salary: " + salary);
    }
}
