package Assignments.salarySystem_bad;

class NormalEmployee implements IEmployee {
    private final String name;
    private double salary;

    public NormalEmployee(String name) {
        this.name = name;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary() {
        salary = salary * 106 + 20000;
        salary = salary / 100;
        System.out.println("Log message: Normal employee " + name + " has new salary: " + salary);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Normal employee " + name + " has salary " + salary;
    }


}
