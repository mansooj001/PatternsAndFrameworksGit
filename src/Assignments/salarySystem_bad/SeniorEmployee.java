package Assignments.salarySystem_bad;

/**
 * Created by jason on 12/11/2016.
 */
class SeniorEmployee implements IEmployee {
    private String name;
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
        salary = salary * 107;
        salary = salary / 100;
        System.out.println("Log message: employee " + name + " has new salary: " + salary);
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
