package Assignments.salarySystem_bad;

/**
 * Created by jason on 12/11/2016.
 */
class SeniorEmployee implements IEmployee {
    private final String name;
    private double salary;

    SeniorEmployee(String name) {
        this.name = name;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void raiseSalary() {
        setSalary(salary * 1.07);
        System.out.println("Log message: employee " + name + " has new salary: " + this.salary);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Senior employee " + name + " has salary " + salary;
    }
}
